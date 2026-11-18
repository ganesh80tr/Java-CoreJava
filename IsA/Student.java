public class Student extends Person{
    int sid;
    String schoolName;

    Student(){
        //Calling non-parameterized constructor of parent
        super();
    }

    Student(String name, int age, int sid, String schoolName){
        //Calling parameterized constructor of parent using super
        super(name, age);

        this.sid = sid;
        this.schoolName = schoolName;
    }


}
