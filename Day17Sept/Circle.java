package Day17Sept;

public class Circle {
    public static double pi(){
        return 3.141559265359;
    }

    public static double circumference(double radius){
        double res = 2*3.1415*radius;
        return res;
    }

    public static double area(double radius){
        double res = 3.1415*radius*radius;
        return res;
    }
    public static void main(String[] args) {
        double resOfArea = area(7.5);
        System.out.println(resOfArea);
        System.out.println(circumference(7.5));
    }
}
