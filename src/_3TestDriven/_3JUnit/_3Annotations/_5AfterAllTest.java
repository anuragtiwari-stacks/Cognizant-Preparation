package _3TestDriven._3JUnit._3Annotations;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _5AfterAllTest
{
    private _1Calculator calculator;

    @BeforeAll
    public static void startApplication()
    {
        System.out.println("Application Started");
    }

    @BeforeEach
    public void setup()
    {
        calculator = new _1Calculator();

        System.out.println("Calculator Ready");
    }

    @Test
    public void testMultiplication()
    {
        System.out.println("Multiplication Test");

        System.out.println(calculator.multiply(5, 5));
    }

    @Test
    public void testDivision()
    {
        System.out.println("Division Test");

        System.out.println(calculator.divide(20, 5));
    }

    @AfterAll
    public static void closeApplication()
    {
        System.out.println("Application Closed");
    }
}

/*
=========================================================
What is @AfterAll?
=========================================================

@AfterAll is a JUnit Lifecycle Annotation.

It executes ONLY ONE TIME
after all test methods finish.

Purpose

Used for one-time cleanup.

Examples

• Close Database

• Stop Server

• Release Resources

• Close Browser Driver

=========================================================
Execution
=========================================================

@BeforeAll

↓

@BeforeEach

↓

Test 1

↓

@BeforeEach

↓

Test 2

↓

@AfterAll

=========================================================
Console Output
=========================================================

Application Started

Calculator Ready

Multiplication Test

25

Calculator Ready

Division Test

4

Application Closed

=========================================================
Important
=========================================================

@AfterAll method MUST be static.

=========================================================
Interview Question
=========================================================

Q. What is @AfterAll?

Ans:

@AfterAll executes once after all test
methods complete and is generally used
for resource cleanup.

=========================================================
*/