/*
========================================================
TOPIC : INTRODUCTION TO CURSORS
========================================================

Cursor:
A Cursor is a pointer to the result set returned by
a SQL query.

Types of Cursors:

1. Implicit Cursor
   - Automatically created by Oracle

2. Explicit Cursor
   - Created by Programmer

========================================================
*/

/*
========================================================
IMPLICIT CURSOR ATTRIBUTES SUMMARY
========================================================

1. SQL%FOUND
   - Returns TRUE if the last SQL statement
     affected at least one row.
   - Used to check whether a record was found
     or a DML operation was successful.

2. SQL%NOTFOUND
   - Returns TRUE if the last SQL statement
     did not affect any rows.
   - Opposite of SQL%FOUND.

3. SQL%ROWCOUNT
   - Returns the number of rows affected by
     the last SQL statement.
   - Commonly used with INSERT, UPDATE,
     DELETE, and SELECT INTO.

4. SQL%ISOPEN
   - Checks whether the cursor is open.
   - For Implicit Cursors, Oracle automatically
     opens and closes the cursor.
   - Therefore, SQL%ISOPEN always returns FALSE.

========================================================
*/



/*
========================================================
TOPIC : IMPLICIT CURSOR
========================================================
*/

SET SERVEROUTPUT ON;

BEGIN

    UPDATE EMPLOYEES
    SET SALARY = SALARY + 1000
    WHERE EMP_ID = 101;

    DBMS_OUTPUT.PUT_LINE('Rows Updated : ' || SQL%ROWCOUNT);

END;
/

/*
========================================================
OUTPUT
========================================================

Rows Updated : 1

========================================================
*/


/*
========================================================
TOPIC : IMPLICIT CURSOR ATTRIBUTES
========================================================
*/

SET SERVEROUTPUT ON;

BEGIN

    UPDATE EMPLOYEES
    SET SALARY = SALARY + 1000
    WHERE EMP_ID = 101;

    DBMS_OUTPUT.PUT_LINE('Rows Updated : ' || SQL%ROWCOUNT);

    IF SQL%FOUND THEN

        DBMS_OUTPUT.PUT_LINE('Record Found');

    END IF;

END;
/

/*
========================================================
OUTPUT
========================================================

Rows Updated : 1
Record Found

========================================================
*/


/*
========================================================
TOPIC : IMPLICIT CURSOR - SQL%NOTFOUND
========================================================
*/

SET SERVEROUTPUT ON;

BEGIN

    UPDATE EMPLOYEES
    SET SALARY = SALARY + 1000
    WHERE EMP_ID = 999;

    IF SQL%NOTFOUND THEN

        DBMS_OUTPUT.PUT_LINE('Record Not Found');

    END IF;

END;
/

/*
========================================================
OUTPUT
========================================================

Record Not Found

========================================================
*/


/*
========================================================
TOPIC : IMPLICIT CURSOR - SQL%ISOPEN
========================================================
*/

SET SERVEROUTPUT ON;

BEGIN

    UPDATE EMPLOYEES
    SET SALARY = SALARY + 1000
    WHERE EMP_ID = 101;

    IF SQL%ISOPEN THEN

        DBMS_OUTPUT.PUT_LINE('Cursor Open');

    ELSE

        DBMS_OUTPUT.PUT_LINE('Implicit Cursor Closed');

    END IF;

END;
/

/*
========================================================
OUTPUT
========================================================

Implicit Cursor Closed	

========================================================
*/


/*
========================================================
TOPIC : IMPLICIT CURSOR WITH DELETE
========================================================
*/

SET SERVEROUTPUT ON;

BEGIN

    DELETE FROM EMPLOYEES
    WHERE EMP_ID = 104;

    DBMS_OUTPUT.PUT_LINE
    (
        'Rows Deleted : ' || SQL%ROWCOUNT
    );

END;
/

/*
========================================================
OUTPUT
========================================================

Rows Deleted : 1

========================================================
*/


/*
========================================================
TOPIC : IMPLICIT CURSOR WITH INSERT
========================================================
*/

SET SERVEROUTPUT ON;

BEGIN

    INSERT INTO EMPLOYEES
    VALUES
    (
        105,
        'Rohit',
        'IT',
        45000,
        DATE '2024-05-01'
    );

    DBMS_OUTPUT.PUT_LINE
    (
        'Rows Inserted : ' || SQL%ROWCOUNT
    );

END;
/

/*
========================================================
OUTPUT
========================================================

Rows Inserted : 1

========================================================
*/


/*
========================================================
TOPIC : IMPLICIT CURSOR WITH SELECT INTO
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_name EMPLOYEES.EMP_NAME%TYPE;

BEGIN

    SELECT EMP_NAME
    INTO v_name
    FROM EMPLOYEES
    WHERE EMP_ID = 101;

    IF SQL%FOUND THEN

        DBMS_OUTPUT.PUT_LINE
        (
            'Employee Found : ' || v_name
        );

    END IF;

END;
/

/*
========================================================
OUTPUT
========================================================

Employee Found : Anurag

========================================================
*/