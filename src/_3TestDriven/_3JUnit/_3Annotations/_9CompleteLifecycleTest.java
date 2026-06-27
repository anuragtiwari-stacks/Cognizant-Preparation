package _3TestDriven._3JUnit._3Annotations;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class _9CompleteLifecycleTest
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

        System.out.println("Calculator Created");
    }

    @Test
    @DisplayName("Addition Test")
    public void additionTest()
    {
        System.out.println(calculator.add(10, 20));
    }

    @Test
    @DisplayName("Multiplication Test")
    public void multiplicationTest()
    {
        System.out.println(calculator.multiply(5, 5));
    }

    @AfterEach
    public void cleanup()
    {
        System.out.println("Cleaning Resources");

        calculator = null;
    }

    @AfterAll
    public static void stopApplication()
    {
        System.out.println("Application Closed");
    }
}

/*
=========================================================
Complete Lifecycle
=========================================================

@BeforeAll

Runs once before all tests.

-----------------------------------------

@BeforeEach

Runs before every test.

-----------------------------------------

@Test

Actual Test Method.

-----------------------------------------

@AfterEach

Runs after every test.

-----------------------------------------

@AfterAll

Runs once after all tests.

=========================================================
Execution
=========================================================

Application Started

↓

Calculator Created

↓

Addition Test

↓

Cleaning Resources

↓

Calculator Created

↓

Multiplication Test

↓

Cleaning Resources

↓

Application Closed

=========================================================
Console Output
=========================================================

Application Started

Calculator Created

30

Cleaning Resources

Calculator Created

25

Cleaning Resources

Application Closed

=========================================================
Real Life Example
=========================================================

Before Opening Exam Hall

↓

@BeforeAll

-----------------------------------------

Before Every Student

↓

@BeforeEach

-----------------------------------------

Student Writes Exam

↓

@Test

-----------------------------------------

Collect Answer Sheet

↓

@AfterEach

-----------------------------------------

Close Exam Hall

↓

@AfterAll

=========================================================
Interview Questions
=========================================================

Q1. Which annotation runs only once
before all tests?

Ans:
@BeforeAll

-----------------------------------------

Q2. Which annotation runs before every test?

Ans:
@BeforeEach

-----------------------------------------

Q3. Which annotation runs after every test?

Ans:
@AfterEach

-----------------------------------------

Q4. Which annotation runs once after all tests?

Ans:
@AfterAll

-----------------------------------------

Q5. Which annotation gives custom names?

Ans:
@DisplayName

-----------------------------------------

Q6. Which annotation skips a test?

Ans:
@Disabled

=========================================================
One-Line Revision
=========================================================

@BeforeAll
→ One Time Before All Tests

@BeforeEach
→ Before Every Test

@Test
→ Test Method

@AfterEach
→ After Every Test

@AfterAll
→ One Time After All Tests

@DisplayName
→ Custom Test Name

@Disabled
→ Skip Test

=========================================================
*/