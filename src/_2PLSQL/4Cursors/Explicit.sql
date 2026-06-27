/*
========================================================
EXPLICIT CURSOR ATTRIBUTES SUMMARY
========================================================

1. c_emp%FOUND
   -> TRUE if FETCH returned a row

2. c_emp%NOTFOUND
   -> TRUE if FETCH did not return a row

3. c_emp%ROWCOUNT
   -> Number of rows fetched so far


%ROWTYPE  -> Stores one complete row

%ROWCOUNT -> Counts how many rows have been fetched


4. c_emp%ISOPEN
   -> TRUE if cursor is open

========================================================
*/


/*
========================================================
TOPIC : OPEN FETCH CLOSE
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    CURSOR c_emp IS
    SELECT EMP_ID, EMP_NAME
    FROM EMPLOYEES;

    v_id EMPLOYEES.EMP_ID%TYPE;
    v_name EMPLOYEES.EMP_NAME%TYPE;

BEGIN

    OPEN c_emp;

    FETCH c_emp INTO v_id, v_name;

    DBMS_OUTPUT.PUT_LINE
    (
        v_id || ' - ' || v_name
    );

    CLOSE c_emp;

END;
/

/*
========================================================
OUTPUT
========================================================

101 - Anurag

========================================================
*/


/*
========================================================
TOPIC : FETCH ALL RECORDS USING LOOP
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    CURSOR c_emp IS
    SELECT EMP_ID, EMP_NAME
    FROM EMPLOYEES;

    v_id EMPLOYEES.EMP_ID%TYPE;
    v_name EMPLOYEES.EMP_NAME%TYPE;

BEGIN

    OPEN c_emp;

    LOOP

        FETCH c_emp INTO v_id, v_name;

        EXIT WHEN c_emp%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE
        (
            v_id || ' - ' || v_name
        );

    END LOOP;

    CLOSE c_emp;

END;
/

/*
========================================================
OUTPUT
========================================================

101 - Anurag
102 - Rahul
103 - Priya
104 - Amit

========================================================
*/


/*
========================================================
TOPIC : CURSOR ATTRIBUTE - %FOUND
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    CURSOR c_emp IS
    SELECT *
    FROM EMPLOYEES;

    v_emp EMPLOYEES%ROWTYPE;

BEGIN

    OPEN c_emp;

    FETCH c_emp INTO v_emp;

    IF c_emp%FOUND THEN

        DBMS_OUTPUT.PUT_LINE('Record Found');

    END IF;

    CLOSE c_emp;

END;
/

/*
========================================================
OUTPUT
========================================================

Record Found

========================================================
*/



/*
========================================================
TOPIC : CURSOR ATTRIBUTE - %NOTFOUND
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    CURSOR c_emp IS
    SELECT *
    FROM EMPLOYEES
    WHERE EMP_ID = 999;

    v_emp EMPLOYEES%ROWTYPE;

BEGIN

    OPEN c_emp;

    FETCH c_emp INTO v_emp;

    IF c_emp%NOTFOUND THEN

        DBMS_OUTPUT.PUT_LINE('Record Not Found');

    END IF;

    CLOSE c_emp;

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
TOPIC : CURSOR ATTRIBUTE - %ROWCOUNT
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    CURSOR c_emp IS
    SELECT *
    FROM EMPLOYEES;

    v_emp EMPLOYEES%ROWTYPE;

BEGIN

    OPEN c_emp;

    FETCH c_emp INTO v_emp;

    DBMS_OUTPUT.PUT_LINE
    (
        'Rows Fetched : ' || c_emp%ROWCOUNT
    );

    CLOSE c_emp;

END;
/

/*
========================================================
OUTPUT
========================================================

Rows Fetched : 1

========================================================
*/



/*
========================================================
TOPIC : CURSOR ATTRIBUTE - %ISOPEN
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    CURSOR c_emp IS
    SELECT *
    FROM EMPLOYEES;

BEGIN

    OPEN c_emp;

    IF c_emp%ISOPEN THEN

        DBMS_OUTPUT.PUT_LINE('Cursor Is Open');

    END IF;

    CLOSE c_emp;

END;
/

/*
========================================================
OUTPUT
========================================================

Cursor Is Open

========================================================
*/


/*
========================================================
TOPIC : CURSOR FOR LOOP
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    CURSOR c_emp IS
    SELECT *
    FROM EMPLOYEES;

BEGIN

    FOR emp_rec IN c_emp LOOP

        DBMS_OUTPUT.PUT_LINE
        (
            emp_rec.EMP_ID || ' - ' ||
            emp_rec.EMP_NAME
        );

    END LOOP;

END;
/

/*
========================================================
OUTPUT
========================================================

101 - Anurag
102 - Rahul
103 - Priya
104 - Amit

========================================================
*/