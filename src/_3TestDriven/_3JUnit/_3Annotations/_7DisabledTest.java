package _3TestDriven._3JUnit._3Annotations;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class _7DisabledTest
{
    @Test
    public void testAddition()
    {
        _1Calculator calculator = new _1Calculator();

        System.out.println(calculator.add(10, 20));
    }

    @Test
    @Disabled("Currently Under Development")
    public void testDivision()
    {
        _1Calculator calculator = new _1Calculator();

        System.out.println(calculator.divide(20, 5));
    }
}

/*
=========================================================
What is @Disabled?
=========================================================

@Disabled is a JUnit Annotation.

It temporarily disables a test method
or an entire test class.

Disabled tests are skipped during execution.

=========================================================
Why Use It?
=========================================================

• Feature not completed

• Bug under fixing

• API unavailable

• Database unavailable

• Ignore temporary failing tests

=========================================================
Execution
=========================================================

JUnit

↓

testAddition()

↓

Executed

↓

testDivision()

↓

Skipped

=========================================================
Console Output
=========================================================

30

testDivision() Skipped

=========================================================
Interview Question
=========================================================

Q. What is @Disabled?

Ans:

@Disabled temporarily disables a test
method or class so JUnit skips it during
execution.

=========================================================
*/