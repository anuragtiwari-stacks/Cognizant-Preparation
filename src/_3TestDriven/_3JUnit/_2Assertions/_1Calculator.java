package _3TestDriven._3JUnit._2Assertions;

public class _1Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public int subtract(int a, int b)
    {
        return a - b;
    }

    public int multiply(int a, int b)
    {
        return a * b;
    }

    public int divide(int a, int b)
    {
        if(b == 0)
        {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return a / b;
    }

    public String getName()
    {
        return "Calculator";
    }

    public String getNullValue()
    {
        return null;
    }

    public int[] getNumbers()
    {
        return new int[]{1, 2, 3, 4, 5};
    }

    public boolean isPositive(int number)
    {
        return number > 0;
    }

    public boolean isNegative(int number)
    {
        return number < 0;
    }
}