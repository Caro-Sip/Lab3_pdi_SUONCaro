import java.util.List;
import java.util.ArrayList;

public class Student_Grades 
{
    public static void main(String[] args)
    {
        List<StudentG> students = new ArrayList<StudentG>();

        try(java.util.Scanner scanner = new java.util.Scanner(System.in))
        {
            System.out.print("Enter number of students: ");
            int student_count = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after nextInt()

            System.err.println("\n--- Note: Each student must have exactly 5 courses. ---\n");

            for(int counter = 0; counter < student_count; counter++)
            {
                List<String> courses = new ArrayList<>();
                List<Float> marks = new ArrayList<>();

                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                System.out.println("Enter 5 courses and their marks: ");
                for (int i = 0; i < 5; i++)
                {
                    System.out.print("Course " + (i + 1) + ": ");
                    String course = scanner.nextLine();
                    courses.add(course);
                    System.out.print("Mark for " + course + ": ");
                    float mark = scanner.nextFloat();
                    marks.add(mark);
                    scanner.nextLine(); // Consume the newline character
                }

                StudentG student = new StudentG(name, courses, marks);
                student.changeID(counter);

                students.add(student);

                System.out.print("\n");
            }
        }
        catch (Exception e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }

        for (StudentG student : students)
        {
            student.displayStudentInfoTable();
        }
    }
}
