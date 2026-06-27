package _3TestDriven._1TDD_Cycle;

public class _1TDDRed
{
    public static void main(String[] args)
    {
        RedCalculator calculator = new RedCalculator();

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

class RedCalculator
{
    public int add(int a, int b)
    {
        return 0;
    }
}