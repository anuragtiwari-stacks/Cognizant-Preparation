package _3TestDriven._2IntroductionToUnitTesting;

public class _2UnitTestingDemo
{
    public static void main(String[] args)
    {
        _1Calculator calculator = new _1Calculator();

        // Test Addition
        if(calculator.add(5, 5) == 10)
        {
            System.out.println("Addition Test Passed");
        }
        else
        {
            System.out.println("Addition Test Failed");
        }

        // Test Subtraction
        if(calculator.subtract(10, 4) == 6)
        {
            System.out.println("Subtraction Test Passed");
        }
        else
        {
            System.out.println("Subtraction Test Failed");
        }

        // Test Multiplication
        if(calculator.multiply(5, 4) == 20)
        {
            System.out.println("Multiplication Test Passed");
        }
        else
        {
            System.out.println("Multiplication Test Failed");
        }

        // Test Division
        if(calculator.divide(20, 5) == 4)
        {
            System.out.println("Division Test Passed");
        }
        else
        {
            System.out.println("Division Test Failed");
        }
    }
}