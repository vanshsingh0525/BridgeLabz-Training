package com.inheritance.singleinheritance;

public class LibraryTest {

    public static void main(String[] args) {

        Author bookWithAuthor = new Author(
                "Effective Java",
                2018,
                "Joshua Bloch",
                "Expert in Java programming and API design"
        );

        bookWithAuthor.displayInfo();
    }
}


