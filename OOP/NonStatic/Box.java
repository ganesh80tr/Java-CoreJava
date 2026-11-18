package NonStatic;

public class Box {
    double length;
    double breadth;

    public Box(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea(){
        return length*breadth;
    }
}
