package com.objectmodelling.librarybooks;

public class AggregationDemo {

    public static void main(String[] args) {

        // Books exist independently
        Book book1 = new Book("Java", "Author A");
        Book book2 = new Book("Python", "Author B");
        Book book3 = new Book("C++", "Author C");

        // Libraries
        Library library1 = new Library("Central Library");
        Library library2 = new Library("College Library");

        // Adding books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);
        library2.addBook(book3);

        // Display libraries
        library1.displayLibraryBooks();
        library2.displayLibraryBooks();
    }
}

