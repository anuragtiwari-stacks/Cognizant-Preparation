# Interface Segregation Principle (ISP)

## Overview

The Interface Segregation Principle (ISP) is the fourth
principle of the SOLID principles of Object-Oriented Programming.

It states:

"Clients should not be forced to depend upon interfaces
they do not use."

In simple words:

A class should not be required to implement methods
that are unnecessary for its functionality.

Instead of creating one large interface,
multiple small and focused interfaces should be created.

--------------------------------------------------

## Objective

To understand and implement the Interface Segregation
Principle using a Worker Management System where
different workers have different capabilities.

--------------------------------------------------

## Problem Statement

Consider a Worker interface:

interface Worker
{
void work();

    void eat();
}

Human workers can:

• Work
• Eat

Robot workers can:

• Work

Robots cannot eat.

However, RobotWorker is forced to implement eat().

Example:

class RobotWorker implements Worker
{
@Override
public void eat()
{
throw new UnsupportedOperationException();
}
}

This is poor design because RobotWorker is forced
to implement behavior that it does not require.

Therefore, ISP is violated.

--------------------------------------------------

## Solution

Split the large interface into smaller interfaces.

Workable
-> work()

Eatable
-> eat()

Now:

HumanWorker
-> Workable + Eatable

RobotWorker
-> Workable

Each class implements only the behavior
it actually needs.

--------------------------------------------------

## Project Structure

Main
│
├── Workable
│
├── Eatable
│
├── HumanWorker
│
└── RobotWorker

--------------------------------------------------

## Interfaces Used

### Workable

Responsibility:

• Defines work behavior

Method:

void work();

--------------------------------------------------

### Eatable

Responsibility:

• Defines eating behavior

Method:

void eat();

--------------------------------------------------

## Classes Used

### HumanWorker

Implements:

• Workable
• Eatable

Responsibilities:

• Work
• Eat

--------------------------------------------------

### RobotWorker

Implements:

• Workable

Responsibilities:

• Work

RobotWorker does not implement Eatable.

--------------------------------------------------

## How ISP Is Achieved

HumanWorker requires both work()
and eat().

RobotWorker only requires work().

By splitting the interface:

• HumanWorker implements both interfaces.
• RobotWorker implements only Workable.

No class is forced to implement
unnecessary methods.

Therefore ISP is satisfied.

--------------------------------------------------

## Program Flow

Step 1

Create HumanWorker object.

--------------------------------------------------

Step 2

Create RobotWorker object.

--------------------------------------------------

Step 3

Call work() on HumanWorker.

Output:

Human Worker is Working

--------------------------------------------------

Step 4

Call eat() on HumanWorker.

Output:

Human Worker is Eating

--------------------------------------------------

Step 5

Call work() on RobotWorker.

Output:

Robot Worker is Working

--------------------------------------------------

## Output

Human Worker is Working

Human Worker is Eating

Robot Worker is Working

--------------------------------------------------

## Advantages Of ISP

1. Better Design

Interfaces remain small and focused.

--------------------------------------------------

2. Better Maintainability

Changes affect fewer classes.

--------------------------------------------------

3. Better Flexibility

Classes implement only required methods.

--------------------------------------------------

4. Better Reusability

Small interfaces can be reused easily.

--------------------------------------------------

5. Reduced Coupling

Classes depend only on required functionality.

--------------------------------------------------

6. Better Scalability

New features can be added easily.

--------------------------------------------------

## Real-World Applications

### Printer System

Printable
-> print()

Scannable
-> scan()

Faxable
-> fax()

--------------------------------------------------

### Payment System

Payable
-> pay()

Refundable
-> refund()

--------------------------------------------------

### Notification System

EmailSender
-> sendEmail()

SmsSender
-> sendSMS()

PushSender
-> sendPushNotification()

--------------------------------------------------

### Vehicle System

Drivable
-> drive()

Flyable
-> fly()

Sailable
-> sail()

--------------------------------------------------

## Difference Between SRP And ISP

SRP

Focuses on classes.

A class should have only one responsibility.

--------------------------------------------------

ISP

Focuses on interfaces.

Interfaces should contain only related methods.

--------------------------------------------------

## Interview Questions

### What is Interface Segregation Principle?

Clients should not be forced to depend upon
interfaces they do not use.

--------------------------------------------------

### Why is ISP important?

ISP prevents classes from implementing
unnecessary methods and reduces coupling.

--------------------------------------------------

### What is a common ISP violation?

A class implementing methods that are empty
or throw UnsupportedOperationException.

--------------------------------------------------

### How is ISP implemented in this project?

The Worker interface is divided into:

• Workable
• Eatable

HumanWorker implements both.

RobotWorker implements only Workable.

--------------------------------------------------

### Which SOLID principle is demonstrated?

Interface Segregation Principle (ISP).

--------------------------------------------------

## Conclusion

The Interface Segregation Principle (ISP)
states that clients should not be forced
to depend on methods they do not use.

In this project:

• HumanWorker implements Workable and Eatable.
• RobotWorker implements only Workable.

This results in a clean, maintainable,
flexible, and scalable design.

Therefore, the application successfully
follows the Interface Segregation Principle.