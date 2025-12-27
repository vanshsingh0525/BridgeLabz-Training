package com.constructor.level1;

public class Book2 {

    // Attributes
    String title;
    String author;
    double price;
    boolean available;

    // Parameterized Constructor
    Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true; // book is available initially
    }

    // Method to borrow a book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed \"" + title + "\"");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    // Method to display book details
    void displayBookDetails() {
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Price        : " + price);
        System.out.println("Availability : " + (available ? "Available" : "Borrowed"));
    }

    // Main method for testing
    public static void main(String[] args) {

        Book2 book1 = new Book2("Java Programming", "James Gosling", 450.0);
        book1.displayBookDetails();

        // Borrow the book
        book1.borrowBook();

        // Try borrowing again
        book1.borrowBook();
        System.out.println("------------------");

        book1.displayBookDetails();
    }
}

