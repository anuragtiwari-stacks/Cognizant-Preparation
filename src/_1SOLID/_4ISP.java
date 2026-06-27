package _1SOLID;

interface Workable
{
    void work();
}

interface Eatable
{
    void eat();
}

class HumanEmployee
        implements Workable, Eatable
{
    @Override
    public void work()
    {
        System.out.println(
                "Human Employee Working"
        );
    }

    @Override
    public void eat()
    {
        System.out.println(
                "Human Employee Eating"
        );
    }
}

class RobotEmployee
        implements Workable
{
    @Override
    public void work()
    {
        System.out.println(
                "Robot Employee Working"
        );
    }
}

public class _4ISP
{
    public static void main(String[] args)
    {
        HumanEmployee human =
                new HumanEmployee();

        RobotEmployee robot =
                new RobotEmployee();

        human.work();
        human.eat();

        robot.work();
    }
}