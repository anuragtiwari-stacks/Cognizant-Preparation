package _3TestDriven._3JUnit._2Assertions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2AssertEqualsTest
{
    @Test
    public void testAddition()
    {
        _1Calculator calculator = new _1Calculator();

        int expected = 10;

        int actual = calculator.add(5, 5);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtraction()
    {
        _1Calculator calculator = new _1Calculator();

        int expected = 5;

        int actual = calculator.subtract(10, 5);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplication()
    {
        _1Calculator calculator = new _1Calculator();

        int expected = 20;

        int actual = calculator.multiply(4, 5);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivision()
    {
        _1Calculator calculator = new _1Calculator();

        int expected = 5;

        int actual = calculator.divide(25, 5);

        assertEquals(expected, actual);
    }
}


/*
What is assertEquals()?
assertEquals() is the most commonly used assertion in JUnit.
It verifies whether the expected value and the actual value are equal.

If both values are equal, the test passes.
If they are different, the test fails.
*/