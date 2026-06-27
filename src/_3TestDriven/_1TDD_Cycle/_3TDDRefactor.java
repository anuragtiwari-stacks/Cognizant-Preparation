package _3TestDriven._1TDD_Cycle;

public class _3TDDRefactor
{
    public static void main(String[] args)
    {
        RefactorCalculator calculator = new RefactorCalculator();

        if(calculator.add(5, 5) == 10)
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
        }

        System.out.println("Addition = " + calculator.add(5, 5)
        );
    }
}

class RefactorCalculator
{
    public int add(int a, int b)
    {
        return a + b;
    }
}