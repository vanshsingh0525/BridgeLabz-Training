package bookshelf;

public class LibraryApp {
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("Animal Farm", "George Orwell");
        Book b3 = new Book("Dune", "Frank Herbert");

        shelf.addBook("Fiction", b1);
        shelf.addBook("Fiction", b2);
        shelf.addBook("Sci-Fi", b3);

        shelf.displayCatalog();

        shelf.borrowBook("Fiction", b1);
        shelf.displayCatalog();

        shelf.returnBook("Fiction", b1);
        shelf.displayCatalog();
    }
}
