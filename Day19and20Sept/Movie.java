package Day19and20Sept;

public class Movie {
    //Static methods
    public static void movieName(){
        System.out.println("Movie name: Mirzapur");
    }

    public static void theaterName(){
        System.out.println("Theater name: PVR");
    }

    public static int ticketPrice(int tickets){
        return tickets * 200;
    }

    //Non static method
    public void customerName(String name){
        System.out.println("Customer Name: " + name);
    }

    public int customerAge(int birthYear){
        return 2026 - birthYear;
    }

    public void showBookingDetails(String name, int tickets){
        System.out.println("Customer name: " + name);
        System.out.println("Number of ticket: " + tickets);
        System.out.println("Total amount: " + ticketPrice(tickets));
    }
}
