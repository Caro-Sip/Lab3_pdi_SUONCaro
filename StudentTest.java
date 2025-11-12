import java.util.ArrayList;
import java.util.List;

public class StudentTest 
{
    public static void main(String[] argv)
    {
        Student student1 = new Student("Mi Sorakmony", 1, "SE");
        Student student2 = new Student("Suon Caro" , 2, "SE");


        student1.setUpdatename("Mi Sorakmony");

        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(new Student("Dara Panhaseth", 3, "SE"));
        students.add(new Student("Sao Dalyinaco", 4, "SE"));
        students.add(new Student("Thai Monika", 5, "SE"));

        for(Student s : students)
        {
            s.print();
        }

        System.out.print(student2.id);
    }
}