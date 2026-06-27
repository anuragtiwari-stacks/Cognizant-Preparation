package _3TestDriven._3JUnit._5TDDWithJUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2RedPhaseTest
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
RED PHASE
===============================================================================

What is RED Phase?

RED is the first phase of
Test Driven Development (TDD).

In this phase,

we write the TEST FIRST.

There is no implementation
or the implementation is incomplete.

Because the feature does not exist yet,

the test FAILS.

===============================================================================
TDD Cycle
===============================================================================

RED

↓

GREEN

↓

REFACTOR

===============================================================================
Execution
===============================================================================

Step 1

Developer writes the test.

↓

@Test

public void testAddition()

↓

Run Test

↓

Calculator class is incomplete

↓

Test FAILS

↓

RED

===============================================================================
Example
===============================================================================

Suppose Calculator.java

public class _1Calculator
{

}

Now execute

calculator.add(5,5)

↓

Method does not exist.

↓

Compilation Error

OR

Method returns wrong value.

↓

Test FAILED

===============================================================================
Why RED Phase?
===============================================================================

The RED phase ensures that

the test is capable of detecting failures.

If the test never fails,

it cannot verify whether
our code is correct.

===============================================================================
Output
===============================================================================

Expected

10

Actual

Compilation Error

OR

0

↓

TEST FAILED

===============================================================================
Advantages
===============================================================================

• Think Before Coding

• Better Software Design

• Prevents Unnecessary Code

• Ensures Test Coverage

• Finds Bugs Early

===============================================================================
Real-Life Example
===============================================================================

Teacher prepares the question paper
before students write the exam.

Similarly,

Developer writes the Test

before writing the Code.

===============================================================================
Interview Questions
===============================================================================

Q1. What is the first phase of TDD?

Ans:

RED Phase.

--------------------------------------------------

Q2. What happens during the RED phase?

Ans:

Developers write a failing test
before writing the actual code.

--------------------------------------------------

Q3. Why should the test fail?

Ans:

Because the feature has not yet been
implemented.

===============================================================================
One-Line Revision
===============================================================================

RED

↓

Write Test

↓

Run Test

↓

FAIL

===============================================================================
*/