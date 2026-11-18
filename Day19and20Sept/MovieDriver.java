package Day19and20Sept;

public class MovieDriver {
    public static void main(String[] args) {
        Movie.movieName();
        Movie.theaterName ();
        int totalAmount = Movie.ticketPrice(5);
        System.out.println("Total amount: " + totalAmount);

        Movie cust1 = new Movie();
        cust1.customerName("Ganesh");
        System.out.println("Customer age: " + cust1.customerAge(2005));
        cust1.showBookingDetails("Sanket", 6);
    }
}
