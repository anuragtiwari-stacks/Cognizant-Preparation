# Open/Closed Principle (OCP)

## Objective

To understand and implement the Open/Closed Principle (OCP), one of the five SOLID principles of Object-Oriented Programming.

---

## Definition

The Open/Closed Principle states that:

> "Software entities should be open for extension but closed for modification."

This means that a class should allow new functionality to be added without changing its existing source code.

---

## Why OCP is Important

* Reduces the risk of introducing bugs.
* Improves maintainability.
* Makes the application scalable.
* Encourages abstraction and polymorphism.
* Supports future enhancements without modifying existing code.

---

## Problem Statement

A calculator application performs mathematical operations such as:

* Addition
* Subtraction

Initially, the Calculator class directly handled all operations using multiple if-else conditions.

Whenever a new operation such as Multiplication or Division was required, the Calculator class had to be modified.

This violates the Open/Closed Principle.

---

## Non-OCP Design

### Issues

* Uses multiple if-else conditions.
* Every new operation requires modification of Calculator class.
* High maintenance cost.
* Difficult to extend.

Example:

Calculator → Addition → Subtraction

Adding Division requires modifying Calculator again.

Therefore, the design is not OCP compliant.

---

## OCP Compliant Design

To follow OCP, an abstraction layer is introduced using an interface.

### Interface

CalculatorOperation

```java
public interface CalculatorOperation
{
    void perform();
}
```

Every operation implements its own logic.

Examples:

* Addition
* Subtraction
* Division
* Multiplication

---

## Classes Used

### CalculatorOperation

An interface that defines a common contract for all calculator operations.

### Addition

Performs addition of two numbers.

### Subtraction

Performs subtraction of two numbers.

### Division

Performs division of two numbers.

### Calculator

Executes operations without knowing their implementation details.

---

## Working Principle

1. Calculator receives a CalculatorOperation object.
2. Calculator calls perform().
3. The corresponding operation executes its own logic.
4. New operations can be added by creating new classes.
5. Existing Calculator code remains unchanged.

---

## Cohesion

### High Cohesion

Each operation class performs only one task.

Examples:

Addition → Addition only

Subtraction → Subtraction only

Division → Division only

Each class focuses on a single responsibility, resulting in High Cohesion.

---

## Advantages of OCP

* Easy to extend.
* Existing code remains untouched.
* Better maintainability.
* Improved scalability.
* Reduced testing effort.
* Supports polymorphism.

---

## Example Extension

Suppose a new requirement arrives:

Multiplication Operation

Instead of modifying Calculator class, simply create:

```java
public class Multiplication implements CalculatorOperation
{
    @Override
    public void perform()
    {
        // multiplication logic
    }
}
```

No changes are required in Calculator class.

Thus, the application remains closed for modification and open for extension.

---

## Output

Addition Result : 15

Subtraction Result : 5

Division Result : 2

---

## Conclusion

The calculator application follows the Open/Closed Principle by using an interface-based design.

* Existing classes do not require modification.
* New operations can be added through new classes.
* The system is open for extension and closed for modification.

Therefore, the implementation successfully follows the Open/Closed Principle (OCP) and demonstrates High Cohesion.
