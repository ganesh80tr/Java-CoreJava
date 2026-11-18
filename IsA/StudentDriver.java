public class StudentDriver{
    public static void main(String[] args) {
        //Calling parameterized constructor
        Student s1 = new Student("Ganesh", 21, 108, "slrtce");

        //Calling non-parameterized constructor
        Student s2 = new Student();

        System.out.println(s1.name);
        System.out.println(s2.schoolName);
    }
}