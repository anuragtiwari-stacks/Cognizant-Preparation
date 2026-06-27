package _1SOLID;

class Employee
{
    private int id;
    private String name;

    public Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
}

class EmployeeRepository
{
    public void save(Employee employee)
    {
        System.out.println(
                "Saving Employee -> Id: "
                        + employee.getId()
                        + ", Name: "
                        + employee.getName()
        );
    }
}

public class _1SRP
{
    public static void main(String[] args)
    {
        Employee employee = new Employee(1, "Anurag");

        EmployeeRepository repository = new EmployeeRepository();

        repository.save(employee);
    }
}