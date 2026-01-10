package bookshelf;

public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }

    // Needed to avoid duplicates using HashSet
    @Override
    public boolean equals(Object obj) {
        Book b = (Book) obj;
        return title.equals(b.title) && author.equals(b.author);
    }
//
//    @Override
//    public int hashCode() {
//        return title.hashCode() + author.hashCode();
//    }
}

