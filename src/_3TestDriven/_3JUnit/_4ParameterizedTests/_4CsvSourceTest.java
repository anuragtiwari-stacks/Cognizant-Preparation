package _3TestDriven._3JUnit._4ParameterizedTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _4CsvSourceTest
{
    private final _1Calculator calculator = new _1Calculator();

    @ParameterizedTest
    @CsvSource(
            {
                    "10,20,30",
                    "15,5,20",
                    "50,25,75",
                    "100,200,300"
            })
    public void testAddition(int firstNumber,
                             int secondNumber,
                             int expected)
    {
        assertEquals(expected,
                calculator.add(firstNumber, secondNumber));
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "Anurag,Hello Anurag",
                    "Rahul,Hello Rahul",
                    "Rohan,Hello Rohan"
            })
    public void testGreeting(String name,
                             String expectedGreeting)
    {
        assertEquals(expectedGreeting,
                calculator.getGreeting(name));
    }
}

/*
===============================================================================
What is @CsvSource?
===============================================================================

@CsvSource supplies multiple values
to a Parameterized Test.

CSV means

Comma Separated Values.

Each line represents one execution.

===============================================================================
Syntax
===============================================================================

@ParameterizedTest

@CsvSource
({
    "10,20,30",
    "5,5,10"
})

===============================================================================
Execution
===============================================================================

Input

10 , 20 , 30

↓

firstNumber = 10

secondNumber = 20

expected = 30

↓

PASS

--------------------------------------

Input

15 , 5 , 20

↓

PASS

--------------------------------------

Input

50 , 25 , 75

↓

PASS

--------------------------------------

Input

100 , 200 , 300

↓

PASS

===============================================================================
Console Output
===============================================================================

10 + 20 = 30

15 + 5 = 20

50 + 25 = 75

100 + 200 = 300

BUILD SUCCESSFUL

===============================================================================
Advantages
===============================================================================

• Multiple Parameters

• Multiple Test Cases

• Easy to Read

• Less Code

• Industry Standard

===============================================================================
Real-Life Example
===============================================================================

Employee Salary Test

Employee

↓

Bonus

↓

Expected Salary

Each row represents one employee.

===============================================================================
Interview Questions
===============================================================================

Q1. What is @CsvSource?

Ans:

@CsvSource provides multiple
comma-separated values to
a Parameterized Test.

--------------------------------------

Q2. Why is @CsvSource used?

Ans:

To test methods requiring
multiple input parameters.

--------------------------------------

Q3. What does each row represent?

Ans:

One execution of the test method.

===============================================================================
One-Line Revision
===============================================================================

@CsvSource

↓

Multiple Parameters

↓

One Row

↓

One Test Execution

===============================================================================
*/