/*
========================================================
TOPIC : UNDERSTANDING EXCEPTIONS IN PL/SQL
========================================================

Exception:
An exception is an error that occurs during the execution
of a PL/SQL program.

Types of Exceptions:

1. Predefined Exceptions
   - NO_DATA_FOUND
   - TOO_MANY_ROWS
   - ZERO_DIVIDE
   - VALUE_ERROR

2. User Defined Exceptions

========================================================
*/


/*
========================================================
TOPIC : PREDEFINED EXCEPTION - ZERO_DIVIDE
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_num1 NUMBER := 100;
    v_num2 NUMBER := 0;
    v_result NUMBER;

BEGIN

    v_result := v_num1 / v_num2;

    DBMS_OUTPUT.PUT_LINE('Result : ' || v_result);

EXCEPTION

    WHEN ZERO_DIVIDE THEN

        DBMS_OUTPUT.PUT_LINE('Error : Division By Zero Not Allowed');

END;
/

/*
========================================================
OUTPUT
========================================================

Error : Division By Zero Not Allowed

========================================================
*/


/*
========================================================
TOPIC : PREDEFINED EXCEPTION - NO_DATA_FOUND
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_name EMPLOYEES.EMP_NAME%TYPE;

BEGIN

    SELECT EMP_NAME
    INTO v_name
    FROM EMPLOYEES
    WHERE EMP_ID = 999;

    DBMS_OUTPUT.PUT_LINE(v_name);

EXCEPTION

    WHEN NO_DATA_FOUND THEN

        DBMS_OUTPUT.PUT_LINE('Employee Not Found');

END;
/

/*
========================================================
OUTPUT
========================================================

Employee Not Found

========================================================
*/


/*
========================================================
TOPIC : PREDEFINED EXCEPTION - TOO_MANY_ROWS
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_name EMPLOYEES.EMP_NAME%TYPE;

BEGIN

    SELECT EMP_NAME
    INTO v_name
    FROM EMPLOYEES;

    DBMS_OUTPUT.PUT_LINE(v_name);

EXCEPTION

    WHEN TOO_MANY_ROWS THEN

        DBMS_OUTPUT.PUT_LINE('Multiple Rows Returned');

END;
/

/*
========================================================
OUTPUT
========================================================

Multiple Rows Returned

========================================================
*/


/*
========================================================
TOPIC : PREDEFINED EXCEPTION - VALUE_ERROR
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_name VARCHAR2(3);

BEGIN

    v_name := 'ANURAG';

    DBMS_OUTPUT.PUT_LINE(v_name);

EXCEPTION

    WHEN VALUE_ERROR THEN

        DBMS_OUTPUT.PUT_LINE('Value Too Large For Variable');

END;
/

/*
========================================================
OUTPUT
========================================================

Value Too Large For Variable

========================================================
*/


/*
========================================================
TOPIC : OTHERS EXCEPTION
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_num NUMBER;

BEGIN

    v_num := 100 / 0;

EXCEPTION

    WHEN OTHERS THEN

        DBMS_OUTPUT.PUT_LINE('Some Error Occurred');

END;
/

/*
========================================================
OUTPUT
========================================================

Some Error Occurred

========================================================
*/
