public class CarDriver {
    public static void main(String[] args) {
        Car m4 = new Car("blcak","BMW");
        Car m5 = new Car("Red", "BMW");

        System.out.println(m4.e); // address of first
        System.out.println(m5.e); // address of second 

        System.out.println(m4.e.hp); 
        System.out.println(m5.e.hp);
    }
}
