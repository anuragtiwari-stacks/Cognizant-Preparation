/*
========================================================
TOPIC : USER INPUT USING &
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_name VARCHAR2(50) := '&Enter_Name';

BEGIN

    DBMS_OUTPUT.PUT_LINE('Welcome ' || v_name);

END;
/

/*
========================================================
OUTPUT
========================================================

Enter value for Enter_Name:
Anurag

Welcome Anurag

========================================================
*/

/*
========================================================
TOPIC : USER INPUT NUMBER USING &
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_age NUMBER := &Enter_Age;

BEGIN

    DBMS_OUTPUT.PUT_LINE('Age : ' || v_age);

END;
/

/*
========================================================
OUTPUT
========================================================

Enter value for Enter_Age:
21

Age : 21

========================================================
*/


/*
========================================================
TOPIC : USER INPUT + IF ELSE
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_salary NUMBER := &Enter_Salary;

BEGIN

    IF v_salary >= 50000 THEN

        DBMS_OUTPUT.PUT_LINE('Eligible For Bonus');

    ELSE

        DBMS_OUTPUT.PUT_LINE('Not Eligible For Bonus');

    END IF;

END;
/

/*
========================================================
OUTPUT
========================================================

Enter value for Enter_Salary:
60000

Eligible For Bonus

========================================================
*/


/*
========================================================
TOPIC : USER INPUT + CASE STATEMENT
========================================================
*/

SET SERVEROUTPUT ON;

DECLARE

    v_dept NUMBER := &Enter_Department_Code;

BEGIN

    CASE v_dept

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

Enter value for Enter_Department_Code:
2

HR Department

========================================================
*/


/*
========================================================
TOPIC : USER INPUT USING ACCEPT
========================================================
*/

ACCEPT p_name CHAR PROMPT 'Enter Your Name : '

DECLARE

    v_name VARCHAR2(50) := '&p_name';

BEGIN

    DBMS_OUTPUT.PUT_LINE('Welcome ' || v_name);

END;
/

/*
========================================================
OUTPUT
========================================================

Enter Your Name :
Anurag

Welcome Anurag

========================================================
*/



/*
========================================================
TOPIC : USER INPUT USING ACCEPT (NUMBER)
========================================================
*/

ACCEPT p_marks NUMBER PROMPT 'Enter Your Marks : '

DECLARE

    v_marks NUMBER := &p_marks;

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

Enter Your Marks :
85

Grade B

========================================================
*/