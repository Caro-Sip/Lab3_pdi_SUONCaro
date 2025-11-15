import java.util.List;
import java.util.ArrayList;

public class Employee_Management 
{
    public static void main(String[] args)
    {
        List<Employee> employees = new ArrayList<Employee>();
        int number_of_employees = 0;

        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) 
        {
            System.out.print("Enter the number of employees: ");
            number_of_employees = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < number_of_employees; i++) 
            {
                String name = "";
                float salary = 0;

                System.out.print("\nEnter employee " + (i + 1) + " name: ");
                name = scanner.nextLine();

                System.out.print("Enter employee " + (i + 1) + " salary: ");
                salary = scanner.nextFloat();
                
                scanner.nextLine();
                
                Employee temp = new Employee(name, salary);
                temp.setId(i);
                
                employees.add(temp);
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

        System.out.println("\n--- Employee Details ---");

        for (Employee emp : employees) 
        {
            emp.displayEmployeeTable();
        }
    }
}