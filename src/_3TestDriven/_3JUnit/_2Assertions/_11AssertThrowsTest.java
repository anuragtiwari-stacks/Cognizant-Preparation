package _3TestDriven._3JUnit._2Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class _11AssertThrowsTest
{
    @Test
    public void testDivideByZero()
    {
        _1Calculator calculator = new _1Calculator();

        assertThrows(ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );
    }
}

/*
=========================================
What is assertThrows()?
=========================================

assertThrows() verifies that
a specific exception is thrown.

-----------------------------------------
Syntax
-----------------------------------------

assertThrows(
        Exception.class,
        () -> method()
);

-----------------------------------------
Execution
-----------------------------------------

divide(10,0)

↓

ArithmeticException

↓

Expected Exception

↓

Test PASSED

-----------------------------------------
Output
-----------------------------------------

✔ testDivideByZero()

BUILD SUCCESSFUL

-----------------------------------------
Interview Point
-----------------------------------------

Used for Exception Testing.

-----------------------------------------
Real-Life Example
-----------------------------------------

Division by zero should throw
ArithmeticException.

=========================================
*/