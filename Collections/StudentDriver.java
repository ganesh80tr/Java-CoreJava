import java.util.*;

public class StudentDriver {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(78, "Ganesh", 21));
        students.add(new Student(32, "Sanket", 22));
        students.add(new Student(67, "Ganesh", 34));
        students.add(new Student(56, "Ganesh", 21));
        students.add(new Student(87, "Ganesh", 25));

        System.out.println(students);
    }
}
