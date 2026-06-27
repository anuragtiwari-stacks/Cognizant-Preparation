package _3TestDriven._3JUnit._3Annotations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _6DisplayNameTest
{
    @Test
    @DisplayName("Addition Test Using Display Name")
    public void testAddition()
    {
        _1Calculator calculator = new _1Calculator();

        assertEquals(30, calculator.add(10, 20));
    }

    @Test
    @DisplayName("Multiplication Test Using Display Name")
    public void testMultiplication()
    {
        _1Calculator calculator = new _1Calculator();

        assertEquals(25, calculator.multiply(5, 5));
    }
}

/*
=========================================================
What is @DisplayName?
=========================================================

@DisplayName is a JUnit Annotation.

It provides a custom name
for a test method or test class.

Instead of showing

testAddition()

JUnit shows

Addition Test Using Display Name

=========================================================
Why Use It?
=========================================================

• Better Readability

• Easy Reports

• Professional Test Names

• Better Documentation

=========================================================
Execution
=========================================================

JUnit

↓

Reads @DisplayName

↓

Displays Custom Name

↓

Executes Test

=========================================================
JUnit Output
=========================================================

✔ Addition Test Using Display Name

✔ Multiplication Test Using Display Name

=========================================================
Real-Life Example
=========================================================

Instead of writing

EmployeeSalaryCalculationTest

You can display

Employee Salary Calculation Test

which is much easier to read.

=========================================================
Interview Question
=========================================================

Q. What is @DisplayName?

Ans:

@DisplayName is used to provide a custom,
human-readable name for test methods or
test classes.

=========================================================
*/