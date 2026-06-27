/*
========================================================
TOPIC : IF-THEN-ELSIF-ELSE Statement
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_marks NUMBER := 75;

BEGIN

    IF v_marks >= 90 THEN

        DBMS_OUTPUT.PUT_LINE('Grade A');

    ELSIF v_marks >= 75 THEN

        DBMS_OUTPUT.PUT_LINE('Grade B');

    ELSIF v_marks >= 60 THEN

        DBMS_OUTPUT.PUT_LINE('Grade C');

    ELSE

        DBMS_OUTPUT.PUT_LINE('Fail');

    END IF;

END;
/

/*
========================================================
OUTPUT
========================================================

Grade B

========================================================
*/