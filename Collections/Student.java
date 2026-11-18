import java.util.Objects;

public class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

     @Override
    public String toString() {
        return "[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ']';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

}
