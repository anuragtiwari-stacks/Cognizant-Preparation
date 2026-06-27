/*
========================================================
TOPIC : COMPLETE PACKAGE EXAMPLE
========================================================

Package:
A Package groups related Procedures
and Functions together.

Package = Specification + Body

========================================================
STEP 1 : CREATE TABLE
========================================================
*/

CREATE TABLE COURSES
(
    COURSE_ID NUMBER PRIMARY KEY,
    COURSE_NAME VARCHAR2(100),
    COURSE_FEE NUMBER
);

/*
========================================================
STEP 2 : INSERT DATA
========================================================
*/

INSERT INTO COURSES VALUES
(101, 'Java', 5000);

INSERT INTO COURSES VALUES
(102, 'Python', 6000);

INSERT INTO COURSES VALUES
(103, 'AWS', 8000);

COMMIT;

/*
========================================================
STEP 3 : VERIFY DATA
========================================================
*/

SELECT * FROM COURSES;

/*
OUTPUT

101  Java    5000
102  Python  6000
103  AWS     8000

*/

/*
========================================================
STEP 4 : PACKAGE SPECIFICATION

Only Declaration

Think Of It As Header File

========================================================
*/

CREATE OR REPLACE PACKAGE course_pkg
IS

    PROCEDURE show_course(
        p_course_id IN NUMBER
    );

    FUNCTION get_fee(
        p_course_id IN NUMBER
    )
    RETURN NUMBER;

END course_pkg;
/

/*
OUTPUT

Package Created

*/

/*
========================================================
STEP 5 : PACKAGE BODY

Actual Logic

========================================================
*/

CREATE OR REPLACE PACKAGE BODY course_pkg
IS

    ----------------------------------------------------
    -- Procedure
    ----------------------------------------------------

    PROCEDURE show_course(
        p_course_id IN NUMBER
    )
    IS

        v_course_name VARCHAR2(100);

    BEGIN

        SELECT COURSE_NAME
        INTO v_course_name
        FROM COURSES
        WHERE COURSE_ID = p_course_id;

        DBMS_OUTPUT.PUT_LINE(
            'Course Name : ' || v_course_name
        );

    END show_course;

    ----------------------------------------------------
    -- Function
    ----------------------------------------------------

    FUNCTION get_fee(
        p_course_id IN NUMBER
    )
    RETURN NUMBER
    IS

        v_fee NUMBER;

    BEGIN

        SELECT COURSE_FEE
        INTO v_fee
        FROM COURSES
        WHERE COURSE_ID = p_course_id;

        RETURN v_fee;

    END get_fee;

END course_pkg;
/

/*
OUTPUT

Package Body Created

*/

/*
========================================================
STEP 6 : CALL PACKAGE PROCEDURE

PackageName.ProcedureName

========================================================
*/

SET SERVEROUTPUT ON;

BEGIN

    course_pkg.show_course(
        101
    );

END;
/

/*
OUTPUT

Course Name : Java

*/

/*
========================================================
STEP 7 : CALL PACKAGE FUNCTION

PackageName.FunctionName

========================================================
*/

SET SERVEROUTPUT ON;

BEGIN

    DBMS_OUTPUT.PUT_LINE(
        'Course Fee : ' ||
        course_pkg.get_fee(101)
    );

END;
/

/*
OUTPUT

Course Fee : 5000

*/

/*
========================================================
STEP 8 : REUSABILITY

One Package
Multiple Calls

========================================================
*/

SET SERVEROUTPUT ON;

BEGIN

    course_pkg.show_course(101);

    course_pkg.show_course(102);

    course_pkg.show_course(103);

END;
/

/*
OUTPUT

Course Name : Java

Course Name : Python

Course Name : AWS

*/

/*
========================================================
THEORY
========================================================

Package Specification

-> Contains Declaration

Example

PROCEDURE show_course;

FUNCTION get_fee RETURN NUMBER;

--------------------------------------------------------

Package Body

-> Contains Actual Code

--------------------------------------------------------

Why Use Package?

1. Code Organization

2. Reusability

3. Easy Maintenance

4. Better Performance

5. Security

========================================================
INTERVIEW QUESTIONS
========================================================

Q. What Is A Package?

A Package Is A Database Object
That Groups Related Procedures
And Functions Together.

--------------------------------------------------------

Q. Parts Of Package?

1. Package Specification

2. Package Body

--------------------------------------------------------

Q. Package Specification?

Contains Declaration

--------------------------------------------------------

Q. Package Body?

Contains Implementation

========================================================
*/