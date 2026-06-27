package _3TestDriven._3JUnit._4ParameterizedTests;

public class _1Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public boolean isPositive(int number)
    {
        return number > 0;
    }

    public boolean isEven(int number)
    {
        return number % 2 == 0;
    }

    public String getGreeting(String name)
    {
        return "Hello " + name;
    }
}

/*
===============================================================================
Calculator Class
===============================================================================

This class is the System Under Test (SUT).

It contains the business logic that will be tested using
Parameterized Tests.

Methods

add()

isPositive()

isEven()

getGreeting()

These methods will be tested using different input values.

===============================================================================
Interview Point
===============================================================================

Q. What is a System Under Test (SUT)?

Ans:

The actual class or method being tested by JUnit
is called the System Under Test (SUT).

===============================================================================
*/