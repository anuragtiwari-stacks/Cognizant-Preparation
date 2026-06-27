package _3TestDriven._3JUnit._2Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class _4AssertTrueTest
{
    @Test
    public void testPositiveNumber()
    {
        _1Calculator calculator = new _1Calculator();

        boolean actual = calculator.isPositive(10);

        assertTrue(actual);
    }

    @Test
    public void testAddition()
    {
        _1Calculator calculator = new _1Calculator();

        assertTrue(calculator.add(5, 5) == 10);
    }
}

/*
=========================================
What is assertTrue()?
=========================================

assertTrue() is a JUnit assertion used to verify
that a given condition is TRUE.

If the condition evaluates to true,
the test PASSES.

If the condition evaluates to false,
the test FAILS.

-----------------------------------------
Syntax
-----------------------------------------

assertTrue(condition);

-----------------------------------------
Execution
-----------------------------------------

Step 1

calculator.isPositive(10)

↓

Returns

true

↓

assertTrue(true)

↓

Condition is TRUE

↓

Test PASSED

-----------------------------------------
Output
-----------------------------------------

✔ testPositiveNumber()

✔ testAddition()

BUILD SUCCESSFUL

-----------------------------------------
Interview Point
-----------------------------------------

assertTrue() verifies that a Boolean
expression evaluates to true.

-----------------------------------------
Real-Life Example
-----------------------------------------

Suppose a student passes only if
marks are greater than or equal to 40.

Marks = 75

Condition

75 >= 40

↓

true

↓

Test PASSED

=========================================
*/