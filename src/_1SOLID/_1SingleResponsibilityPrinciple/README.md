# Single Responsibility Principle (SRP)

## Objective

To understand and implement the Single Responsibility Principle (SRP), which is the first principle of SOLID design principles in Object-Oriented Programming.

---

## Definition

The Single Responsibility Principle states that:

> "A class should have only one reason to change."

This means that a class should be responsible for only one task or functionality. If a class performs multiple unrelated tasks, it violates SRP and becomes difficult to maintain.

---

## Why SRP is Important

* Improves code readability.
* Makes code easier to maintain.
* Reduces complexity.
* Enhances reusability.
* Simplifies testing and debugging.
* Promotes high cohesion.

---

## Problem Statement

Initially, a single class was responsible for both:

1. Manipulating text
2. Printing text

This violates SRP because the class has multiple responsibilities.

To solve this issue, the functionality was divided into two separate classes.

---

## Classes Used

### 1. TextManipulator

Responsibility: Text Manipulation

Functions:

* Append text
* Replace text
* Delete text
* Return current text

### 2. TextPrinter

Responsibility: Text Output

Functions:

* Print complete text

---

## Implementation

### TextManipulator Class

Responsible only for modifying text.

Methods:

* appendText()
* findWordAndReplace()
* findWordAndDelete()
* getText()

### TextPrinter Class

Responsible only for displaying text.

Methods:

* printText()

---

## Cohesion

Cohesion refers to how closely related the methods of a class are.

### High Cohesion

A class has high cohesion when all its methods work together to achieve a single purpose.

Example:

TextManipulator contains only text manipulation methods.

TextPrinter contains only text printing methods.

Since every method in each class serves the same purpose, both classes have high cohesion.

---

## Advantages of High Cohesion

* Better maintainability
* Easier debugging
* Improved readability
* Increased reusability
* Lower coupling

---

## Output

Hello Cognizant World

---

## Conclusion

The application follows the Single Responsibility Principle by separating text manipulation and text printing into different classes.

* TextManipulator handles only text operations.
* TextPrinter handles only printing operations.

Each class has one responsibility and one reason to change.

Therefore, the implementation successfully follows the Single Responsibility Principle (SRP) and demonstrates High Cohesion.
