package _3TestDriven._3JUnit._5TDDWithJUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _4RefactorPhaseTest
{
    @Test
    public void testAddition()
    {
        _1Calculator calculator = new _1Calculator();

        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void testAnotherAddition()
    {
        _1Calculator calculator = new _1Calculator();

        assertEquals(100, calculator.add(50, 50));
    }
}

/*
===============================================================================
REFACTOR PHASE
===============================================================================

What is REFACTOR Phase?

REFACTOR is the third phase of Test Driven Development.

After all tests PASS,

the developer improves the code quality
without changing its behavior.

The output must remain exactly the same.

Only the internal implementation
should become cleaner.

===============================================================================
Execution
===============================================================================

RED

↓

FAIL

↓

GREEN

↓

PASS

↓

REFACTOR

↓

Improve Code

↓

Run Test Again

↓

PASS

===============================================================================
Examples of Refactoring
===============================================================================

• Remove duplicate code.

• Improve variable names.

• Improve method names.

• Improve readability.

• Extract methods.

• Add comments.

• Improve performance.

===============================================================================
Important Rule
===============================================================================

Refactoring should NEVER
change the program output.

All existing tests
must continue to PASS.

===============================================================================
Output
===============================================================================

Expected : 10

Actual : 10

PASS

-------------------------

Expected : 100

Actual : 100

PASS

===============================================================================
Advantages
===============================================================================

• Cleaner code.

• Better readability.

• Easy maintenance.

• Easy debugging.

• Better software design.

===============================================================================
Real-Life Example
===============================================================================

Suppose you organize your study table.

Books remain the same.

Only the arrangement improves.

Similarly,

Refactoring improves code quality,
not functionality.

===============================================================================
Interview Questions
===============================================================================

Q1. What is Refactoring?

Ans:

Refactoring is the process of improving
the internal structure of code
without changing its external behavior.

--------------------------------------------------

Q2. Should tests pass after refactoring?

Ans:

Yes.

If a test fails after refactoring,
the behavior has changed.

===============================================================================
One-Line Revision
===============================================================================

REFACTOR

↓

Improve Code

↓

Do Not Change Output

↓

PASS

===============================================================================
*/