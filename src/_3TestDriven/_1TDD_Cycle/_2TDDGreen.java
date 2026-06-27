package _3TestDriven._1TDD_Cycle;

public class _2TDDGreen
{
    public static void main(String[] args)
    {
        GreenCalculator calculator = new GreenCalculator();

        if(calculator.add(5, 5) == 10)
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
        }
    }
}

class GreenCalculator
{
    public int add(int a, int b)
    {
        return 10;
    }
}