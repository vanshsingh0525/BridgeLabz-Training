package sorting.cinemalhouse;

import java.util.Scanner;

public class CinemaHouse {

    // Bubble Sort by show time (ascending)
    public static void sortByTime(MovieShow[] shows, int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (shows[j].showTime > shows[j + 1].showTime) {
                    // Swap adjacent shows
                    MovieShow temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;
                }
            }
        }
    }

    // Display show list
    public static void display(MovieShow[] shows, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(
                shows[i].movieName + " at " + shows[i].showTime
            );
        }
    }
  
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of shows today: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            MovieShow[] shows = new MovieShow[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter movie name: ");
                String name = sc.nextLine();

                System.out.print("Enter show time (HHMM): ");
                int time = sc.nextInt();
                sc.nextLine();

                shows[i] = new MovieShow(name, time);
            }

            System.out.println("\nBefore Sorting:");
            CinemaHouse.display(shows, n);

            CinemaHouse.sortByTime(shows, n);

            System.out.println("\nAfter Sorting (By Time):");
            CinemaHouse.display(shows, n);

        }
    }
