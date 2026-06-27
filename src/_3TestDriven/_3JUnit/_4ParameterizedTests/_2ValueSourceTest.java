package _3TestDriven._3JUnit._4ParameterizedTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class _2ValueSourceTest
{
    private final _1Calculator calculator = new _1Calculator();

    @ParameterizedTest
    @ValueSource(ints = {10, 20, 30, 40, 50})
    public void testPositiveNumbers(int number)
    {
        assertTrue(calculator.isPositive(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    public void testEvenNumbers(int number)
    {
        assertTrue(calculator.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(strings =
            {
                    "Anurag",
                    "Rahul",
                    "Rohan",
                    "Amit"
            })
    public void testGreeting(String name)
    {
        System.out.println(calculator.getGreeting(name));
    }
}

/*
===============================================================================
What is @ParameterizedTest?
===============================================================================

@ParameterizedTest is a JUnit annotation that executes
the same test method multiple times using different
input values.

Instead of writing multiple @Test methods,
one Parameterized Test is enough.

===============================================================================
What is @ValueSource?
===============================================================================

@ValueSource provides input values directly
to the Parameterized Test.

JUnit automatically executes the test method
once for every value.

===============================================================================
Syntax
===============================================================================

@ParameterizedTest

@ValueSource(ints = {10,20,30})

public void test(int number)
{
    ...
}

===============================================================================
Execution
===============================================================================

JUnit Reads

10

↓

Calls

testPositiveNumbers(10)

↓

PASS

---------------------------------------

JUnit Reads

20

↓

Calls

testPositiveNumbers(20)

↓

PASS

---------------------------------------

JUnit Reads

30

↓

Calls

testPositiveNumbers(30)

↓

PASS

---------------------------------------

JUnit Reads

40

↓

Calls

testPositiveNumbers(40)

↓

PASS

---------------------------------------

JUnit Reads

50

↓

Calls

testPositiveNumbers(50)

↓

PASS

===============================================================================
Console Output
===============================================================================

Hello Anurag

Hello Rahul

Hello Rohan

Hello Amit

All Tests Passed

===============================================================================
Supported Data Types
===============================================================================

@ValueSource supports

• int

• long

• short

• byte

• float

• double

• char

• boolean

• String

• Class

===============================================================================
Advantages
===============================================================================

• Less Code

• No Duplicate Test Methods

• Better Readability

• Easy Maintenance

• Industry Standard

===============================================================================
Real-Life Example
===============================================================================

Suppose a teacher wants to check
whether multiple students have passed.

Without Parameterized Test

Student 1

↓

Student 2

↓

Student 3

↓

Student 4

Separate Tests

---------------------------------------

With Parameterized Test

One Test Method

↓

Student 1

↓

Student 2

↓

Student 3

↓

Student 4

Automatically

===============================================================================
Interview Questions
===============================================================================

Q1. What is @ParameterizedTest?

Ans:

It allows the same test method to execute
multiple times using different input values.

--------------------------------------------------

Q2. What is @ValueSource?

Ans:

It provides input values directly to
a Parameterized Test.

--------------------------------------------------

Q3. Which annotation is required
for Parameterized Tests?

Ans:

@ParameterizedTest

--------------------------------------------------

Q4. Can @ValueSource pass Strings?

Ans:

Yes.

--------------------------------------------------

Q5. Can @ValueSource pass Integers?

Ans:

Yes.

===============================================================================
One-Line Revision
===============================================================================

@ParameterizedTest

↓

One Test Method

↓

Multiple Inputs

↓

Multiple Executions

===============================================================================
*/