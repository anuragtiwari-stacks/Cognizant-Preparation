# Dependency Inversion Principle (DIP)

## Overview

The Dependency Inversion Principle (DIP) is the fifth
and final principle of the SOLID principles.

It states:

"High-level modules should not depend upon
low-level modules. Both should depend upon
abstractions."

In simple words:

Classes should depend on interfaces or abstract
classes instead of concrete implementations.

--------------------------------------------------

## Objective

To demonstrate the Dependency Inversion Principle
using a Notification System where messages can be
sent using different services such as Email and SMS.

--------------------------------------------------

## Problem Statement

Suppose Notification directly depends on EmailService.

Notification
↓
EmailService

Problems:

• Tight Coupling
• Difficult Maintenance
• Difficult Testing
• Difficult Extension

If EmailService changes,
Notification must also change.

This violates DIP.

--------------------------------------------------

## Solution

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
instead of a concrete implementation.

--------------------------------------------------

## Project Structure

Main
│
├── MessageService
│
├── EmailService
│
├── SMSService
│
└── Notification

--------------------------------------------------

## Components

### MessageService

Interface that defines:

sendMessage(String message)

--------------------------------------------------

### EmailService

Implements MessageService.

Responsible for sending emails.

--------------------------------------------------

### SMSService

Implements MessageService.

Responsible for sending SMS messages.

--------------------------------------------------

### Notification

Depends on MessageService.

Can work with EmailService, SMSService,
or any future implementation.

--------------------------------------------------

## How DIP Is Achieved

Notification does not depend on
EmailService or SMSService directly.

Instead it depends on:

MessageService

This creates loose coupling and
allows easy replacement of services.

--------------------------------------------------

## Program Flow

1. Create EmailService object.
2. Pass it to Notification.
3. Notification calls sendMessage().
4. EmailService sends the message.

--------------------------------------------------

## Output

Email Sent : Welcome To DIP Principle

--------------------------------------------------

## Advantages

• Loose Coupling
• Better Maintainability
• Better Scalability
• Better Testability
• Easy Extension
• Improved Flexibility

--------------------------------------------------

## Real-World Applications

### Notification Systems

MessageService
├── EmailService
├── SMSService
└── WhatsAppService

--------------------------------------------------

### Payment Systems

PaymentService
├── CreditCardPayment
├── UPIPayment
└── NetBankingPayment

--------------------------------------------------

### Database Systems

Database
├── MySQL
├── PostgreSQL
└── MongoDB

--------------------------------------------------

### Cloud Storage Systems

StorageService
├── AWS S3
├── Google Cloud Storage
└── Azure Blob Storage

--------------------------------------------------

## Interview Questions

### What is Dependency Inversion Principle?

High-level modules should not depend
on low-level modules.

Both should depend on abstractions.

--------------------------------------------------

### Why is DIP important?

DIP reduces coupling and increases
maintainability and flexibility.

--------------------------------------------------

### How is DIP implemented in this project?

Notification depends on MessageService
instead of EmailService.

--------------------------------------------------

### What role does an interface play in DIP?

Interfaces act as abstractions that
separate high-level and low-level modules.

--------------------------------------------------

## Conclusion

The Dependency Inversion Principle (DIP)
encourages software components to depend
on abstractions rather than concrete classes.

In this project, Notification depends on
MessageService rather than EmailService,
making the application flexible, scalable,
maintainable, and compliant with DIP.