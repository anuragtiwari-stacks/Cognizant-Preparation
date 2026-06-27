package _3TestDriven._3JUnit._2Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _10AssertArrayEqualsTest
{
    @Test
    public void testArray()
    {
        _1Calculator calculator = new _1Calculator();

        int[] expected = {1, 2, 3, 4, 5};

        int[] actual = calculator.getNumbers();

        assertArrayEquals(expected, actual);
    }
}

/*
=========================================
What is assertArrayEquals()?
=========================================

assertArrayEquals() verifies that two arrays
contain the same elements
in the same order.

-----------------------------------------
Syntax
-----------------------------------------

assertArrayEquals(expected, actual);

-----------------------------------------
Execution
-----------------------------------------

Expected Array

↓

{1,2,3,4,5}

↓

Actual Array

↓

{1,2,3,4,5}

↓

Arrays Equal

↓

Test PASSED

-----------------------------------------
Output
-----------------------------------------

✔ testArray()

BUILD SUCCESSFUL

-----------------------------------------
Interview Point
-----------------------------------------

Used for comparing arrays.

-----------------------------------------
Real-Life Example
-----------------------------------------

Compare expected marks with
actual marks.

=========================================
*/