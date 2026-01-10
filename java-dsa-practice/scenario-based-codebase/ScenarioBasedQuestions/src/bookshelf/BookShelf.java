package bookshelf;

import java.util.*;

public class BookShelf {

    // genre : list of books
    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();
    private HashSet<Book> uniqueBooks = new HashSet<>(); // optional

    // Add book
    public void addBook(String genre, Book book) {
        if (uniqueBooks.contains(book)) {
            System.out.println("Duplicate book ignored: " + book);
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        uniqueBooks.add(book);

        System.out.println("Added: " + book + " to " + genre);
    }

    // Borrow book
    public void borrowBook(String genre, Book book) {
        LinkedList<Book> books = catalog.get(genre);
        if (books != null && books.remove(book)) {
            uniqueBooks.remove(book);
            System.out.println("Borrowed: " + book);
        } else {
            System.out.println("Book not available");
        }
    }

    // Return book
    public void returnBook(String genre, Book book) {
        addBook(genre, book);
    }

    // Display catalog
    public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println(genre + " : " + catalog.get(genre));
        }
    }
}
