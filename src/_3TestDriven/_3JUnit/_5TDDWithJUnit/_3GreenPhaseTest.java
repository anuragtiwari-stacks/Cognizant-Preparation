package _3TestDriven._3JUnit._5TDDWithJUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3GreenPhaseTest
{
    @Test
    public void testAddition()
    {
        _1Calculator calculator = new _1Calculator();

        int expected = 10;

        int actual = calculator.add(5, 5);

        assertEquals(expected, actual);
    }
}

/*
===============================================================================
GREEN PHASE
===============================================================================

What is GREEN Phase?

GREEN is the second phase of Test Driven Development (TDD).

After writing a failing test in the RED phase,
the developer writes the MINIMUM amount of code
required to make the test PASS.

Only enough code should be written
to satisfy the current test case.

No extra functionality should be added.

===============================================================================
Execution
===============================================================================

Step 1

Write Failing Test

↓

FAIL

↓

Write Minimum Code

↓

Run Test Again

↓

PASS

↓

GREEN

===============================================================================
Production Code
===============================================================================

public int add(int a, int b)
{
    return a + b;
}

This is enough to make the test pass.

===============================================================================
Output
===============================================================================

Expected : 10

Actual : 10

TEST PASSED

===============================================================================
Advantages
===============================================================================

• Write only required code.

• Prevent unnecessary implementation.

• Faster development.

• Better focus.

===============================================================================
Real-Life Example
===============================================================================

Teacher asks only one question.

Student answers only that question.

Similarly,

During GREEN Phase,
implement only the code required
to pass the current test.

===============================================================================
Interview Questions
===============================================================================

Q1. What is GREEN Phase?

Ans:

GREEN Phase is the stage where the developer
writes the minimum code required
to make the failing test pass.

--------------------------------------------------

Q2. Should extra functionality be added?

Ans:

No.

Only the current requirement
should be implemented.

===============================================================================
One-Line Revision
===============================================================================

GREEN

↓

Write Minimum Code

↓

PASS

===============================================================================
*/