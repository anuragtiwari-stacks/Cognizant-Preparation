package _3TestDriven._3JUnit._4ParameterizedTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class _3NullAndEmptySourceTest
{
    @ParameterizedTest
    @NullSource
    public void testNullValue(String value)
    {
        System.out.println("Value : " + value);

        assertTrue(value == null);
    }

    @ParameterizedTest
    @EmptySource
    public void testEmptyValue(String value)
    {
        System.out.println("Value : \"" + value + "\"");

        assertTrue(value.isEmpty());
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testNullAndEmptyValue(String value)
    {
        System.out.println("Value : " + value);

        assertTrue(value == null || value.isEmpty());
    }
}

/*
===============================================================================
What is @NullSource?
===============================================================================

@NullSource supplies a single NULL value
to the Parameterized Test.

Useful for testing null inputs.

===============================================================================
What is @EmptySource?
===============================================================================

@EmptySource supplies an EMPTY value.

Examples

Empty String

Empty Collection

Empty Array

===============================================================================
What is @NullAndEmptySource?
===============================================================================

It combines

@NullSource

+

@EmptySource

JUnit executes the test twice.

1.

null

2.

empty

===============================================================================
Execution
===============================================================================

testNullValue()

↓

Input

null

↓

PASS

--------------------------------------

testEmptyValue()

↓

Input

""

↓

PASS

--------------------------------------

testNullAndEmptyValue()

↓

null

↓

PASS

↓

""

↓

PASS

===============================================================================
Console Output
===============================================================================

Value : null

Value : ""

Value : null

Value : ""

BUILD SUCCESSFUL

===============================================================================
Advantages
===============================================================================

• Tests Null Inputs

• Tests Empty Inputs

• Avoids Duplicate Code

• Improves Test Coverage

===============================================================================
Real-Life Example
===============================================================================

Checking User Name

Input

null

↓

Invalid

------------------------------------

Input

""

↓

Invalid

Both cases should be tested.

===============================================================================
Interview Questions
===============================================================================

Q1. What is @NullSource?

Ans:

It passes a single null value
to a Parameterized Test.

--------------------------------------

Q2. What is @EmptySource?

Ans:

It passes an empty value.

--------------------------------------

Q3. What is @NullAndEmptySource?

Ans:

It combines null and empty
inputs into one test.

===============================================================================
One-Line Revision
===============================================================================

@NullSource

↓

Null Input

--------------------------------------

@EmptySource

↓

Empty Input

--------------------------------------

@NullAndEmptySource

↓

Null + Empty Inputs

===============================================================================
*/