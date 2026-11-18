package Fastrack;

public class Result<T> {
    String studentName;
    T marks;

    Result(String studentName, T marks){
        this.studentName = studentName;
        this.marks = marks;
    }

    public void displayResult(){
        System.out.println("Name: " + studentName);
        System.out.println("Marks: " + marks);
    }
}
