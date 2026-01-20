package sorting.gamerzone;

import java.util.Scanner;

public class GamerZoneApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();

        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of player " + (i + 1));

            System.out.print("Player ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Player Name: ");
            String name = sc.nextLine();

            System.out.print("Score: ");
            int score = sc.nextInt();
            sc.nextLine();

            players[i] = new Player(id, name, score);
        }

        // Quick Sort for leaderboard
        QuickSortUtil.quickSort(players, 0, n - 1);

        System.out.println("\n GamerZone Leaderboard (High Scores First):");
        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + ": " + players[i]);
        }

        sc.close();
    }
}
