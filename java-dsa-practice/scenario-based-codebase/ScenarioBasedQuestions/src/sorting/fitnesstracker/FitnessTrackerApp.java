package sorting.fitnesstracker;

import java.util.Scanner;

public class FitnessTrackerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of users (<=20): ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        User[] users = new User[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of user " + (i + 1));

            System.out.print("User ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Steps Today: ");
            int steps = sc.nextInt();

            users[i] = new User(id, name, steps);
        }

        // Bubble Sort for leaderboard
        BubbleSortUtil.bubbleSort(users);

        System.out.println("\n Daily Step Count Leaderboard:");
        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + ": " + users[i]);
        }

        sc.close();
    }
}
