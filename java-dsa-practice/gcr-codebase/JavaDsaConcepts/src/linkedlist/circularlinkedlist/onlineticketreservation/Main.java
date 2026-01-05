package linkedlist.circularlinkedlist.onlineticketreservation;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TicketList list = new TicketList();
        int choice;

        do {
            System.out.println("\n===== Online Ticket Reservation System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket by Ticket ID");
            System.out.println("3. Display All Tickets");
            System.out.println("4. Search Ticket by Customer Name");
            System.out.println("5. Search Ticket by Movie Name");
            System.out.println("6. Count Total Tickets");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();

                    System.out.print("Enter Ticket ID: ");
                    int ticketId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String customer = sc.nextLine();

                    System.out.print("Enter Movie Name: ");
                    String movie = sc.nextLine();

                    System.out.print("Enter Seat Number: ");
                    int seat = sc.nextInt();

                    Date bookingTime = new Date();

                    list.addLast(ticketId, customer, movie, seat, bookingTime);
                    break;

                case 2:
                    System.out.print("Enter Ticket ID to cancel: ");
                    list.delete(sc.nextInt());
                    break;

                case 3:
                    list.displayAll();
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter Customer Name: ");
                    list.searchByCustomer(sc.nextLine());
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Enter Movie Name: ");
                    list.searchByMovie(sc.nextLine());
                    break;

                case 6:
                    list.countTickets();
                    break;

                case 0:
                    System.out.println("Exiting Ticket Reservation System...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
