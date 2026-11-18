public class PenDriver {
    public static void main(String[] args) {
        Pen p1 = new Pen("Red", "Montex", 150.50);
        System.out.println("p1: " + p1.toString());

        Pen p2 = new Pen("Black", "Cello", 190.50);
        System.out.println("p2: " + p2.toString());
        System.out.println("p1 equals to p2: " + p1.equals(p2));

        Pen p3 = new Pen("Red", "Montex", 150.50);
        System.out.println("p1: " + p1.toString()); 
        System.out.println("p3: " + p3.toString());
        System.out.println("p1 equals to p3: " + p1.equals(p3));
    }
}
