package com.constructor.level1;

//Subclass demonstrating access modifiers
public class EBook extends Book3 {

 // Method to display book details
 public void displayBookDetails() {

     // Accessing public variable
     System.out.println("ISBN: " + ISBN);

     // Accessing protected variable
     System.out.println("Title: " + title);

     // Accessing private variable using public getter
     System.out.println("Author: " + getAuthor());
 }

 public static void main(String[] args) {

     // Create EBook object
     EBook ebook = new EBook();

     // Assign values to public and protected members
     ebook.ISBN = "978-0134685991";
     ebook.title = "Effective Java";

     // Set author using public setter
     ebook.setAuthor("Joshua Bloch");

     // Display book details
     ebook.displayBookDetails();
 }
}

