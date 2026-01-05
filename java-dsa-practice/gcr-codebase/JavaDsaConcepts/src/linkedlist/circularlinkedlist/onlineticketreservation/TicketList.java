package linkedlist.circularlinkedlist.onlineticketreservation;

import java.util.Date;

public class TicketList {

    private Node head;
    private Node tail;

    // ------------------- ADD -----------------------

    // Add new ticket at the end
    public void addLast(int ticketId, String customerName,
                        String movieName, int seatNumber, Date bookingTime) {

        Node newNode = new Node(ticketId, customerName, movieName, seatNumber, bookingTime);

        // Empty list
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            System.out.println("Ticket booked successfully");
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;

        System.out.println("Ticket booked successfully");
    }

    // ------------------- DELETE -----------------------

    // Remove ticket by Ticket ID
    public void delete(int ticketId) {

        if (head == null) {
            System.out.println("No tickets available");
            return;
        }

        Node curr = head;
        Node prev = tail;

        do {
            if (curr.ticketId == ticketId) {

                // Only one ticket
                if (head == tail) {
                    head = tail = null;
                }
                // Deleting head
                else if (curr == head) {
                    head = head.next;
                    tail.next = head;
                }
                // Deleting tail
                else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                }
                // Deleting middle
                else {
                    prev.next = curr.next;
                }

                System.out.println("Ticket cancelled");
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Ticket not found");
    }

    // ------------------- DISPLAY -----------------------

    // Display all tickets
    public void displayAll() {

        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Node temp = head;
        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // ------------------- SEARCH -----------------------

    // Search ticket by Customer Name
    public void searchByCustomer(String customerName) {

        if (head == null) {
            System.out.println("No tickets available");
            return;
        }

        Node temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(customerName)) {
                System.out.println("Ticket Found:");
                displayTicket(temp);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Ticket not found");
    }

    // Search ticket by Movie Name
    public void searchByMovie(String movieName) {

        if (head == null) {
            System.out.println("No tickets available");
            return;
        }

        Node temp = head;
        do {
            if (temp.movieName.equalsIgnoreCase(movieName)) {
                System.out.println("Ticket Found:");
                displayTicket(temp);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Ticket not found");
    }

    // ------------------- COUNT -----------------------

    // Count total number of tickets
    public void countTickets() {

        if (head == null) {
            System.out.println("Total tickets booked: 0");
            return;
        }

        int count = 0;
        Node temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total tickets booked: " + count);
    }

    // ------------------- HELPER -----------------------

    private void displayTicket(Node temp) {
        System.out.println("-----------------------------");
        System.out.println("Ticket ID      : " + temp.ticketId);
        System.out.println("Customer Name  : " + temp.customerName);
        System.out.println("Movie Name     : " + temp.movieName);
        System.out.println("Seat Number    : " + temp.seatNumber);
        System.out.println("Booking Time   : " + temp.bookingTime);
        System.out.println("-----------------------------");
    }
}
