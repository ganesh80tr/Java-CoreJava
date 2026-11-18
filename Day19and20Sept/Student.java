package Day19and20Sept;

public class Student {
    public static void main(String args[]){
        int english = 16;
        int hindi = 17;
        int marathi = 18;
        int math = 15;
        int science = 18;

        int total_marks = english + hindi + marathi + math + science;
        System.out.println("Total marks: " + total_marks);

        int avg_marks = total_marks/5;
        System.out.println("Average marks: " + avg_marks);
    }
}
