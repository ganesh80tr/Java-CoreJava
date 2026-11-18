public class PenDriver {
    
    public static void printPenDetails(Pen p){
        System.out.println(p.getColor());
        System.out.println(p.getBrand());
        System.out.println(p.getPrice());
    }

    public static Pen getPen(String color){
        Pen p = new Pen(color, "Trimax", 150);
        return p;
    }

    public static void main(String[] args) {
        Pen p1 = getPen("Red");
        Pen p2 = getPen("Black");
        Pen p3 = getPen("Green");

        printPenDetails(p1);
        System.out.println("----------------------");
        printPenDetails(p2);
        System.out.println("----------------------");
        printPenDetails(p3);
    }
}
