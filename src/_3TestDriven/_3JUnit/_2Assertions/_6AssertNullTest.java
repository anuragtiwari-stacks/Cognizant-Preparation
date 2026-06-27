package _3TestDriven._3JUnit._2Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class _6AssertNullTest
{
    @Test
    public void testNullValue()
    {
        _1Calculator calculator = new _1Calculator();

        String actual = calculator.getNullValue();

        assertNull(actual);
    }
}

/*
=========================================
What is assertNull()?
=========================================

assertNull() is a JUnit assertion used to verify
that an object reference is NULL.

If the object is null,
the test PASSES.

If the object is not null,
the test FAILS.

-----------------------------------------
Syntax
-----------------------------------------

assertNull(object);

-----------------------------------------
Execution
-----------------------------------------

Step 1

calculator.getNullValue()

↓

Returns

null

↓

assertNull(null)

↓

Object is NULL

↓

Test PASSED

-----------------------------------------
Output
-----------------------------------------

✔ testNullValue()

BUILD SUCCESSFUL

-----------------------------------------
Interview Point
-----------------------------------------

assertNull() verifies that an object
reference is null.

-----------------------------------------
Real-Life Example
-----------------------------------------

Suppose an employee has not yet been
assigned a manager.

Manager

↓

null

↓

Test PASSED

=========================================
*/