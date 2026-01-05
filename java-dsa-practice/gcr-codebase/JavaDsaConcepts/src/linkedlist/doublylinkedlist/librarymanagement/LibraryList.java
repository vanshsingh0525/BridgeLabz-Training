package linkedlist.doublylinkedlist.librarymanagement;

public class LibraryList {
	
	private Node head;
    private Node tail;

    // -------------------- INSERTION --------------------

    // Add book at beginning
    public void addFirst(String title, String author, String genre, int bookId, boolean isAvailable) {
        Node newNode = new Node(title, author, genre, bookId, isAvailable);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add book at end
    public void addLast(String title, String author, String genre, int bookId, boolean isAvailable) {
        Node newNode = new Node(title, author, genre, bookId, isAvailable);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add book at specific position (1-based)
    public void addAtPosition(String title, String author, String genre, int bookId, boolean isAvailable, int pos) {

        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            addFirst(title, author, genre, bookId, isAvailable);
            return;
        }

        Node newNode = new Node(title, author, genre, bookId, isAvailable);
        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }

        if (temp == tail) {
            addLast(title, author, genre, bookId, isAvailable);
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // -------------------- DELETION --------------------

    // Remove book by Book ID
    public void delete(int bookId) {

        if (head == null) {
            System.out.println("No books available");
            return;
        }

        Node temp = head;

        // If head needs to be deleted
        if (head.bookId == bookId) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            System.out.println("Book removed");
            return;
        }

        while (temp != null) {
            if (temp.bookId == bookId) {

                if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Book removed");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    // -------------------- SEARCH --------------------

    // Search by Book Title
    public void searchByTitle(String title) {
        Node temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    // Search by Author
    public void searchByAuthor(String author) {
        Node temp = head;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    // -------------------- UPDATE --------------------

    // Update Availability Status
    public void updateAvailability(int bookId, boolean status) {
        Node temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = status;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    // -------------------- DISPLAY --------------------

    // Display all books forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No books available");
            return;
        }

        Node temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display all books backward
    public void displayBackward() {
        if (tail == null) {
            System.out.println("No books available");
            return;
        }

        Node temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // -------------------- COUNT --------------------

    // Count total number of books
    public void countBooks() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total number of books: " + count);
    }

    // -------------------- HELPER --------------------

    // Display single book details
    private void displayBook(Node temp) {
        System.out.println("-----------------------------");
        System.out.println("Book Title   : " + temp.title);
        System.out.println("Author       : " + temp.author);
        System.out.println("Genre        : " + temp.genre);
        System.out.println("Book ID      : " + temp.bookId);
        System.out.println("Available    : " + (temp.isAvailable ? "Yes" : "No"));
        System.out.println("-----------------------------");
    }
    
}


