package MovieTicketBookingSystem;

public class Booking {
    Movie movie;
    Customer customer;
    int numberOfTickets;

    public Booking(Movie movie, Customer customer, int numberOfTickets) {
        this.movie = movie;
        this.customer = customer;
        this.numberOfTickets = numberOfTickets;
    }

    public void displayBookingDetails() {

        movie.displayMovieDetails();

        System.out.println();

        customer.displayCustomerDetails();

        System.out.println();

        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Total Amount: " + calculateTotalAmount());
    }

    public int calculateTotalAmount() {
        return movie.calculateTicketPrice(numberOfTickets);
    }
}
