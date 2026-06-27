package _3TestDriven._3JUnit._2Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class _5AssertFalseTest
{
    @Test
    public void testNegativeNumber()
    {
        _1Calculator calculator = new _1Calculator();

        boolean actual = calculator.isNegative(10);

        assertFalse(actual);
    }

    @Test
    public void testAddition()
    {
        _1Calculator calculator = new _1Calculator();

        assertFalse(calculator.add(5, 5) == 100);
    }
}

/*
=========================================
What is assertFalse()?
=========================================

assertFalse() is a JUnit assertion used to verify
that a given condition is FALSE.

If the condition evaluates to false,
the test PASSES.

If the condition evaluates to true,
the test FAILS.

-----------------------------------------
Syntax
-----------------------------------------

assertFalse(condition);

-----------------------------------------
Execution
-----------------------------------------

Step 1

calculator.isNegative(10)

↓

Returns

false

↓

assertFalse(false)

↓

Condition is FALSE

↓

Test PASSED

-----------------------------------------
Output
-----------------------------------------

✔ testNegativeNumber()

✔ testAddition()

BUILD SUCCESSFUL

-----------------------------------------
Interview Point
-----------------------------------------

assertFalse() verifies that a Boolean
expression evaluates to false.

-----------------------------------------
Real-Life Example
-----------------------------------------

Suppose a student should NOT fail.

Marks = 80

Condition

Marks < 40

↓

false

↓

Test PASSED

=========================================
*/