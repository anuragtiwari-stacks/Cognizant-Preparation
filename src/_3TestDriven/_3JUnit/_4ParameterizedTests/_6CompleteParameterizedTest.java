package _3TestDriven._3JUnit._4ParameterizedTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class _6CompleteParameterizedTest
{
    private final _1Calculator calculator = new _1Calculator();

    @ParameterizedTest
    @ValueSource(ints = {10,20,30,40,50})
    public void testPositiveNumbers(int number)
    {
        assertTrue(calculator.isPositive(number));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"Java","JUnit"})
    public void testStringValues(String value)
    {
        if(value == null)
        {
            assertNull(value);
        }
        else if(value.isEmpty())
        {
            assertTrue(value.isEmpty());
        }
        else
        {
            assertFalse(value.isBlank());
        }
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "10,20,30",
                    "25,25,50",
                    "100,200,300"
            })
    public void testAddition(int first,
                             int second,
                             int expected)
    {
        assertEquals(expected,
                calculator.add(first, second));
    }

    @ParameterizedTest
    @MethodSource("additionData")
    public void testAdditionUsingMethodSource(int first,
                                              int second,
                                              int expected)
    {
        assertEquals(expected,
                calculator.add(first, second));
    }

    static Stream<org.junit.jupiter.params.provider.Arguments> additionData()
    {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(5,5,10),
                org.junit.jupiter.params.provider.Arguments.of(40,60,100),
                org.junit.jupiter.params.provider.Arguments.of(75,25,100)
        );
    }
}

/*
===============================================================================
Complete Parameterized Test
===============================================================================

This class demonstrates the most commonly used
Parameterized Test annotations.

• @ValueSource

• @NullAndEmptySource

• @CsvSource

• @MethodSource

===============================================================================
Execution Flow
===============================================================================

JUnit

↓

Read Annotation

↓

Read Input Data

↓

Pass Values

↓

Execute Test

↓

Repeat Until Data Ends

===============================================================================
Order
===============================================================================

@ValueSource

↓

@NullAndEmptySource

↓

@CsvSource

↓

@MethodSource

===============================================================================
Advantages
===============================================================================

• Eliminates Duplicate Tests

• Improves Readability

• Easy Maintenance

• Multiple Inputs

• Better Code Reusability

• Industry Standard

===============================================================================
Real-Life Example
===============================================================================

Suppose an E-Commerce website wants
to test discount calculation.

Without Parameterized Tests

100 Test Methods

With Parameterized Tests

One Test Method

↓

100 Input Values

↓

100 Executions

===============================================================================
Interview Questions
===============================================================================

Q1. Which Parameterized annotation is used most?

Ans:

@ValueSource

--------------------------------------------------

Q2. Which annotation supports multiple parameters?

Ans:

@CsvSource

--------------------------------------------------

Q3. Which annotation supports complex objects?

Ans:

@MethodSource

--------------------------------------------------

Q4. Which annotation is used for null and empty values?

Ans:

@NullAndEmptySource

--------------------------------------------------

Q5. Which annotation executes the same test
multiple times?

Ans:

@ParameterizedTest

===============================================================================
One-Line Revision
===============================================================================

@ParameterizedTest

↓

@ValueSource

↓

@CsvSource

↓

@MethodSource

↓

One Method

↓

Many Inputs

↓

Many Executions

===============================================================================
*/