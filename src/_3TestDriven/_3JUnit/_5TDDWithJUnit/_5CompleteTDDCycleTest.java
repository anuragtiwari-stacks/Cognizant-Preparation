package _3TestDriven._3JUnit._5TDDWithJUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _5CompleteTDDCycleTest
{
    @Test
    public void completeTDDCycle()
    {
        _1Calculator calculator = new _1Calculator();

        int expected = 20;

        int actual = calculator.add(10, 10);

        assertEquals(expected, actual);

        System.out.println("TDD Cycle Completed Successfully.");
    }
}

/*
===============================================================================
                    COMPLETE TDD CYCLE
===============================================================================

TDD follows three phases.

1.

RED

↓

Write a failing test.

↓

Test Fails.

---------------------------------------------

2.

GREEN

↓

Write the minimum code.

↓

Test Passes.

---------------------------------------------

3.

REFACTOR

↓

Improve the code.

↓

Run tests again.

↓

Tests still PASS.

===============================================================================
Execution
===============================================================================

Write Test

↓

FAIL

↓

Write Code

↓

PASS

↓

Improve Code

↓

PASS

===============================================================================
Console Output
===============================================================================

TDD Cycle Completed Successfully.

BUILD SUCCESSFUL

===============================================================================
Advantages
===============================================================================

• Better Code Quality

• High Test Coverage

• Easy Maintenance

• Cleaner Design

• Fewer Bugs

• Confidence While Refactoring

===============================================================================
Interview Questions
===============================================================================

Q1. What are the three phases of TDD?

Ans:

RED

GREEN

REFACTOR

--------------------------------------------------

Q2. Why should tests be executed after refactoring?

Ans:

To verify that the external behavior
has not changed.

===============================================================================
One-Line Revision
===============================================================================

RED

↓

GREEN

↓

REFACTOR

↓

Repeat

===============================================================================
*/