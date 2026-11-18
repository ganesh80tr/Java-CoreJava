package Day17Sept;

public class Rectangle {
    public static double perimeter(double length, double width){
        return 2*(length+width);
    }

    public static double area(double length, double width){
        return length*width;
    }
    public static void main(String[] args) {
        System.out.println("Perimeter: " + perimeter(20,30));
        System.out.println("Area: " + area(10,30));
    }
}
