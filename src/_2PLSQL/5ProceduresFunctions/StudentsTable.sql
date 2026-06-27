/*
========================================================
STUDENTS TABLE CREATION
========================================================
*/

CREATE TABLE STUDENTS
(
    STUDENT_ID   NUMBER PRIMARY KEY,
    STUDENT_NAME VARCHAR2(100),
    MARKS        NUMBER
);


/*
========================================================
INSERT SAMPLE DATA
========================================================
*/

INSERT INTO STUDENTS VALUES
(101, 'Anurag', 85);

INSERT INTO STUDENTS VALUES
(102, 'Rahul', 70);

INSERT INTO STUDENTS VALUES
(103, 'Priya', 92);

COMMIT;