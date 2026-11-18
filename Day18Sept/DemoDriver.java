package Day18Sept;

public class DemoDriver {
    public static void main(String[] args) {
        //Calling static method 
        Demo.test();

        //Creating object of class Demo
        Demo d = new Demo();
        //Calling non static method using obejct
        d.task();

        //Calling main method of another class
        Demo.main(args);
    }
}
