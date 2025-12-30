import java.util.Scanner;

public class MovieTicketBooking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop to handle multiple customers
        while (true) {

            // Ask for movie type
            System.out.println("Enter movie type (Action / Comedy / Drama) or Exit to stop:");
            String movieType = scanner.nextLine();
            // Exit condition
            if (movieType.equalsIgnoreCase("Exit")) {
                break;
            }

            // Ask for seat type
            System.out.println("Enter seat type (Gold / Silver):");
            String seatType = scanner.nextLine();
            // Ask if snacks are required
            System.out.println("Do you want snacks? (Yes / No):");
            String snacksChoice = scanner.nextLine();

            // Base ticket price
            double ticketPrice = 0.0;

            // Switch statement to set base price based on movie type
            switch (movieType.toLowerCase()) {

                case "action":
                    ticketPrice = 200;
                    break;

                case "comedy":
                    ticketPrice = 150;
                    break;

                case "drama":
                    ticketPrice = 180;
                    break;
            }

            // If condition to add price based on seat type
            if (seatType.equalsIgnoreCase("Gold")) {
                ticketPrice = ticketPrice + 100;
            } 
	    else if (seatType.equalsIgnoreCase("Silver")) {
                ticketPrice = ticketPrice + 50;
            }

            // If condition to add snacks cost
            if (snacksChoice.equalsIgnoreCase("Yes")) {
                ticketPrice = ticketPrice + 80;
            }

            // Display final ticket cost
            System.out.println("Total Ticket Cost: " + ticketPrice);
        }
    }
}
