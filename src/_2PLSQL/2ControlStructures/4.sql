/*
========================================================
TOPIC : CASE Statement
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_department VARCHAR2(20) := 'IT';

BEGIN

    CASE v_department

        WHEN 'IT' THEN
            DBMS_OUTPUT.PUT_LINE('Information Technology');

        WHEN 'HR' THEN
            DBMS_OUTPUT.PUT_LINE('Human Resources');

        WHEN 'Finance' THEN
            DBMS_OUTPUT.PUT_LINE('Finance Department');

        ELSE
            DBMS_OUTPUT.PUT_LINE('Unknown Department');

    END CASE;

END;
/

/*
========================================================
OUTPUT
========================================================

Information Technology

========================================================
*/


/*
========================================================
TOPIC : CASE Statement - Department Code
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_dept_code NUMBER := 2;

BEGIN

    CASE v_dept_code

        WHEN 1 THEN
            DBMS_OUTPUT.PUT_LINE('IT Department');

        WHEN 2 THEN
            DBMS_OUTPUT.PUT_LINE('HR Department');

        WHEN 3 THEN
            DBMS_OUTPUT.PUT_LINE('Finance Department');

        ELSE
            DBMS_OUTPUT.PUT_LINE('Invalid Department');

    END CASE;

END;
/

/*
========================================================
OUTPUT
========================================================

HR Department

========================================================
*/



/*
========================================================
TOPIC : CASE Statement - Single Condition
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_salary NUMBER := 60000;

BEGIN

    CASE

        WHEN v_salary > 50000 THEN
            DBMS_OUTPUT.PUT_LINE('Eligible for Bonus');

        ELSE
            DBMS_OUTPUT.PUT_LINE('Not Eligible for Bonus');

    END CASE;

END;
/

/*
========================================================
OUTPUT
========================================================

Eligible for Bonus

========================================================
*/