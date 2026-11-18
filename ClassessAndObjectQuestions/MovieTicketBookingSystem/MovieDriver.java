package MovieTicketBookingSystem;

public class MovieDriver {
    public static void main(String[] args) {
        // Movie 1
        Movie movie1 = new Movie("Mirzapur", "PVR", 200);

        // Customer 1
        Customer customer1 = new Customer("Ganesh", 22);

        // Booking 1
        Booking booking1 = new Booking(movie1, customer1, 3);

        System.out.println("===== BOOKING 1 =====");
        booking1.displayBookingDetails();


        // Movie 2
        Movie movie2 = new Movie("Avengers", "INOX", 250);

        // Customer 2
        Customer customer2 = new Customer("Sanket", 21);

        // Booking 2
        Booking booking2 = new Booking(movie2, customer2, 2);

        System.out.println("\n===== BOOKING 2 =====");
        booking2.displayBookingDetails();
    }
}
