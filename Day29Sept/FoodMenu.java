package Day29Sept;

import java.util.Scanner;

public class FoodMenu {

    public static int purchaseFood(int choice, int quantity) {

        switch(choice) {

            case 1: {
                return quantity * 250;
            }

            case 2: {
                return quantity * 150;
            }

            case 3: {
                return quantity * 120;
            }

            case 4: {
                return quantity * 200;
            }

            default: {
                return -1;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("For pizza type 1 - 250");
        System.out.println("For burger type 2 - 150");
        System.out.println("For sandwich type 3 - 120");
        System.out.println("For pasta type 4 - 200");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if(choice < 1 || choice > 4) {
            System.out.println("Please enter correct choice");
            return;
        }

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        int res = purchaseFood(choice, quantity);

        System.out.println("Your bill is: " + res); 
    }
}