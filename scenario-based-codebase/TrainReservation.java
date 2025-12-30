/*
Train Reservation Queue 
Simulate a basic ticket booking system.
- Show menu with switch
- Allow multiple bookings using while-loop.
- Stop booking once seats reach zero (break).
*/

import java.util.Scanner;

public class TrainReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Total seats in train
        final int totalSeats = 30;
        // Count of occupied seats
        int occupiedSeats = 0;
        int bookingNum;
        int cancelNum;

        do {
	    //Take user input
            System.out.println("\nEnter your choice : book, available-seats, cancel");
            String input = sc.next().trim().toLowerCase();

            switch (input) {
		//If user wants to book tickets
                case "book":
                    System.out.print("Enter number of tickets to book : ");
                    bookingNum = sc.nextInt();

                    if (bookingNum <= 0) {
                        System.out.println("Invalid ticket count.");
                    } 
		    else if (bookingNum > (totalSeats - occupiedSeats)) {
                        System.out.println("Not enough seats available.");
                    } 
		    else {
                        occupiedSeats += bookingNum;
                        System.out.printf("Booking confirmed for %d ticket.%n", bookingNum);
                    }
                    break;

		//If user wants to see available seats
                case "available-seats":
                    System.out.println("Available seats : " + (totalSeats - occupiedSeats));
                    break;

		//If user wants to cancel tickets
                case "cancel":
                    System.out.print("Enter number of tickets to cancel : ");
                    cancelNum = sc.nextInt();

                    if (cancelNum <= 0) {
                        System.out.println("Invalid ticket count.");
                    } 
 		    else if (cancelNum > occupiedSeats) {
                        System.out.println("Cannot cancel more tickets than booked.");
                    } 
	            else {
                        occupiedSeats -= cancelNum;
                        System.out.printf("%d ticket cancelled.%n", cancelNum);
                    }
                    break;

		//If the input does not match the menu options
                default:
                    System.out.println("Invalid input, try again.");
            }

        } 
        while (occupiedSeats < totalSeats); //Terminating condition

        System.out.println("\nAll seats are booked. Thank you for visiting!");
    }
}