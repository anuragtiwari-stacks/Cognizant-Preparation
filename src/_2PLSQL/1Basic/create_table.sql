/*
    EMPLOYEES Table Creation Script
    This table will be used throughout the PL/SQL course.
*/

CREATE TABLE EMPLOYEES
(
    EMP_ID      NUMBER PRIMARY KEY,     -- Unique Employee ID
    EMP_NAME    VARCHAR2(100),          -- Employee Name
    DEPARTMENT  VARCHAR2(50),           -- Department Name
    SALARY      NUMBER(10,2),           -- Employee Salary
    HIRE_DATE   DATE                    -- Date of Joining
);

-- Insert Employee 1
INSERT INTO EMPLOYEES VALUES
(101, 'Anurag', 'IT', 50000, DATE '2024-01-15');

-- Insert Employee 2
INSERT INTO EMPLOYEES VALUES
(102, 'Rahul', 'HR', 45000, DATE '2023-05-10');

-- Insert Employee 3
INSERT INTO EMPLOYEES VALUES
(103, 'Priya', 'Finance', 60000, DATE '2022-08-20');

-- Insert Employee 4
INSERT INTO EMPLOYEES VALUES
(104, 'Amit', 'IT', 55000, DATE '2024-03-12');

COMMIT;

-- Verify Data
SELECT * FROM EMPLOYEES;

-- Verify Structure
DESC EMPLOYEES;