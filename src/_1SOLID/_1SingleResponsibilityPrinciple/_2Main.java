package _1SOLID._1SingleResponsibilityPrinciple;

public class _2Main
{

    public static void main(String[] args)
    {

        Student student = new Student("Anurag Tiwari", 101, 85);

        GradeCalculator calculator = new GradeCalculator();

        String grade = calculator.calculateGrade(student);

        StudentPrinter printer = new StudentPrinter();

        printer.printStudentDetails(student, grade);
    }
}

class Student
{

    private String name;
    private int rollNo;
    private int marks;

    public Student(String name, int rollNo, int marks)
    {

        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String getName()
    {

        return name;
    }

    public int getRollNo()
    {

        return rollNo;
    }

    public int getMarks()
    {

        return marks;
    }
}

class GradeCalculator
{

    public String calculateGrade(Student student)
    {

        int marks = student.getMarks();

        if (marks >= 90)
        {

            return "A";
        }
        else if (marks >= 75)
        {

            return "B";
        }
        else if (marks >= 60)
        {

            return "C";
        }
        else
        {

            return "Fail";
        }
    }
}

class StudentPrinter
{

    public void printStudentDetails(Student student, String grade)
    {

        System.out.println("Student Name : "
                + student.getName());

        System.out.println("Roll Number  : "
                + student.getRollNo());

        System.out.println("Marks        : "
                + student.getMarks());

        System.out.println("Grade        : "
                + grade);
    }
}

/*
SINGLE RESPONSIBILITY PRINCIPLE (SRP)

1. Definition

The Single Responsibility Principle (SRP) is the first
principle of the SOLID principles.

It states:

"A class should have only one reason to change."

This means that every class should have only one
responsibility or one job.

A class should focus on doing one thing well.

--------------------------------------------------

2. Why Do We Need SRP?

Without SRP, one class may perform many tasks such as:

• Storing Data
• Calculating Results
• Printing Information
• Saving Data To Database

Problems:

• Large classes
• Difficult maintenance
• Difficult testing
• More bugs
• High coupling
• Poor readability

SRP solves these problems by separating responsibilities.

--------------------------------------------------

3. Responsibilities In This Program

Student Class

Responsibility:

• Store student information

--------------------------------------------------

GradeCalculator Class

Responsibility:

• Calculate student grades

--------------------------------------------------

StudentPrinter Class

Responsibility:

• Print student details

--------------------------------------------------

Main Class

Responsibility:

• Run the application

--------------------------------------------------

4. How SRP Is Followed

The Student class only stores student data.

The GradeCalculator class only calculates grades.

The StudentPrinter class only prints details.

Each class has only one responsibility.

Therefore, SRP is satisfied.

--------------------------------------------------

5. How The Program Works

Step 1

Create Student Object

Student student =
new Student("Anurag Tiwari", 101, 85);

The Student object stores information.

--------------------------------------------------

Step 2

Create GradeCalculator Object

GradeCalculator calculator =
new GradeCalculator();

--------------------------------------------------

Step 3

Calculate Grade

String grade =
calculator.calculateGrade(student);

The GradeCalculator class calculates grade
based on student marks.

--------------------------------------------------

Step 4

Create StudentPrinter Object

StudentPrinter printer =
new StudentPrinter();

--------------------------------------------------

Step 5

Print Student Details

printer.printStudentDetails(student, grade);

The StudentPrinter class displays
student information and grade.

--------------------------------------------------

6. Advantages Of SRP

1. Easy Maintenance

Each class performs only one task.

--------------------------------------------------

2. Better Readability

Code becomes easier to understand.

--------------------------------------------------

3. Better Reusability

Classes can be reused independently.

--------------------------------------------------

4. Easy Testing

Each class can be tested separately.

--------------------------------------------------

5. Reduced Coupling

Classes become less dependent on each other.

--------------------------------------------------

6. Better Scalability

New features can be added easily.

--------------------------------------------------

7. Real World Examples

Student Management System

Student
    -> Stores Student Data

GradeCalculator
    -> Calculates Grades

StudentPrinter
    -> Prints Reports

--------------------------------------------------

Banking System

Account
    -> Stores Account Details

InterestCalculator
    -> Calculates Interest

StatementPrinter
    -> Prints Statements

--------------------------------------------------

E-Commerce System

Product
    -> Stores Product Information

DiscountCalculator
    -> Calculates Discount

InvoicePrinter
    -> Prints Invoice

--------------------------------------------------

Hospital Management System

Patient
    -> Stores Patient Information

BillCalculator
    -> Calculates Bill

ReportPrinter
    -> Prints Medical Reports

--------------------------------------------------

8. Interview Questions

Q1. What is Single Responsibility Principle?

Answer:

A class should have only one reason to change.
A class should perform only one responsibility.

--------------------------------------------------

Q2. Why is SRP important?

Answer:

SRP improves maintainability,
readability, reusability,
and testability of software.

--------------------------------------------------

Q3. How is SRP implemented in this program?

Answer:

Responsibilities are separated into:

• Student
• GradeCalculator
• StudentPrinter

Each class performs only one task.

--------------------------------------------------

Q4. What happens if SRP is violated?

Answer:

• Large Classes
• Difficult Maintenance
• High Coupling
• More Bugs
• Poor Reusability

--------------------------------------------------

9. Output

Student Name : Anurag Tiwari
Roll Number  : 101
Marks        : 85
Grade        : B

--------------------------------------------------

10. Conclusion

The Single Responsibility Principle (SRP)
states that a class should have only one
reason to change.

In this program:

• Student stores data.
• GradeCalculator calculates grades.
• StudentPrinter prints details.

Since each class has exactly one responsibility,
the application becomes easier to maintain,
test, reuse, and extend.

Therefore, the program successfully follows
the Single Responsibility Principle (SRP).
*/