public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ganesh", 22);
        System.out.println(s1.toString());

        Student s2 = new Student(102, "Sanket", 22);
        System.out.println(s2.toString());
        System.out.println(s1.equals(s2));

        Student s3 = new Student(101, "Ganesh", 22);
        System.out.println(s3.toString());
        System.out.println(s1.equals(s3));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}