package _3TestDriven._3JUnit._2Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class _12AssertDoesNotThrowTest
{
    @Test
    public void testDivision()
    {
        _1Calculator calculator = new _1Calculator();

        assertDoesNotThrow(
                () -> calculator.divide(20, 5)
        );
    }
}

/*
=========================================
What is assertDoesNotThrow()?
=========================================

assertDoesNotThrow() verifies that
a block of code executes
without throwing any exception.

-----------------------------------------
Syntax
-----------------------------------------

assertDoesNotThrow(
        () -> method()
);

-----------------------------------------
Execution
-----------------------------------------

divide(20,5)

↓

Returns

4

↓

No Exception

↓

Test PASSED

-----------------------------------------
Output
-----------------------------------------

✔ testDivision()

BUILD SUCCESSFUL

-----------------------------------------
Interview Point
-----------------------------------------

Used to verify that code executes
without any exception.

-----------------------------------------
Real-Life Example
-----------------------------------------

Valid login credentials
should not throw an exception.

=========================================
*/