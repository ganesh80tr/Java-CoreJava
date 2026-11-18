package Day19and20Sept;

public class SumThreeDigit {
    public static void main(String[] args) {
        int digit = 123;
        int sum = 0;

        while(digit > 0){
            sum = sum + (digit%10);
            digit = digit / 10;
        }

        System.out.println("Sum of Digit: " + sum);
    }
}
