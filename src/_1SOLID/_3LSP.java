package _1SOLID;

class Employees
{
    public void work()
    {
        System.out.println("Employee is working");
    }
}

class Developer extends Employees
{
    @Override
    public void work()
    {
        System.out.println(
                "Developer is writing code"
        );
    }
}

class Tester extends Employees
{
    @Override
    public void work()
    {
        System.out.println(
                "Tester is testing software"
        );
    }
}

public class _3LSP
{
    public static void main(String[] args)
    {
        Employees developer =
                new Developer();

        Employees tester =
                new Tester();

        developer.work();
        tester.work();
    }
}