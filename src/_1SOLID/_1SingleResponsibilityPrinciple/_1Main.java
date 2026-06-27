package _1SOLID._1SingleResponsibilityPrinciple;

public class _1Main
{

    public static void main(String[] args)
    {

        Employee employee = new Employee(
                "Anurag Tiwari",
                "Software Developer",
                50000);

        SalaryCalculator calculator =
                new SalaryCalculator();

        double salary =
                calculator.calculateSalary(employee);

        EmployeePrinter printer =
                new EmployeePrinter();

        printer.printEmployeeDetails(employee);

        System.out.println(
                "Calculated Salary = " + salary);
    }
}

class Employee
{

    private String name;
    private String designation;
    private double baseSalary;

    public Employee(
            String name,
            String designation,
            double baseSalary)
    {
        this.name = name;
        this.designation = designation;
        this.baseSalary = baseSalary;
    }

    public String getName()
    {
        return name;
    }

    public String getDesignation()
    {
        return designation;
    }

    public double getBaseSalary()
    {
        return baseSalary;
    }
}

class SalaryCalculator
{

    public double calculateSalary(Employee employee)
    {

        return employee.getBaseSalary()
                + (employee.getBaseSalary() * 0.10);
    }
}

class EmployeePrinter
{

    public void printEmployeeDetails(Employee employee)
    {

        System.out.println(
                "Employee Name : "
                        + employee.getName());

        System.out.println(
                "Designation   : "
                        + employee.getDesignation());

        System.out.println(
                "Base Salary   : "
                        + employee.getBaseSalary());
    }
}

/*
SINGLE RESPONSIBILITY PRINCIPLE (SRP)

1. Definition

The Single Responsibility Principle (SRP) is the first
principle of the SOLID principles of Object-Oriented Programming.

It states:

"A class should have only one reason to change."

This means a class should have only one responsibility
or one job.

Each class should focus on performing a single task only.

--------------------------------------------------

2. What Does "One Reason To Change" Mean?

A reason to change means a modification required in a class
because of a change in business requirements.

For example:

Employee Class Responsibilities:

• Store employee information
• Calculate salary
• Print employee details
• Save data to database

Now suppose:

• Salary calculation rule changes
• Printing format changes
• Database changes

The Employee class must be modified for all these changes.

This means the class has multiple reasons to change,
which violates SRP.

--------------------------------------------------

3. Why Do We Need SRP?

Without SRP:

• Classes become very large.
• Code becomes difficult to understand.
• Maintenance becomes difficult.
• Bugs increase.
• Reusability decreases.
• Testing becomes difficult.

SRP helps create:

• Clean Code
• Modular Design
• Better Maintainability
• Better Reusability
• Better Testability

--------------------------------------------------

4. Problem Without SRP

class Employee
{

    public void calculateSalary()
    {

    }

    public void printEmployee()
    {

    }

    public void saveToDatabase()
    {

    }
}

Problems:

1. Salary changes affect Employee class.

2. Printing changes affect Employee class.

3. Database changes affect Employee class.

4. Multiple developers working on different features
   may modify the same class.

5. High coupling is created.

Hence SRP is violated.

--------------------------------------------------

5. SRP-Compliant Design

Instead of one large class,
divide responsibilities.

Employee Class
    -> Stores Employee Data

SalaryCalculator Class
    -> Calculates Salary

EmployeePrinter Class
    -> Prints Employee Details

Now every class has exactly one responsibility.

--------------------------------------------------

6. How SRP Is Implemented In This Program

Employee Class

Responsibility:

• Store employee data

SalaryCalculator Class

Responsibility:

• Calculate employee salary

EmployeePrinter Class

Responsibility:

• Print employee information

Each class has only one reason to change.

Therefore SRP is satisfied.

--------------------------------------------------

7. Advantages Of SRP

1. Easy Maintenance

2. Better Readability

3. Better Reusability

4. Easy Unit Testing

5. Reduced Coupling

6. Better Scalability

7. Better Team Collaboration

--------------------------------------------------

8. Real-World Examples

Banking System

Account Class
    -> Stores account details

InterestCalculator Class
    -> Calculates interest

AccountPrinter Class
    -> Prints account statement

--------------------------------------------------

E-Commerce System

Product Class
    -> Stores product data

DiscountCalculator Class
    -> Calculates discount

InvoicePrinter Class
    -> Generates invoice

--------------------------------------------------

Hospital Management System

Patient Class
    -> Stores patient details

BillCalculator Class
    -> Calculates bill

PatientPrinter Class
    -> Prints reports

--------------------------------------------------

9. Interview Questions

Q1. What is Single Responsibility Principle?

Answer:

A class should have only one reason to change.
A class should have only one responsibility.

--------------------------------------------------

Q2. Why is SRP important?

Answer:

SRP improves maintainability,
readability, testability,
and reusability of code.

--------------------------------------------------

Q3. How is SRP implemented in this program?

Answer:

Responsibilities are separated into:

• Employee
• SalaryCalculator
• EmployeePrinter

Each class performs one task only.

--------------------------------------------------

10. Conclusion

The Single Responsibility Principle (SRP) states
that a class should have only one reason to change.

In this program:

• Employee stores employee data.
• SalaryCalculator calculates salary.
• EmployeePrinter prints employee details.

Because every class has exactly one responsibility,
the program becomes easier to understand,
maintain, test, reuse, and extend.

Therefore, the application successfully follows
the Single Responsibility Principle (SRP).
*/