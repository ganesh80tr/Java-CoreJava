package Day22Sept;

public class DivisibleBy5And11 {
    public static void checkDivisibility(int n) {

        if (n % 5 == 0 && n % 11 == 0) {
            System.out.println("Divisible by both 5 and 11");
        }
        else if (n % 5 == 0) {
            System.out.println("Divisible by 5");
        }
        else if (n % 11 == 0) {
            System.out.println("Divisible by 11");
        }
        else {
            System.out.println("Not divisible by 5 or 11");
        }
    }

    public static void main(String[] args) {

        checkDivisibility(55);
        checkDivisibility(5);
        checkDivisibility(11);
    }
}
