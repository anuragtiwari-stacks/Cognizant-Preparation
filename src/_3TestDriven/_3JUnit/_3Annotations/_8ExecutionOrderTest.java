package _3TestDriven._3JUnit._3Annotations;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _8ExecutionOrderTest
{
    @BeforeAll
    public static void beforeAll()
    {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    public void beforeEach()
    {
        System.out.println("@BeforeEach");
    }

    @Test
    public void testOne()
    {
        System.out.println("Test One");
    }

    @Test
    public void testTwo()
    {
        System.out.println("Test Two");
    }

    @AfterEach
    public void afterEach()
    {
        System.out.println("@AfterEach");
    }

    @AfterAll
    public static void afterAll()
    {
        System.out.println("@AfterAll");
    }
}

/*
=========================================================
Execution Order
=========================================================

JUnit follows this sequence

@BeforeAll

↓

@BeforeEach

↓

Test One

↓

@AfterEach

↓

@BeforeEach

↓

Test Two

↓

@AfterEach

↓

@AfterAll

=========================================================
Console Output
=========================================================

@BeforeAll

@BeforeEach
Test One
@AfterEach

@BeforeEach
Test Two
@AfterEach

@AfterAll

=========================================================
Interview Question
=========================================================

Q. What is the execution order of JUnit
Lifecycle Annotations?

Ans:

@BeforeAll

↓

@BeforeEach

↓

@Test

↓

@AfterEach

↓

Repeat

↓

@AfterAll

=========================================================
*/