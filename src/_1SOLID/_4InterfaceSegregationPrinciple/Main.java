package _1SOLID._4InterfaceSegregationPrinciple;

public class Main
{

    public static void main(String[] args)
    {

        Workable human = new HumanWorker();

        Eatable person = new HumanWorker();

        Workable robot = new RobotWorker();

        human.work();
        person.eat();
        robot.work();
    }
}

interface Workable
{

    void work();
}

interface Eatable
{

    void eat();
}

class HumanWorker implements Workable, Eatable
{

    @Override
    public void work()
    {

        System.out.println(
                "Human Worker is Working");
    }

    @Override
    public void eat()
    {

        System.out.println(
                "Human Worker is Eating");
    }
}

class RobotWorker implements Workable
{

    @Override
    public void work()
    {

        System.out.println(
                "Robot Worker is Working");
    }
}

/*
INTERFACE SEGREGATION PRINCIPLE (ISP)

1. Definition

The Interface Segregation Principle (ISP) is the fourth
principle of the SOLID principles.

It states:

"Clients should not be forced to depend upon
interfaces they do not use."

In simple words:

A class should not be forced to implement methods
that it does not need.

--------------------------------------------------

2. Why Do We Need ISP?

Large interfaces often contain many methods.

Some classes may not require all methods.

Forcing classes to implement unnecessary methods
creates poor design.

ISP solves this problem by dividing large
interfaces into smaller and more specific interfaces.

--------------------------------------------------

3. Problem Without ISP

Suppose:

interface Worker
{
    void work();
    void eat();
}

HumanWorker needs both methods.

RobotWorker only needs work().

RobotWorker is forced to implement eat().

This violates ISP.

--------------------------------------------------

4. ISP-Compliant Design

Separate the interface.

Workable
    -> work()

Eatable
    -> eat()

HumanWorker
    -> Workable + Eatable

RobotWorker
    -> Workable

Now every class implements only the
methods it actually needs.

--------------------------------------------------

5. How The Program Works

Step 1

Create HumanWorker Object

HumanWorker implements:

• Workable
• Eatable

--------------------------------------------------

Step 2

Create RobotWorker Object

RobotWorker implements:

• Workable

--------------------------------------------------

Step 3

Call work()

Human Worker is Working

Robot Worker is Working

--------------------------------------------------

Step 4

Call eat()

Human Worker is Eating

--------------------------------------------------

6. How ISP Is Achieved

Workable Interface

Responsibility:

• Work behavior

--------------------------------------------------

Eatable Interface

Responsibility:

• Eating behavior

--------------------------------------------------

HumanWorker

Implements:

• Workable
• Eatable

--------------------------------------------------

RobotWorker

Implements:

• Workable

RobotWorker is not forced to implement eat().

Therefore ISP is satisfied.

--------------------------------------------------

7. Advantages Of ISP

1. Better Design

Interfaces remain small and focused.

--------------------------------------------------

2. Better Maintainability

Changes affect fewer classes.

--------------------------------------------------

3. Better Flexibility

Classes implement only required behavior.

--------------------------------------------------

4. Better Reusability

Interfaces can be reused independently.

--------------------------------------------------

5. Reduced Coupling

Classes depend only on methods they need.

--------------------------------------------------

8. Real World Examples

Printer System

Printable
    -> print()

Scannable
    -> scan()

Faxable
    -> fax()

--------------------------------------------------

Payment System

Payable
    -> pay()

Refundable
    -> refund()

--------------------------------------------------

Notification System

EmailSender
    -> sendEmail()

SmsSender
    -> sendSMS()

--------------------------------------------------

9. Interview Questions

Q1. What is Interface Segregation Principle?

Answer:

Clients should not be forced to depend on
methods they do not use.

--------------------------------------------------

Q2. Why is ISP important?

Answer:

ISP reduces coupling and prevents classes
from implementing unnecessary methods.

--------------------------------------------------

Q3. How is ISP implemented in this program?

Answer:

The Worker interface is divided into:

• Workable
• Eatable

Each class implements only required interfaces.

--------------------------------------------------

10. Output

Human Worker is Working

Human Worker is Eating

Robot Worker is Working

--------------------------------------------------

11. Conclusion

The Interface Segregation Principle (ISP)
states that clients should not be forced
to depend on methods they do not use.

In this program:

• HumanWorker implements Workable and Eatable.
• RobotWorker implements only Workable.

Therefore every class implements only the
behavior it actually needs, making the
application fully compliant with ISP.
*/