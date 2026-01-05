package linkedlist.doublylinkedlist.librarymanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryList list = new LibraryList();
        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add book at beginning");
            System.out.println("2. Add book at end");
            System.out.println("3. Add book at specific position");
            System.out.println("4. Remove book by Book ID");
            System.out.println("5. Search book by Title");
            System.out.println("6. Search book by Author");
            System.out.println("7. Update availability status");
            System.out.println("8. Display books (Forward)");
            System.out.println("9. Display books (Backward)");
            System.out.println("10. Count total books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                case 2:
                case 3:
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();

                    System.out.print("Is Available (true/false): ");
                    boolean status = sc.nextBoolean();

                    if (choice == 1) {
                        list.addFirst(title, author, genre, bookId, status);
                    } else if (choice == 2) {
                        list.addLast(title, author, genre, bookId, status);
                    } else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        list.addAtPosition(title, author, genre, bookId, status, pos);
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to remove: ");
                    list.delete(sc.nextInt());
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    list.searchByTitle(sc.nextLine());
                    break;

                case 6:
                    sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    list.searchByAuthor(sc.nextLine());
                    break;

                case 7:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    System.out.print("New Availability (true/false): ");
                    boolean newStatus = sc.nextBoolean();
                    list.updateAvailability(id, newStatus);
                    break;

                case 8:
                    list.displayForward();
                    break;

                case 9:
                    list.displayBackward();
                    break;

                case 10:
                    list.countBooks();
                    break;

                case 0:
                    System.out.println("Exiting Library Management System...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
