package _1SOLID._2OpenClosePrinciple;

public class Main
{

    public static void main(String[] args)
    {

        Calculator calculator = new Calculator();

        Addition add = new Addition(20, 10);
        calculator.calculate(add);
        System.out.println("Addition = " + add.getResult());

        Subtraction sub = new Subtraction(20, 10);
        calculator.calculate(sub);
        System.out.println("Subtraction = " + sub.getResult());

        Multiplication mul = new Multiplication(20, 10);
        calculator.calculate(mul);
        System.out.println("Multiplication = " + mul.getResult());

        Division div = new Division(20, 10);
        calculator.calculate(div);
        System.out.println("Division = " + div.getResult());
    }
}

interface CalculatorOperation
{
    void perform();
}

class Calculator
{

    public void calculate(CalculatorOperation operation)
    {

        if (operation == null)
        {
            throw new IllegalArgumentException(
                    "Operation cannot be null");
        }

        operation.perform();
    }
}

class Addition implements CalculatorOperation
{

    private double left;
    private double right;
    private double result;

    public Addition(double left, double right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public void perform()
    {
        result = left + right;
    }

    public double getResult()
    {
        return result;
    }
}

class Subtraction implements CalculatorOperation
{

    private double left;
    private double right;
    private double result;

    public Subtraction(double left, double right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public void perform()
    {
        result = left - right;
    }

    public double getResult()
    {
        return result;
    }
}

class Multiplication implements CalculatorOperation
{

    private double left;
    private double right;
    private double result;

    public Multiplication(double left, double right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public void perform()
    {
        result = left * right;
    }

    public double getResult()
    {
        return result;
    }
}

class Division implements CalculatorOperation
{

    private double left;
    private double right;
    private double result;

