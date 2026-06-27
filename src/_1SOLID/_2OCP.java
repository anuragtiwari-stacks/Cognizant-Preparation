package _1SOLID;

interface SalaryCalculator
{
    double calculateSalary();
}

class FullTimeEmployee implements SalaryCalculator
{
    private double monthlySalary;

    public FullTimeEmployee(double monthlySalary)
    {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary()
    {
        return monthlySalary;
    }
}

class ContractEmployee implements SalaryCalculator
{
    private int hoursWorked;
    private double hourlyRate;

    public ContractEmployee(
            int hoursWorked,
            double hourlyRate
    )
    {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary()
    {
        return hoursWorked * hourlyRate;
    }
}

public class _2OCP
{
    public static void main(String[] args)
    {
        SalaryCalculator fullTime =
                new FullTimeEmployee(50000);

        SalaryCalculator contract =
                new ContractEmployee(100, 500);

        System.out.println(
                "Full Time Salary: "
                        + fullTime.calculateSalary()
        );

        System.out.println(
                "Contract Salary: "
                        + contract.calculateSalary()
        );
    }
}