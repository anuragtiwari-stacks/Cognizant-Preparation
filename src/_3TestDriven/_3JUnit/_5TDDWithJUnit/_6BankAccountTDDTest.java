package _3TestDriven._3JUnit._5TDDWithJUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _6BankAccountTDDTest
{
    @Test
    public void testDeposit()
    {
        BankAccount account = new BankAccount();

        account.deposit(1000);

        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testWithdraw()
    {
        BankAccount account = new BankAccount();

        account.deposit(1000);

        account.withdraw(300);

        assertEquals(700, account.getBalance());
    }
}

class BankAccount
{
    private double balance;

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }

    public double getBalance()
    {
        return balance;
    }
}

/*
===============================================================================
                  REAL WORLD TDD EXAMPLE
===============================================================================

Project

Bank Account

Feature

Deposit Money

Withdraw Money

Check Balance

===============================================================================
RED PHASE
===============================================================================

Write Test

↓

testDeposit()

↓

deposit() method not available

↓

FAIL

===============================================================================
GREEN PHASE
===============================================================================

Implement

deposit()

↓

Run Test

↓

PASS

===============================================================================
REFACTOR PHASE
===============================================================================

Improve Code

↓

Rename Variables

↓

Improve Readability

↓

Run Tests Again

↓

PASS

===============================================================================
Execution
===============================================================================

Create Account

↓

Deposit ₹1000

↓

Balance = ₹1000

↓

Withdraw ₹300

↓

Balance = ₹700

===============================================================================
Console Output
===============================================================================

Deposit Test

PASS

-------------------------------------

Withdraw Test

PASS

-------------------------------------

BUILD SUCCESSFUL

===============================================================================
Advantages
===============================================================================

• Real-world Example

• Better Banking Software

• Easy Debugging

• High Reliability

• Industry Standard

===============================================================================
Real-Life Example
===============================================================================

Before developing a banking feature,

the developer first writes the test.

↓

Feature does not exist.

↓

Test Fails.

↓

Developer implements feature.

↓

Test Passes.

↓

Developer improves code.

↓

Tests continue to Pass.

===============================================================================
Interview Questions
===============================================================================

Q1. Why is TDD useful in Banking Applications?

Ans:

Because banking software requires
high reliability and fewer bugs.

--------------------------------------------------

Q2. What is tested here?

Ans:

Deposit

Withdraw

Balance Calculation

===============================================================================
One-Line Revision
===============================================================================

Write Test

↓

FAIL

↓

Write Code

↓

PASS

↓

Improve Code

↓

PASS

===============================================================================
*/