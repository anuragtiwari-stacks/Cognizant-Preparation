package _3TestDriven._3JUnit._4ParameterizedTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _5MethodSourceTest
{
    private final _1Calculator calculator = new _1Calculator();

    @ParameterizedTest
    @MethodSource("additionData")
    public void testAddition(int firstNumber,
                             int secondNumber,
                             int expected)
    {
        assertEquals(expected,
                calculator.add(firstNumber, secondNumber));
    }

    static Stream<org.junit.jupiter.params.provider.Arguments> additionData()
    {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(10, 20, 30),
                org.junit.jupiter.params.provider.Arguments.of(50, 50, 100),
                org.junit.jupiter.params.provider.Arguments.of(100, 200, 300),
                org.junit.jupiter.params.provider.Arguments.of(25, 75, 100)
        );
    }
}

/*
===============================================================================
What is @MethodSource?
===============================================================================

@MethodSource is a Parameterized Test source
that receives test data from another Java method.

Instead of writing data inside the annotation,
the data is returned by a Java method.

===============================================================================
Why Use @MethodSource?
===============================================================================

Useful when

• Test data is large

• Test data is dynamic

• Objects need to be passed

• Data comes from another method

===============================================================================
Syntax
===============================================================================

@ParameterizedTest

@MethodSource("methodName")

public void test(...)
{
}

===============================================================================
Execution
===============================================================================

JUnit

↓

Calls additionData()

↓

Reads Arguments

↓

Runs Test 1

↓

Runs Test 2

↓

Runs Test 3

↓

Runs Test 4

===============================================================================
Console Output
===============================================================================

10 + 20 = 30

50 + 50 = 100

100 + 200 = 300

25 + 75 = 100

BUILD SUCCESSFUL

===============================================================================
Advantages
===============================================================================

• Supports Complex Data

• Supports Objects

• Easy Maintenance

• Reusable Test Data

• Industry Standard

===============================================================================
Interview Questions
===============================================================================

Q1. What is @MethodSource?

Ans:

@MethodSource provides test data from another
Java method.

--------------------------------------------------

Q2. Why use @MethodSource?

Ans:

To provide complex or reusable test data.

===============================================================================
One-Line Revision
===============================================================================

@MethodSource

↓

Java Method

↓

Arguments

↓

Parameterized Test

===============================================================================
*/