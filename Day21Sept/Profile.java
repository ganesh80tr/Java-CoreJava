package Day21Sept;
import java.util.Scanner;

public class Profile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your userName : ");
        String username = sc.nextLine();

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        sc.nextLine(); //It will consume left over

        System.out.print("Enter Your Qualification: ");
        String bio = sc.nextLine();
         
        System.out.print("Are You 18+: ");
        boolean check = sc.nextBoolean();

        System.out.println("Output: ");

        System.out.println("Your Name is : " + username + "\nYour age is : " + age + "\nYour bio is : " + bio + "\nAre you 18+: " + check);
    }
}
