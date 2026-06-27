package _1SOLID._3LiskovSubstitutionPrinciple;

public class Main
{

    public static void main(String[] args)
    {

        WithdrawableAccount savingsAccount =
                new SavingsAccount();

        savingsAccount.deposit(5000);

        BankingAppWithdrawalService service =
                new BankingAppWithdrawalService(savingsAccount);

        service.withdraw(1000);

        WithdrawableAccount currentAccount =
                new CurrentAccount();

        currentAccount.deposit(10000);

        BankingAppWithdrawalService service2 =
                new BankingAppWithdrawalService(currentAccount);

        service2.withdraw(2000);

        Account fixedDepositAccount =
                new FixedDepositAccount();

        fixedDepositAccount.deposit(50000);

        System.out.println(
                "Fixed Deposit Account Created Successfully");
    }
}

abstract class Account
{

    protected double balance;

    public void deposit(double amount)
    {

        balance += amount;

        System.out.println(
                "Deposited : " + amount);
    }
}

abstract class WithdrawableAccount extends Account
{

    public abstract void withdraw(double amount);
}

class SavingsAccount extends WithdrawableAccount
{

    @Override
    public void withdraw(double amount)
    {

        if (amount <= balance)
        {

            balance -= amount;

            System.out.println(
                    "Savings Account Withdrawal : "
                            + amount);
        }
        else
        {

            System.out.println(
                    "Insufficient Balance");
        }
    }
}

class CurrentAccount extends WithdrawableAccount
{

    @Override
    public void withdraw(double amount)
    {

        if (amount <= balance)
        {

            balance -= amount;

            System.out.println(
                    "Current Account Withdrawal : "
                            + amount);
        }
        else
        {

            System.out.println(
                    "Insufficient Balance");
        }
    }
}

class FixedDepositAccount extends Account
{

    // Fixed Deposit Account supports only deposit

}

class BankingAppWithdrawalService
{

    private WithdrawableAccount account;

    public BankingAppWithdrawalService(WithdrawableAccount account)
    {

        this.account = account;
    }

    public void withdraw(double amount)
    {

        account.withdraw(amount);
    }
}

/*
LISKOV SUBSTITUTION PRINCIPLE (LSP)

1. Definition

The Liskov Substitution Principle (LSP) is the third
principle of the SOLID principles.

It was introduced by Barbara Liskov in 1987.

It states:

"Objects of a superclass should be replaceable
with objects of its subclasses without affecting
the correctness of the program."

In simple words:

A child class should be able to replace its
parent class without causing unexpected behavior.

--------------------------------------------------

2. Why Do We Need LSP?

Inheritance allows child classes to inherit
behavior from parent classes.

However, if a child class cannot properly
support the behavior of its parent class,
the application becomes unreliable.

LSP ensures that all child classes can safely
replace their parent classes.

--------------------------------------------------

3. Problem In Banking Application

Suppose every Account supports:

• deposit()
• withdraw()

SavingsAccount

Supports:

• deposit()
• withdraw()

CurrentAccount

Supports:

• deposit()
• withdraw()

FixedDepositAccount

Supports:

• deposit()

Does NOT support:

• withdraw()

--------------------------------------------------

4. LSP Violation

If FixedDepositAccount inherits withdraw(),
it may implement:

@Override
public void withdraw(double amount)
{

    throw new UnsupportedOperationException();
}

This means the object cannot behave like
a normal Account.

Therefore it cannot safely replace Account.

Hence LSP is violated.

--------------------------------------------------

5. Solution

Create a better hierarchy.

Account
    -> deposit()

WithdrawableAccount
    -> withdraw()

SavingsAccount
    -> withdraw()

CurrentAccount
    -> withdraw()

FixedDepositAccount
    -> deposit() only

--------------------------------------------------

6. How LSP Is Followed

SavingsAccount can replace
WithdrawableAccount.

CurrentAccount can replace
WithdrawableAccount.

Both support withdraw() correctly.

Therefore substitution works safely.

--------------------------------------------------

7. Why FixedDepositAccount Does Not Extend
   WithdrawableAccount

Fixed Deposit Accounts do not allow
withdrawals before maturity.

Therefore they should not inherit
withdraw().

This creates a correct inheritance
hierarchy.

--------------------------------------------------

8. How The Program Works

Step 1

Create SavingsAccount Object

WithdrawableAccount savingsAccount =
        new SavingsAccount();

--------------------------------------------------

Step 2

Deposit Money

savingsAccount.deposit(5000);

--------------------------------------------------

Step 3

Withdraw Money

service.withdraw(1000);

--------------------------------------------------

Step 4

Create CurrentAccount Object

WithdrawableAccount currentAccount =
        new CurrentAccount();

--------------------------------------------------

Step 5

Deposit And Withdraw

currentAccount.deposit(10000);

service2.withdraw(2000);

--------------------------------------------------

Step 6

Create Fixed Deposit Account

Account fixedDepositAccount =
        new FixedDepositAccount();

fixedDepositAccount.deposit(50000);

--------------------------------------------------

9. Advantages Of LSP

1. Better Inheritance

Child classes correctly extend parent classes.

--------------------------------------------------

2. Better Maintainability

Code becomes easier to maintain.

--------------------------------------------------

3. Better Reusability

Parent references can work with child objects.

--------------------------------------------------

4. Better Extensibility

New subclasses can be added easily.

--------------------------------------------------

5. Reduced Runtime Errors

Unexpected failures are minimized.

--------------------------------------------------

6. Better Code Quality

Inheritance hierarchies become cleaner.

--------------------------------------------------

10. Real World Examples

Banking System

Account
│
├── SavingsAccount
├── CurrentAccount
└── FixedDepositAccount

--------------------------------------------------

Vehicle System

Vehicle
│
├── Car
├── Bike
└── Truck

--------------------------------------------------

Payment System

PaymentMethod
│
├── CreditCardPayment
├── UPIPayment
└── NetBankingPayment

--------------------------------------------------

Notification System

Notification
│
├── EmailNotification
├── SMSNotification
└── PushNotification

--------------------------------------------------

11. Interview Questions

Q1. What is Liskov Substitution Principle?

Answer:

Objects of a superclass should be replaceable
with objects of its subclasses without affecting
the correctness of the program.

--------------------------------------------------

Q2. Who introduced LSP?

Answer:

Barbara Liskov introduced LSP in 1987.

--------------------------------------------------

Q3. Why is LSP important?

Answer:

It ensures correct inheritance and prevents
unexpected behavior in applications.

--------------------------------------------------

Q4. What is a common LSP violation?

Answer:

Throwing UnsupportedOperationException
inside a child class method because the
child cannot support inherited behavior.

--------------------------------------------------

Q5. How is LSP implemented in this program?

Answer:

SavingsAccount and CurrentAccount can safely
replace WithdrawableAccount.

FixedDepositAccount is not forced to implement
withdraw(), so the hierarchy remains correct.

--------------------------------------------------

12. Output

Deposited : 5000.0
Savings Account Withdrawal : 1000.0

Deposited : 10000.0
Current Account Withdrawal : 2000.0

Deposited : 50000.0
Fixed Deposit Account Created Successfully

--------------------------------------------------

13. Conclusion

The Liskov Substitution Principle (LSP)
states that child classes should be able
to replace their parent classes without
affecting the correctness of the application.

In this program:

• SavingsAccount replaces WithdrawableAccount
• CurrentAccount replaces WithdrawableAccount
• FixedDepositAccount is separated because
  it does not support withdrawal

This creates a correct inheritance hierarchy
and fully satisfies the Liskov Substitution
Principle (LSP).
*/