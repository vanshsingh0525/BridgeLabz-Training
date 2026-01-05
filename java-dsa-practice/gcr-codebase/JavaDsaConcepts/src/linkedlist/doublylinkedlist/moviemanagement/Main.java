package linkedlist.doublylinkedlist.moviemanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MovieList list = new MovieList();
        int choice;

        do {
            System.out.println("\n===== Movie Management System =====");
            System.out.println("1. Add movie at beginning");
            System.out.println("2. Add movie at end");
            System.out.println("3. Add movie at specific position");
            System.out.println("4. Delete movie by title");
            System.out.println("5. Search movie by director");
            System.out.println("6. Search movie by rating");
            System.out.println("7. Update movie rating");
            System.out.println("8. Display movies (Forward)");
            System.out.println("9. Display movies (Backward)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                case 2:
                case 3:
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Movie Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Director Name: ");
                    String director = sc.nextLine();

                    System.out.print("Enter Year of Release: ");
                    int year = sc.nextInt();

                    System.out.print("Enter Rating: ");
                    double rating = sc.nextDouble();

                    if (choice == 1) {
                        list.addFirst(title, director, year, rating);
                    } else if (choice == 2) {
                        list.addLast(title, director, year, rating);
                    } else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        list.addAtPosition(title, director, year, rating, pos);
                    }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter Movie Title to Delete: ");
                    list.delete(sc.nextLine());
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Enter Director Name: ");
                    list.searchByDirector(sc.nextLine());
                    break;

                case 6:
                    System.out.print("Enter Rating: ");
                    list.searchByRating(sc.nextDouble());
                    break;

                case 7:
                    sc.nextLine();
                    System.out.print("Enter Movie Title: ");
                    String t = sc.nextLine();
                    System.out.print("Enter New Rating: ");
                    double r = sc.nextDouble();
                    list.update(t, r);
                    break;

                case 8:
                    list.displayForward();
                    break;

                case 9:
                    list.displayBackward();
                    break;

                case 0:
                    System.out.println("Exiting Movie Management System...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
