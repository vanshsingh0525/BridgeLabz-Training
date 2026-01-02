package com.objectmodelling.librarybooks;

import java.util.ArrayList;

public class Library {

    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayLibraryBooks() {
        System.out.println("Library: " + libraryName);
        for (Book book : books) {
            book.displayBook();
        }
        System.out.println();
    }
}

