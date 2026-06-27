package _1SOLID._5DependencyInversionPrinciple;

public class Main
{

    public static void main(String[] args)
    {

        MessageService emailService =
                new EmailService();

        Notification notification =
                new Notification(emailService);

        notification.sendMessage(
                "Welcome To DIP Principle");
    }
}

interface MessageService
{

    void sendMessage(String message);
}

class EmailService implements MessageService
{

    @Override
    public void sendMessage(String message)
    {

        System.out.println(
                "Email Sent : " + message);
    }
}

class SMSService implements MessageService
{

    @Override
    public void sendMessage(String message)
    {

        System.out.println(
                "SMS Sent : " + message);
    }
}

class Notification
{

    private MessageService messageService;

    public Notification(MessageService messageService)
    {

        this.messageService = messageService;
    }

    public void sendMessage(String message)
    {

        messageService.sendMessage(message);
    }
}

/*
DEPENDENCY INVERSION PRINCIPLE (DIP)

1. Definition

The Dependency Inversion Principle (DIP) is the fifth
and final principle of SOLID.

It states:

"High-level modules should not depend upon
low-level modules. Both should depend upon
abstractions."

"Abstractions should not depend upon details.
Details should depend upon abstractions."

--------------------------------------------------

2. What Is Dependency?

Dependency means one class depends on another
class to perform its work.

Example:

Notification
        ↓
EmailService

Notification depends directly on EmailService.

--------------------------------------------------

3. Problem Without DIP

class Notification
{

    private EmailService emailService =
            new EmailService();
}

Problems:

• Tight Coupling
• Difficult Maintenance
• Difficult Testing
• Difficult Extension

If EmailService changes,
Notification must also change.

--------------------------------------------------

4. Solution

Introduce an abstraction.

MessageService
        ↑
EmailService

MessageService
        ↑
SMSService

Notification
        ↓
MessageService

Now Notification depends on an interface
instead of a concrete class.

--------------------------------------------------

5. How DIP Is Implemented

MessageService Interface

Responsibility:

• Define message sending behavior

--------------------------------------------------

EmailService

Implements:

• MessageService

--------------------------------------------------

SMSService

Implements:

• MessageService

--------------------------------------------------

Notification

Depends on:

• MessageService

instead of

• EmailService
• SMSService

--------------------------------------------------

6. How The Program Works

Step 1

Create EmailService Object

MessageService emailService =
        new EmailService();

--------------------------------------------------

Step 2

Inject Dependency

Notification notification =
        new Notification(emailService);

--------------------------------------------------

Step 3

Send Message

notification.sendMessage(
        "Welcome To DIP Principle");

--------------------------------------------------

7. Output

Email Sent : Welcome To DIP Principle

--------------------------------------------------

8. Advantages Of DIP

1. Loose Coupling

Classes become independent.

--------------------------------------------------

2. Easy Maintenance

Changes affect fewer classes.

--------------------------------------------------

3. Better Flexibility

Dependencies can be changed easily.

--------------------------------------------------

4. Better Testability

Mock implementations can be used.

--------------------------------------------------

5. Better Scalability

New services can be added easily.

--------------------------------------------------

9. Real World Examples

Notification System

MessageService
│
├── EmailService
├── SMSService
└── WhatsAppService

--------------------------------------------------

Payment System

PaymentService
│
├── CreditCardPayment
├── UPIPayment
└── NetBankingPayment

--------------------------------------------------

Database System

Database
│
├── MySQL
├── PostgreSQL
└── MongoDB

--------------------------------------------------

10. Interview Questions

Q1. What is Dependency Inversion Principle?

Answer:

High-level modules should not depend upon
low-level modules.

Both should depend upon abstractions.

--------------------------------------------------

Q2. Why is DIP important?

Answer:

DIP reduces coupling and increases
flexibility and maintainability.

--------------------------------------------------

Q3. How is DIP implemented in this program?

Answer:

Notification depends on MessageService
instead of EmailService.

--------------------------------------------------

Q4. What is the benefit of interfaces in DIP?

Answer:

Interfaces allow multiple implementations
without changing existing code.

--------------------------------------------------

11. Conclusion

The Dependency Inversion Principle (DIP)
states that high-level modules should depend
on abstractions rather than concrete classes.

In this program:

• Notification is a high-level module.
• EmailService and SMSService are low-level modules.
• MessageService acts as abstraction.

Therefore the application becomes flexible,
maintainable, scalable, and follows DIP.
*/