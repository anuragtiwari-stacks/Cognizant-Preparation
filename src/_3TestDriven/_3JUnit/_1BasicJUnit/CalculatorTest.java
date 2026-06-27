package _3TestDriven._3JUnit._1BasicJUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest
{
    @Test
    public void testAddition()
    {
        Calculator calculator = new Calculator();

        int expected = 10;

        int actual = calculator.add(5, 5);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtraction()
    {
        Calculator calculator = new Calculator();

        int expected = 5;

        int actual = calculator.subtract(10, 5);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplication()
    {
        Calculator calculator = new Calculator();

        int expected = 20;

        int actual = calculator.multiply(4, 5);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivision()
    {
        Calculator calculator = new Calculator();

        int expected = 5;

        int actual = calculator.divide(25, 5);

        assertEquals(expected, actual);
    }
}