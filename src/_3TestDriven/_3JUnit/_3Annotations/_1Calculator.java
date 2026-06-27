package _3TestDriven._3JUnit._3Annotations;

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
}

/*
=========================================================
Calculator Class
=========================================================

This is the Production Code (Business Logic).

JUnit never tests itself.

JUnit always tests another Java class.

This class is called

System Under Test (SUT)

Methods

add()

subtract()

multiply()

divide()

will be tested using JUnit Lifecycle
Annotations.

=========================================================
*/