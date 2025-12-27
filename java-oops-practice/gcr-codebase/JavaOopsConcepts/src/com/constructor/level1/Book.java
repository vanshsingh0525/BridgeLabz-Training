package com.constructor.level1;

public class Book {

    // Attributes
    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        title = "Not Available";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Main method for testing
    public static void main(String[] args) {

        // Using default constructor
        Book book1 = new Book();

        // Using parameterized constructor
        Book book2 = new Book("Java Programming", "James Gosling", 499.50);
    }
}

