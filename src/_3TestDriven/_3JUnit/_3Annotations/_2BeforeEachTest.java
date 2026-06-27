package _3TestDriven._3JUnit._3Annotations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2BeforeEachTest
{
    private _1Calculator calculator;

    @BeforeEach
    public void setup()
    {
        System.out.println("Creating Calculator Object...");

        calculator = new _1Calculator();
    }

    @Test
    public void testAddition()
    {
        System.out.println("Running Addition Test");

        System.out.println(calculator.add(10, 20));
    }

    @Test
    public void testSubtraction()
    {
        System.out.println("Running Subtraction Test");

        System.out.println(calculator.subtract(20, 10));
    }
}

/*
=========================================================
What is @BeforeEach?
=========================================================

@BeforeEach is a JUnit Lifecycle Annotation.

It executes BEFORE EVERY test method.

Purpose

Instead of writing common code inside every
test method,

JUnit automatically executes the setup method.

=========================================================
Execution
=========================================================

Test 1

↓

@BeforeEach

↓

Creates Calculator Object

↓

testAddition()

------------------------------------

Test 2

↓

@BeforeEach

↓

Creates Calculator Object

↓

testSubtraction()

=========================================================
Console Output
=========================================================

Creating Calculator Object...

Running Addition Test

30

Creating Calculator Object...

Running Subtraction Test

10

=========================================================
Real Life Example
=========================================================

Suppose every student entering an exam hall
gets a fresh answer sheet.

Before Every Student

↓

Give Answer Sheet

Similarly,

Before Every Test

↓

Create Calculator Object

=========================================================
Interview Question
=========================================================

Q. What is @BeforeEach?

Ans:

@BeforeEach executes before every test
method and is generally used for object
creation and initialization.

=========================================================
*/