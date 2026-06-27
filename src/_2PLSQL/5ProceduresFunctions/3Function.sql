/*
========================================================
TOPIC : SIMPLE FUNCTION
========================================================

Function
-> Must Return A Value

========================================================
*/

CREATE OR REPLACE FUNCTION get_message
RETURN VARCHAR2
IS
BEGIN

    RETURN 'Welcome Student';

END;
/

SET SERVEROUTPUT ON;

BEGIN

    DBMS_OUTPUT.PUT_LINE(
        get_message
    );

END;
/

/*
========================================================
OUTPUT
========================================================

Welcome Student

========================================================
*/


/*
========================================================
TOPIC : FUNCTION WITH PARAMETER
========================================================
*/

CREATE OR REPLACE FUNCTION square_number(
    p_num NUMBER
)
RETURN NUMBER
IS
BEGIN

    RETURN p_num * p_num;

END;
/

SET SERVEROUTPUT ON;

BEGIN

    DBMS_OUTPUT.PUT_LINE(
        'Square : ' || square_number(5)
    );

END;
/

/*
========================================================
OUTPUT
========================================================

Square : 25

========================================================
*/



/*
========================================================
TOPIC : FUNCTION USING STUDENTS TABLE
========================================================
*/

CREATE OR REPLACE FUNCTION get_student_name(
    p_student_id NUMBER
)
RETURN VARCHAR2
IS

    v_name STUDENTS.STUDENT_NAME%TYPE;

BEGIN

    SELECT STUDENT_NAME
    INTO v_name
    FROM STUDENTS
    WHERE STUDENT_ID = p_student_id;

    RETURN v_name;

END;
/

SET SERVEROUTPUT ON;

BEGIN

    DBMS_OUTPUT.PUT_LINE(
        get_student_name(101)
    );

END;
/

/*
========================================================
OUTPUT
========================================================

Anurag

========================================================
*/

/*
========================================================
TOPIC : FUNCTION RETURNING MARKS
========================================================
*/

CREATE OR REPLACE FUNCTION get_marks(
    p_student_id NUMBER
)
RETURN NUMBER
IS

    v_marks STUDENTS.MARKS%TYPE;

BEGIN

    SELECT MARKS
    INTO v_marks
    FROM STUDENTS
    WHERE STUDENT_ID = p_student_id;

    RETURN v_marks;

END;
/

SET SERVEROUTPUT ON;

BEGIN

    DBMS_OUTPUT.PUT_LINE(
        'Marks : ' || get_marks(101)
    );

END;
/

/*
========================================================
OUTPUT
========================================================

Marks : 85

========================================================
*/

/*
========================================================
PROCEDURE VS FUNCTION
========================================================

PROCEDURE

1. May Not Return Value
2. Uses OUT Parameter
3. Called Using EXEC
4. Performs A Task

FUNCTION

1. Must Return Value
2. Uses RETURN Statement
3. Can Be Used In SQL Queries
4. Used For Calculations

========================================================
*/

-- Procedure -> Do Something

-- Function -> Return Something