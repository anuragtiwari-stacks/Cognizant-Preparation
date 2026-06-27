package _3TestDriven._3JUnit._2Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class _3AssertNotEqualsTest
{
    @Test
    public void testAddition()
    {
        _1Calculator calculator = new _1Calculator();

        int expected = 100;

        int actual = calculator.add(5, 5);

        assertNotEquals(expected, actual);
    }

    @Test
    public void testSubtraction()
    {
        _1Calculator calculator = new _1Calculator();

        int expected = 50;

        int actual = calculator.subtract(10, 5);

        assertNotEquals(expected, actual);
    }
}

/*
=========================================
What is assertNotEquals()?
=========================================

assertNotEquals() is a JUnit assertion used to verify
that the expected value and actual value are NOT equal.

If both values are different,
the test PASSES.

If both values are same,
the test FAILS.

-----------------------------------------
Syntax
-----------------------------------------

assertNotEquals(expected, actual);

-----------------------------------------
Execution
-----------------------------------------

Step 1

Calculator.add(5,5)

↓

Returns

10

↓

Expected Value

100

↓

Compare

100 != 10

↓

Condition is TRUE

↓

Test PASSED

-----------------------------------------
Output
-----------------------------------------

✔ testAddition()

✔ testSubtraction()

BUILD SUCCESSFUL

-----------------------------------------
Interview Point
-----------------------------------------

assertNotEquals() verifies that two values
are different.

-----------------------------------------
Real-Life Example
-----------------------------------------

Suppose a student should NOT score 0 marks.

Expected

0

Actual

85

Since

0 != 85

The test PASSES.

=========================================
*/