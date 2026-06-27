/*
    Topic:
    1. Declaring Variables
    2. Data Types in PL/SQL
    3. Assigning Values to Variables
*/

-- Enable Output Screen
SET SERVEROUTPUT ON;

DECLARE

    ------------------------------------------------------------------
    -- NUMBER Data Type
    ------------------------------------------------------------------
    v_emp_id NUMBER := 101;

    ------------------------------------------------------------------
    -- VARCHAR2 Data Type
    ------------------------------------------------------------------
    v_emp_name VARCHAR2(100) := 'Anurag';

    ------------------------------------------------------------------
    -- NUMBER with Precision and Scale
    ------------------------------------------------------------------
    v_salary NUMBER(10,2) := 50000.50;

    ------------------------------------------------------------------
    -- DATE Data Type
    ------------------------------------------------------------------
    v_hire_date DATE := DATE '2024-01-15';

    ------------------------------------------------------------------
    -- BOOLEAN Data Type
    ------------------------------------------------------------------
    v_is_active BOOLEAN := TRUE;

    ------------------------------------------------------------------
    -- Variable Declaration without Value
    ------------------------------------------------------------------
    v_bonus NUMBER;

BEGIN

    ------------------------------------------------------------------
    -- Assign Value using Assignment Operator :=
    ------------------------------------------------------------------
    v_bonus := v_salary * 0.10;

    ------------------------------------------------------------------
    -- Display Variable Values
    ------------------------------------------------------------------
    DBMS_OUTPUT.PUT_LINE('Employee ID      : ' || v_emp_id);

    DBMS_OUTPUT.PUT_LINE('Employee Name    : ' || v_emp_name);

    DBMS_OUTPUT.PUT_LINE('Employee Salary  : ' || v_salary);

    DBMS_OUTPUT.PUT_LINE('Hire Date        : ' || v_hire_date);

    DBMS_OUTPUT.PUT_LINE('Employee Bonus   : ' || v_bonus);

    ------------------------------------------------------------------
    -- Boolean Check
    ------------------------------------------------------------------
    IF v_is_active THEN

        DBMS_OUTPUT.PUT_LINE('Employee Status  : Active');

    END IF;

END;
/