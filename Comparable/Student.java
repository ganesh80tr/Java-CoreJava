public class Student implements Comparable{
    String name;
    int age;
    String gender;

    public Student(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public int compareTo(Object o){
        Student s = (Student)o;
        return this.age - s.age;
    }

    @Override
    public String toString() {
        return "[" + this.name + ", " + this.gender + ", " + this.age + "]";
    }

    
}
