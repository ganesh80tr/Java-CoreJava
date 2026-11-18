import java.util.Arrays;

public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student("ganesh", 21, "male");
        Student s2 = new Student("sanket", 18, "male");
        Student s3 = new Student("prince", 25, "male");
        Student s4 = new Student("kshtij", 15, "male");
        Student s5 = new Student("sid", 56, "male");

        Student[] arr = new Student[5];

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = s4;
        arr[4] = s5;

        // System.out.println(s1.compareTo(s2));
        // System.out.println(s4.compareTo(s3));

        for(Student s: arr){
            System.out.println(s);
        }

        System.out.println("----------------------");

        Arrays.sort(arr);

        for(Student s: arr){
            System.out.println(s);
        }
    }
}
