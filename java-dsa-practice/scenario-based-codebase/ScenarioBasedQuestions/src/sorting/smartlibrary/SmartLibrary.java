package sorting.smartlibrary;

import java.util.Scanner;

public class SmartLibrary {

    // Insertion Sort method
    public static void insertionSort(String[] books) {
        int n = books.length;

        for (int i = 1; i < n; i++) {
            String key = books[i];
            int j = i - 1;

            // Shift elements that are greater than key
            while (j >= 0 && books[j].compareToIgnoreCase(key) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of borrowed books: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] books = new String[n];

        // Dynamic input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter book title: ");
            books[i] = sc.nextLine();
        }

        // Sorting using Insertion Sort
        insertionSort(books);

        // Output
        System.out.println("\nBorrowed books sorted alphabetically:");
        for (String book : books) {
            System.out.println(book);
        }

        sc.close();
    }
}
