package NonStatic;

public class PenDriver {
    public static void main(String[] args) {
        
        Pen p1 = new Pen("Red", 100);
        System.out.println(p1.color);
        System.out.println(p1.price);

        Pen p2 = new Pen("Black", 200);
        System.out.println(p2.color);
        System.out.println(p2.price);
    }
}
