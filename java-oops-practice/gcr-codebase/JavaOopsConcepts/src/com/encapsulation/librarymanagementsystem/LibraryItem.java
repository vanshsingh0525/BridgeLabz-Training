package com.encapsulation.librarymanagementsystem;

public abstract class LibraryItem {

    // Encapsulated fields
    private int itemId;
    private String title;
    private String author;

    // Sensitive borrower data (encapsulation)
    private String borrowerName;
    private boolean isAvailable = true;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters (no direct access to sensitive data)
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected void setBorrower(String borrowerName) {
        this.borrowerName = borrowerName;
        this.isAvailable = false;
    }

    protected void clearBorrower() {
        this.borrowerName = null;
        this.isAvailable = true;
    }

    protected boolean isAvailable() {
        return isAvailable;
    }

    // Abstract method
    public abstract int getLoanDuration(); // in days

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID   : " + itemId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Available : " + isAvailable);
    }
}

