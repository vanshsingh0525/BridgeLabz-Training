package sorting.artexpo;

import java.util.Scanner;

public class ArtExpo {

    // Insertion Sort by registration time
    public static void insertionSort(Artist[] artists, int n) {

        for (int i = 1; i < n; i++) {
            Artist key = artists[i];
            int j = i - 1;

            while (j >= 0 && artists[j].registrationTime > key.registrationTime) {
                artists[j + 1] = artists[j];
                j--;
            }

            artists[j + 1] = key;
        }
    }

    // Display artist list
    public static void display(Artist[] artists, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(
                artists[i].name + " | Registered at: " + artists[i].registrationTime
            );
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of artists registering today: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Artist[] artists = new Artist[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter artist name: ");
            String name = sc.nextLine();

            System.out.print("Enter registration time (timestamp): ");
            long time = sc.nextLong();
            sc.nextLine();

            artists[i] = new Artist(name, time);

            // Maintain sorted list in real time
            ArtExpo.insertionSort(artists, i + 1);

            System.out.println("\nCurrent Booth Assignment Order:");
            ArtExpo.display(artists, i + 1);
            System.out.println();
        }
    }
}