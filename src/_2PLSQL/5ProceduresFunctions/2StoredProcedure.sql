/*
========================================================
TOPIC : PROCEDURE WITH OUT PARAMETER
========================================================

OUT Parameter
-> Used To Return Value From Procedure

========================================================
*/

CREATE OR REPLACE PROCEDURE get_student_marks(
    p_student_id IN NUMBER,
    p_marks OUT NUMBER
)
IS
BEGIN

    SELECT MARKS
    INTO p_marks
    FROM STUDENTS
    WHERE STUDENT_ID = p_student_id;

END;
/

SET SERVEROUTPUT ON;

DECLARE

    v_marks NUMBER;

BEGIN

    get_student_marks(
        101,
        v_marks
    );

    DBMS_OUTPUT.PUT_LINE(
        'Marks : ' || v_marks
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
TOPIC : OUT PARAMETER - SQUARE OF NUMBER
========================================================
*/

CREATE OR REPLACE PROCEDURE get_square(
    p_num IN NUMBER,
    p_result OUT NUMBER
)
IS
BEGIN

    p_result := p_num * p_num;

END;
/

SET SERVEROUTPUT ON;

DECLARE

    v_result NUMBER;

BEGIN

    get_square(
        5,
        v_result
    );

    DBMS_OUTPUT.PUT_LINE(
        'Square : ' || v_result
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
TOPIC : OUT PARAMETER CALLED MULTIPLE TIMES
========================================================
*/

CREATE OR REPLACE PROCEDURE get_marks(
    p_student_id IN NUMBER,
    p_marks OUT NUMBER
)
IS
BEGIN

    SELECT MARKS
    INTO p_marks
    FROM STUDENTS
    WHERE STUDENT_ID = p_student_id;

END;
/

SET SERVEROUTPUT ON;

DECLARE

    v_marks NUMBER;

BEGIN

    get_marks(101, v_marks);

    DBMS_OUTPUT.PUT_LINE(
        'Marks : ' || v_marks
    );

    get_marks(102, v_marks);

    DBMS_OUTPUT.PUT_LINE(
        'Marks : ' || v_marks
    );

    get_marks(103, v_marks);

    DBMS_OUTPUT.PUT_LINE(
        'Marks : ' || v_marks
    );

END;
/

/*
========================================================
OUTPUT
========================================================

Marks : 85
Marks : 70
Marks : 92

========================================================
*/


/*
========================================================
TOPIC : IN OUT PARAMETER
========================================================

IN OUT Parameter

-> Receives Input
-> Returns Output

========================================================
*/

CREATE OR REPLACE PROCEDURE add_bonus_marks(
    p_marks IN OUT NUMBER
)
IS
BEGIN

    p_marks := p_marks + 5;

END;
/

SET SERVEROUTPUT ON;

DECLARE

    v_marks NUMBER := 80;

BEGIN

    DBMS_OUTPUT.PUT_LINE(
        'Before Procedure : ' || v_marks
    );

    add_bonus_marks(
        v_marks
    );

    DBMS_OUTPUT.PUT_LINE(
        'After Procedure : ' || v_marks
    );

END;
/

/*
========================================================
OUTPUT
========================================================

Before Procedure : 80
After Procedure : 85

v_marks = 80
      |
      V

add_bonus_marks(v_marks)

      |
      V

p_marks = 80

p_marks := p_marks + 5

p_marks = 85

      |
      V

v_marks = 85
========================================================
*/

