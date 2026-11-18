import java.util.Objects;

public class Student{
    int id;
    String name;
    int age;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override 
    public String toString(){
        return "[ Id: " + id + ", Name: " + name + ", Age: " + age + " ]";
    }

    @Override 
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        
        Student s = (Student)o;
        // return this.id==s.id && this.name.equals(s.name) && this.age==s.age;
        //We can remove this keyword
        return id==s.id && name.equals(s.name) && age==s.age;
    }

    @Override 
    public int hashCode(){
        return Objects.hash(id, name, age);
    }
}