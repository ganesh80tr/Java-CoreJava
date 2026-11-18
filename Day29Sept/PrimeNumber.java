package Day29Sept;

public class PrimeNumber {
    public static boolean isPrimeOptimized01(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrimeOptimized02(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }

        for(int i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}
