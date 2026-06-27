package _3TestDriven._3JUnit._3Annotations;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3AfterEachTest
{
    private _1Calculator calculator;

    @BeforeEach
    public void setup()
    {
        System.out.println("Calculator Created");

        calculator = new _1Calculator();
    }

    @Test
    public void testAddition()
    {
        System.out.println("Addition Test");

        System.out.println(calculator.add(10, 10));
    }

    @Test
    public void testMultiplication()
    {
        System.out.println("Multiplication Test");

        System.out.println(calculator.multiply(5, 5));
    }

    @AfterEach
    public void cleanup()
    {
        System.out.println("Cleaning Resources");

        calculator = null;
    }
}

/*
=========================================================
What is @AfterEach?
=========================================================

@AfterEach is a JUnit Lifecycle Annotation.

It executes AFTER EVERY test method.

Purpose

Used to clean resources after every test.

Examples

• Close Browser

• Reset Variables

• Delete Temporary Data

• Close Database Connection

=========================================================
Execution
=========================================================

@BeforeEach

↓

Calculator Created

↓

Addition Test

↓

@AfterEach

↓

Cleaning Resources

-------------------------------------

@BeforeEach

↓

Calculator Created

↓

Multiplication Test

↓

@AfterEach

↓

Cleaning Resources

=========================================================
Console Output
=========================================================

Calculator Created

Addition Test

20

Cleaning Resources

Calculator Created

Multiplication Test

25

Cleaning Resources

=========================================================
Real Life Example
=========================================================

Suppose after every student finishes
the exam,

the invigilator collects the answer sheet.

Similarly,

After Every Test,

JUnit cleans resources.

=========================================================
Interview Question
=========================================================

Q. What is @AfterEach?

Ans:

@AfterEach executes after every test
method and is generally used for cleanup.

=========================================================
*/