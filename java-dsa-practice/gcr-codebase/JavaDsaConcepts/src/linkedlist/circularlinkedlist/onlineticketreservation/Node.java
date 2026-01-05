package linkedlist.circularlinkedlist.onlineticketreservation;

import java.util.Date;

public class Node {
	
	int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    Date bookingTime;

    Node next;

    public Node(int ticketId, String customerName, String movieName,
                int seatNumber, Date bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }

}
