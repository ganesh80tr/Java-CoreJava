package MovieTicketBookingSystem;

public class Movie{
    String movieName;
    String theaterName;
    int ticketPrice;

    public Movie(String movieName, String theaterName, int ticketPrice){
        this.movieName = movieName;
        this.theaterName = theaterName;
        this.ticketPrice = ticketPrice;
    }

    public void displayMovieDetails(){
        System.out.println("Movie Name: " + movieName);
        System.out.println("Theater Name: " + theaterName);
        System.out.println("Ticket Price: " + ticketPrice);
    }

    public int calculateTicketPrice(int numberOfTickets){
        return ticketPrice*numberOfTickets;
    }
}