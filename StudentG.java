import java.util.ArrayList;
import java.util.List;

public class StudentG 
{
    int id = 0;
    String name = "";
    List<String> courses = new ArrayList<>();
    List<Float> marks = new ArrayList<>();
    List<Character> grades = new ArrayList<>();
    float total = 0;
    float avg = 0;

    StudentG()
    {

    }

    StudentG(String name, List<String> courses, List<Float> marks)
    {
        this.name = name;
        this.courses = courses;
        this.marks = marks;
        calculateMarks();
    }

    public void addCourse(String course)
    {
        this.courses.add(course);
    }

    public void addMark(float mark)
    {
        this.marks.add(mark);
    }

    public void changeID(int id)
    {
        this.id = id;
    }

    public void calculateMarks()
    {
        float total = 0;
        for (float mark : marks) 
        {
            total += mark;
        }
        this.total = total;
        this.avg = total / marks.size();
        calculateGrade();
    }

    public void calculateGrade()
    {
        for (int i = 0; i < marks.size(); i++)
        {
            float mark = marks.get(i);
            char grade;
            if (mark >= 90) 
            {
                grades.add('A');
            } 
            else if (mark >= 75) 
            {
                grades.add('B');
            } 
            else if (mark >= 50) 
            {
                grades.add('C');
            }
            else if (mark < 50)
            {
                grades.add('F');
            }
            else
            {
                grades.add('N'); // N for Not Available
            }
        }
    }

    public void displayStudentInfo()
    {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Courses, Marks, and Grades:");
        for (int i = 0; i < courses.size(); i++)
        {
            System.out.println(courses.get(i) + ": " + marks.get(i) + " - " + grades.get(i));
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }

    public void displayStudentInfoTable()
    {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);

        System.out.printf("%-20s %-20s %-10s%n", "Course", "Mark", "Grade");
        for (int i = 0; i < courses.size(); i++)
        {
            System.out.printf("%-20s %-20.2f %-10c%n", courses.get(i), marks.get(i), grades.get(i));
        }
        System.out.printf("Total Marks: %.2f%n", total);
        System.out.printf("Average Marks: %.2f%n%n", avg);
    }
}