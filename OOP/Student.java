public class Student {
    //Static memebers
    static String collegeName = "ABCD";

    //Non static members
    int rollNo;
    String name;
    String branch;
    int age;
    String gender;
    String address;
    long mobileNo;

    //Constructor
    public Student(int rollNo, String name, String branch, int age, String gender, String address, long mobileNo){
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.gender = gender;
        this.address = address;
        this.mobileNo = mobileNo;
    }

    public void Details(){
        System.out.println("Name: " + name);
        System.out.println("College: " + collegeName);
        System.out.println("Branch: " + branch);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Mobile: " + mobileNo);
    }
}