    public Division(double left, double right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public void perform()
    {

        if (right == 0)
        {
            throw new ArithmeticException(
                    "Cannot divide by zero");
        }

        result = left / right;
    }

    public double getResult()
    {
        return result;
    }
}


/*
OPEN/CLOSED PRINCIPLE (OCP)

1. Definition

The Open/Closed Principle (OCP) is one of the five SOLID principles of Object-Oriented Programming.

It states:

"Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification."

This means that existing code should not be modified whenever a new requirement arrives. Instead, the system should allow new functionality to be added through extension.

--------------------------------------------------

2. Why Do We Need OCP?

Suppose we create a calculator application that initially supports:

• Addition
• Subtraction

Later, the client requests:

• Multiplication
• Division
• Modulus

If the Calculator class contains all operation logic, we would need to modify it every time a new operation is added.

Problems:

• Existing code changes frequently.
• New bugs may be introduced.
• Maintenance becomes difficult.
• Testing effort increases.

The Open/Closed Principle solves these problems.

--------------------------------------------------

3. Non-OCP Approach

A common beginner implementation is:

if(operation instanceof Addition)
{
    // Addition logic
}
else if(operation instanceof Subtraction)
{
    // Subtraction logic
}
else if(operation instanceof Multiplication)
{
    // Multiplication logic
}

Problem:

Whenever a new operation is introduced:

else if(operation instanceof Division)
{
    // Division logic
}

the Calculator class must be modified.

Therefore, the class is not closed for modification and violates OCP.

--------------------------------------------------

4. OCP-Compliant Approach

Instead of putting all logic inside the Calculator class, we create an abstraction using an interface.

interface CalculatorOperation
{
    void perform();
}

Every operation implements this interface and provides its own implementation.

Example:

class Addition implements CalculatorOperation
{
    @Override
    public void perform()
    {
        result = left + right;
    }
}

The Calculator class only calls:

operation.perform();

Now the Calculator class never changes when new operations are added.

--------------------------------------------------

5. How the Program Works

Step 1: Create an Interface

interface CalculatorOperation
{
    void perform();
}

The interface acts as a contract.

Every calculator operation must implement the perform() method.

--------------------------------------------------

Step 2: Implement Individual Operations

Classes created:

• Addition
• Subtraction
• Multiplication
• Division

Each class contains its own business logic.

Example:

result = left + right;

for addition.

result = left - right;

for subtraction.

--------------------------------------------------

Step 3: Use Polymorphism

The Calculator class accepts:

CalculatorOperation operation

instead of concrete classes.

This allows Calculator to work with any operation that implements the interface.

--------------------------------------------------

Step 4: Execute the Operation

operation.perform();

The correct method is called automatically at runtime.

This is known as Runtime Polymorphism.

--------------------------------------------------

6. How OCP Is Achieved

The Calculator class never contains logic for:

• Addition
• Subtraction
• Multiplication
• Division

It only executes:

operation.perform();

Therefore, if a new operation is required, the Calculator class remains unchanged.

--------------------------------------------------

7. Adding a New Operation

Suppose we need a Modulus operation.

We simply create:

class Modulus implements CalculatorOperation
{
    private double left;
    private double right;
    private double result;

    public Modulus(double left, double right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public void perform()
    {
        result = left % right;
    }

    public double getResult()
    {
        return result;
    }
}

No changes are required in the Calculator class.

Thus:

✓ Open for Extension

✓ Closed for Modification

--------------------------------------------------

8. Class Explanation

Main Class

Responsibilities:

• Creates calculator object.
• Creates operation objects.
• Executes operations.
• Displays results.

--------------------------------------------------

CalculatorOperation Interface

Responsibilities:

• Defines a common contract.
• Ensures all operations provide a perform() method.

--------------------------------------------------

Calculator Class

Responsibilities:

• Validates operation object.
• Executes the operation.
• Does not contain any operation-specific logic.

This is the main reason OCP is followed.

--------------------------------------------------

Addition Class

Responsibilities:

• Stores two numbers.
• Adds them together.
• Stores the result.

Formula:

result = left + right

--------------------------------------------------

Subtraction Class

Responsibilities:

• Subtracts one number from another.

Formula:

result = left - right

--------------------------------------------------

Multiplication Class

Responsibilities:

• Multiplies two numbers.

Formula:

result = left * right

--------------------------------------------------

Division Class

Responsibilities:

• Divides one number by another.
• Prevents division by zero.

Formula:

result = left / right

--------------------------------------------------

9. Advantages of OCP

1. Easy Maintenance
   Existing code remains untouched.

2. Reduced Risk of Bugs
   Previously tested code is not modified.

3. Better Scalability
   New features can be added easily.

4. Better Reusability
   Each operation class can be reused independently.

5. Loose Coupling
   Calculator depends on an interface rather than concrete classes.

--------------------------------------------------

10. Real-World Examples

Payment System

Payment
│
├── CreditCardPayment
├── UPI
├── PayPalPayment
└── NetBankingPayment

Adding a new payment method does not require modifying existing code.

--------------------------------------------------

Notification System

Notification
│
├── EmailNotification
├── SMSNotification
├── PushNotification
└── WhatsAppNotification

New notification types can be added easily.

--------------------------------------------------

Shape Drawing Application

Shape
│
├── Circle
├── Rectangle
├── Triangle
└── Pentagon

New shapes are added without changing existing drawing logic.

--------------------------------------------------

11. Interview Questions

Q1. What is Open/Closed Principle?
Answer:Open/Closed Principle states that software entities should be open for extension
but closed for modification.
New functionality should be added by extending the system rather than changing existing code.

--------------------------------------------------

Q2. How is OCP implemented in Java?
Answer:OCP is commonly implemented using:
• Interfaces
• Abstract Classes
• Inheritance
• Polymorphism
• Design Patterns

--------------------------------------------------

Q3. Which SOLID Principle is used in this program?
Answer:The Open/Closed Principle (OCP) because new calculator operations can be added
without modifying the Calculator class.

--------------------------------------------------

12. Conclusion
In this calculator application, the Calculator class does not need modification
whenever a new operation is introduced. New functionality is added by creating
new classes that implement the CalculatorOperation interface.

This makes the application flexible, maintainable, scalable,
and fully compliant with the Open/Closed Principle (OCP).
 */