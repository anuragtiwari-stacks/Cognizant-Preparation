package _3TestDriven._3JUnit._3Annotations;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _4BeforeAllTest
{
    private _1Calculator calculator;

    @BeforeAll
    public static void connectDatabase()
    {
        System.out.println("Database Connected");
    }

    @BeforeEach
    public void setup()
    {
        calculator = new _1Calculator();

        System.out.println("Calculator Object Created");
    }

    @Test
    public void testAddition()
    {
        System.out.println("Addition Test");

        System.out.println(calculator.add(10, 20));
    }

    @Test
    public void testSubtraction()
    {
        System.out.println("Subtraction Test");

        System.out.println(calculator.subtract(20, 10));
    }
}

/*
=========================================================
What is @BeforeAll?
=========================================================

@BeforeAll is a JUnit Lifecycle Annotation.

It executes ONLY ONE TIME
before all test methods.

Purpose

Used for one-time initialization.

Examples

• Database Connection

• Reading Configuration

• Starting Server

• Loading Test Data

=========================================================
Execution
=========================================================

@BeforeAll

↓

Database Connected

↓

@BeforeEach

↓

Addition Test

↓

@BeforeEach

↓

Subtraction Test

=========================================================
Console Output
=========================================================

Database Connected

Calculator Object Created

Addition Test

30

Calculator Object Created

Subtraction Test

10

=========================================================
Important
=========================================================

@BeforeAll method MUST be static.

Reason

It executes before any test object is created.

=========================================================
Interview Question
=========================================================

Q. What is @BeforeAll?

Ans:

@BeforeAll executes once before all test
methods and is generally used for one-time
initialization.

=========================================================
*/