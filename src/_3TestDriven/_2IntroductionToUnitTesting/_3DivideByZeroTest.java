package _3TestDriven._2IntroductionToUnitTesting;

public class _3DivideByZeroTest
{
    public static void main(String[] args)
    {
        _1Calculator calculator = new _1Calculator();

        try
        {
            calculator.divide(10, 0);
            System.out.println("Test Failed");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Test Passed");
            System.out.println(e.getMessage());
        }
    }
}