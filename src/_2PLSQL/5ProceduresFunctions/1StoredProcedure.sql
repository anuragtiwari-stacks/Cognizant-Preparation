/*Procedure:
A stored PL/SQL program stored inside the database which can be executed whenever required.

========================================================
TOPIC : STORED PROCEDURE
========================================================

Procedure:
A Procedure is a named PL/SQL block stored inside the database.

It performs a task but does not return a value directly.
========================================================
*/

/*
========================================================
STORED PROCEDURE SUMMARY
========================================================

CREATE OR REPLACE
-> Create New Procedure
-> Replace Existing Procedure

IN
-> Input Parameter

EXEC
-> Execute Procedure

IS
-> Variable Declaration Section

BEGIN
-> Executable Section

END
-> End Of Procedure

/
-> Compile Procedure

========================================================
*/








/*
========================================================
TOPIC : STORED PROCEDURE - SIMPLE EXAMPLE
========================================================

Stored Procedure:
A Stored Procedure is a named PL/SQL block
stored inside the database and executed
whenever required.

========================================================
*/

CREATE OR REPLACE PROCEDURE welcome_student
IS
BEGIN

    DBMS_OUTPUT.PUT_LINE('Welcome Student');

END;
/

EXEC welcome_student;

/*
========================================================
OUTPUT
========================================================

Welcome Student

========================================================
*/



/*
========================================================
TOPIC : STORED PROCEDURE USING STUDENTS TABLE
========================================================
*/

CREATE OR REPLACE PROCEDURE show_student
IS

    v_name STUDENTS.STUDENT_NAME%TYPE;

BEGIN

    SELECT STUDENT_NAME
    INTO v_name
    FROM STUDENTS
    WHERE STUDENT_ID = 101;

    DBMS_OUTPUT.PUT_LINE( 'Student Name : ' || v_name);

END;
/

EXEC show_student;

/*
========================================================
OUTPUT
========================================================

Student Name : Anurag

========================================================
*/



/*
========================================================
TOPIC : STORED PROCEDURE WITH IN PARAMETER
========================================================

IN Parameter
-> Used To Pass Input To Procedure

========================================================
*/

CREATE OR REPLACE PROCEDURE show_student_name(
    p_name IN VARCHAR2
)
IS
BEGIN

    DBMS_OUTPUT.PUT_LINE(  'Student Name : ' || p_name);

END;
/

EXEC show_student_name('Anurag');

/*
========================================================
OUTPUT
========================================================

Student Name : Anurag

========================================================
*/



/*
========================================================
TOPIC : STORED PROCEDURE WITH MULTIPLE PARAMETERS
========================================================
*/

CREATE OR REPLACE PROCEDURE student_details(
    p_name IN VARCHAR2,
    p_marks IN NUMBER
)
IS
BEGIN

    DBMS_OUTPUT.PUT_LINE(
        'Student Name : ' || p_name
    );

    DBMS_OUTPUT.PUT_LINE(
        'Student Marks : ' || p_marks
    );

END;
/

EXEC student_details('Anurag', 85);

/*
========================================================
OUTPUT
========================================================

Student Name : Anurag
Student Marks : 85

========================================================
*/


/*
========================================================
TOPIC : REAL WORLD PROCEDURE
========================================================

Find Student Marks Using Student ID

========================================================
*/

CREATE OR REPLACE PROCEDURE get_student_marks(
    p_student_id IN NUMBER
)
IS

    v_marks STUDENTS.MARKS%TYPE;

BEGIN

    SELECT MARKS
    INTO v_marks
    FROM STUDENTS
    WHERE STUDENT_ID = p_student_id;

    DBMS_OUTPUT.PUT_LINE(
        'Marks : ' || v_marks
    );

END;
/

EXEC get_student_marks(101);

/*
========================================================
OUTPUT
========================================================

Marks : 85

========================================================
*/


/*
========================================================
TOPIC : IN PARAMETER USING DECLARE BLOCK
========================================================
*/

CREATE OR REPLACE PROCEDURE show_student_name(
    p_name IN VARCHAR2
)
IS
BEGIN

    DBMS_OUTPUT.PUT_LINE(
        'Student Name : ' || p_name
    );

END;
/

DECLARE

    v_name VARCHAR2(100) := 'Anurag';

BEGIN

    show_student_name(
        v_name
    );

END;
/

/*
========================================================
OUTPUT
========================================================

Student Name : Anurag

========================================================
*/



/*
========================================================
TOPIC : PROCEDURE REUSABILITY
========================================================

One Procedure
Called Multiple Times

========================================================
*/

CREATE OR REPLACE PROCEDURE show_student_name(
    p_student_id IN NUMBER
)
IS

    v_name STUDENTS.STUDENT_NAME%TYPE;

BEGIN

    SELECT STUDENT_NAME
    INTO v_name
    FROM STUDENTS
    WHERE STUDENT_ID = p_student_id;

    DBMS_OUTPUT.PUT_LINE(
        'Student Name : ' || v_name
    );

END;
/

SET SERVEROUTPUT ON;

BEGIN

    show_student_name(101);

    show_student_name(102);

    show_student_name(103);

END;
/

/*
========================================================
OUTPUT
========================================================

Student Name : Anurag
Student Name : Rahul
Student Name : Priya

========================================================
*/