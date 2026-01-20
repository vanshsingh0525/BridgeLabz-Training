package sorting.movietime;

import java.util.Scanner;

public class MovieTimeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of shows: ");
        int n = sc.nextInt();
        sc.nextLine();

        Show[] shows = new Show[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of show " + (i + 1));

            System.out.print("Movie Name: ");
            String name = sc.nextLine();

            System.out.print("Start Time (HH MM): ");
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            sc.nextLine();

            int totalMinutes = hour * 60 + minute;
            shows[i] = new Show(name, totalMinutes);
        }

        // Sort showtimes using Insertion Sort
        InsertionSortUtil.insertionSort(shows);

        System.out.println("\n Today’s Show Listings (Sorted by Time):");
        for (Show show : shows) {
            System.out.println(show);
        }

        sc.close();
    }
}
