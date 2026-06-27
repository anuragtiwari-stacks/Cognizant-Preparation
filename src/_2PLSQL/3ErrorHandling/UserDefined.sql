/*
========================================================
TOPIC : USER DEFINED EXCEPTION
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_age NUMBER := 15;

    ex_invalid_age EXCEPTION;

BEGIN

    IF v_age < 18 THEN

        RAISE ex_invalid_age;

    END IF;

    DBMS_OUTPUT.PUT_LINE('Eligible');

EXCEPTION

    WHEN ex_invalid_age THEN

        DBMS_OUTPUT.PUT_LINE('Age Must Be 18 Or Above');

END;
/

/*
========================================================
OUTPUT
========================================================

Age Must Be 18 Or Above

========================================================
*/


/*
========================================================
TOPIC : USER DEFINED EXCEPTION WITH USER INPUT
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_marks NUMBER := &Enter_Marks;

    ex_fail EXCEPTION;

BEGIN

    IF v_marks < 40 THEN

        RAISE ex_fail;

    END IF;

    DBMS_OUTPUT.PUT_LINE('Pass');

EXCEPTION

    WHEN ex_fail THEN

        DBMS_OUTPUT.PUT_LINE('Student Failed');

END;
/

/*
========================================================
OUTPUT
========================================================

Enter value for Enter_Marks:
35

Student Failed

========================================================
*/



/*
========================================================
TOPIC : SQLCODE AND SQLERRM
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_num NUMBER;

BEGIN

    v_num := 100 / 0;

EXCEPTION

    WHEN OTHERS THEN

        DBMS_OUTPUT.PUT_LINE('Error Code : ' || SQLCODE);
        DBMS_OUTPUT.PUT_LINE('Error Message : ' || SQLERRM);

END;
/

/*
========================================================
OUTPUT
========================================================

Error Code : -1476
Error Message : ORA-01476: divisor is equal to zero

========================================================
*/