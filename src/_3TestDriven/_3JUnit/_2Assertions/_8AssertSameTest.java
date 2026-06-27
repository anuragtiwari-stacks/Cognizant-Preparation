package _3TestDriven._3JUnit._2Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class _8AssertSameTest
{
    @Test
    public void testSameObject()
    {
        _1Calculator calculator1 = new _1Calculator();

        _1Calculator calculator2 = calculator1;

        assertSame(calculator1, calculator2);
    }
}

/*
=========================================
What is assertSame()?
=========================================

assertSame() verifies that both references
point to the SAME object.

It compares object references,
NOT values.

-----------------------------------------
Syntax
-----------------------------------------

assertSame(expected, actual);

-----------------------------------------
Execution
-----------------------------------------

calculator1

↓

Memory Address

1000

calculator2 = calculator1

↓

Memory Address

1000

↓

Same Reference

↓

Test PASSED

-----------------------------------------
Output
-----------------------------------------

✔ testSameObject()

BUILD SUCCESSFUL

-----------------------------------------
Interview Point
-----------------------------------------

assertSame() compares object references.

It does NOT compare object values.

-----------------------------------------
Real-Life Example
-----------------------------------------

Two variables pointing to the
same Student object.

=========================================
*/