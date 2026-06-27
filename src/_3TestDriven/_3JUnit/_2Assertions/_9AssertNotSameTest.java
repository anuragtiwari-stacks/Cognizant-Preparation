package _3TestDriven._3JUnit._2Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;

public class _9AssertNotSameTest
{
    @Test
    public void testDifferentObjects()
    {
        _1Calculator calculator1 = new _1Calculator();

        _1Calculator calculator2 = new _1Calculator();

        assertNotSame(calculator1, calculator2);
    }
}

/*
=========================================
What is assertNotSame()?
=========================================

assertNotSame() verifies that two references
point to DIFFERENT objects.

-----------------------------------------
Syntax
-----------------------------------------

assertNotSame(expected, actual);

-----------------------------------------
Execution
-----------------------------------------

calculator1

↓

Memory Address

1000

calculator2

↓

Memory Address

2000

↓

Different References

↓

Test PASSED

-----------------------------------------
Output
-----------------------------------------

✔ testDifferentObjects()

BUILD SUCCESSFUL

-----------------------------------------
Interview Point
-----------------------------------------

assertNotSame() compares object references.

-----------------------------------------
Real-Life Example
-----------------------------------------

Two different Employee objects.

=========================================
*/