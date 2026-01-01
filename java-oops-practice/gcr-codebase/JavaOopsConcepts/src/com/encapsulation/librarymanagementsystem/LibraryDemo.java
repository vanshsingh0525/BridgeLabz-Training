package com.encapsulation.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryDemo {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(101, "Java Programming", "James Gosling"));
        items.add(new Magazine(102, "Tech Today", "Editorial Team"));
        items.add(new DVD(103, "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {

            item.getItemDetails();
            System.out.println("Loan Duration : " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available : " + r.checkAvailability());
                r.reserveItem("Amit");
                System.out.println("Available After Reservation : " + r.checkAvailability());
            }

            System.out.println("-------------------------------");
        }
    }
}

