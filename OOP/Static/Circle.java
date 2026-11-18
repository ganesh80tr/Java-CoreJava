package Static;

public class Circle {
    static {
        System.out.println("Static block/Initializer");
        pi = 3.1415;
    }
    
    static double pi;

    public static double area(double r){
        return pi * r * r;
    }
}
