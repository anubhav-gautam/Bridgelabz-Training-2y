// MovieTicket.java
public class MovieTicket {
    // Attributes
    String movieName;
    String seatNumber;
    double price;
    boolean isBooked;

    // Constructor
    public MovieTicket() {
        // Default values
        this.isBooked = false;
    }

    // Method to book a ticket (assign seat and price)
    public void bookTicket(String movieName, String seatNumber, double price) {
        if (!isBooked) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("This ticket is already booked.");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("=== Movie Ticket Details ===");
            System.out.println("Movie Name : " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price      : $" + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket1 = new MovieTicket();

        // Try to display before booking
        ticket1.displayTicketDetails();
        System.out.println();

        // Book the ticket
        ticket1.bookTicket("Interstellar", "A10", 12.50);
        System.out.println();

        // Display after booking
        ticket1.displayTicketDetails();
        System.out.println();

        // Try booking again (should be blocked)
        ticket1.bookTicket("Inception", "B5", 10.00);
    }
}
