public class Student
{
    String name;
    int id;
    String major;

    Student()
    {

    }

    Student(String newname, int id, String major)
    {
        name = newname;
        this.id = id;
        this.major = major;
    }

    public void print()
    {
        System.out.println("Name of Student: " + name);
        System.out.println("ID " + id);
        System.out.println("Major " + major);
        System.out.println("----------------------------\n");
    }

    public void print_table()
    {
        System.out.printf("| %5d | %-20s | %-10s |\n", id, name, major);
    }

    public void setUpdatename(String name)
    {
        this.name = name;
    }
}