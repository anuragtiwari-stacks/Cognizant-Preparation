/*
========================================================
TOPIC : IF-THEN-ELSE Statement
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_salary NUMBER := 30000;

BEGIN

    IF v_salary > 40000 THEN

        DBMS_OUTPUT.PUT_LINE('High Salary');

    ELSE

        DBMS_OUTPUT.PUT_LINE('Low Salary');

    END IF;

END;
/

/*
========================================================
OUTPUT
========================================================

Low Salary

========================================================
*/