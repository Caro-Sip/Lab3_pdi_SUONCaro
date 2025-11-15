public class Employee {
    String name;
    int id;
    float salary;
    float gross_salary;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
        this.gross_salary = calculateGrossSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
        this.gross_salary = calculateGrossSalary(salary);
    }

    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Gross Salary: " + gross_salary);
    }

    public void displayEmployeeTable(){
        System.out.printf("%-15s %-10s %-10s %-10s%n", "Name", "ID", "Salary", "Gross Salary");
        System.out.printf("%-15s %-10d %-10.2f %-10.2f%n", name, id, salary,gross_salary);
    }

    public float calculateGrossSalary(float salary) {
        return (float)(salary + (salary * 0.2) + (salary * 0.1));
    }
}
