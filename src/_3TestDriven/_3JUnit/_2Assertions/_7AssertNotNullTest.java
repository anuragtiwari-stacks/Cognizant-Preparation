package _3TestDriven._3JUnit._2Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class _7AssertNotNullTest
{
    @Test
    public void testCalculatorObject()
    {
        _1Calculator calculator = new _1Calculator();

        assertNotNull(calculator);
    }

    @Test
    public void testCalculatorName()
    {
        _1Calculator calculator = new _1Calculator();

        String actual = calculator.getName();

        assertNotNull(actual);
    }
}

/*
=========================================
What is assertNotNull()?
=========================================

assertNotNull() verifies that an object
reference is NOT null.

If object is not null,
the test PASSES.

Otherwise,
the test FAILS.

-----------------------------------------
Syntax
-----------------------------------------

assertNotNull(object);

-----------------------------------------
Execution
-----------------------------------------

Create Calculator Object

↓

Object Created Successfully

↓

Object != null

↓

Test PASSED

-----------------------------------------
Output
-----------------------------------------

✔ testCalculatorObject()

✔ testCalculatorName()

BUILD SUCCESSFUL

-----------------------------------------
Interview Point
-----------------------------------------

assertNotNull() checks that an object
has been successfully created.

-----------------------------------------
Real-Life Example
-----------------------------------------

After user login,

User object should not be null.

=========================================
*/