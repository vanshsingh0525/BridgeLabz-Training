package stacks_queqes.circular_tour_problem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of petrol pumps: ");
        int n = sc.nextInt();

        int[] petrol = new int[n];
        int[] distance = new int[n];

        System.out.println("Enter petrol at each pump:");
        for (int i = 0; i < n; i++) {
            petrol[i] = sc.nextInt();
        }

        System.out.println("Enter distance to next pump:");
        for (int i = 0; i < n; i++) {
            distance[i] = sc.nextInt();
        }

        int start = CircularTour.findStartingPump(petrol, distance);

        if (start == -1) {
            System.out.println("No possible circular tour");
        } else {
            System.out.println("Start tour from petrol pump index: " + start);
        }

        sc.close();
    }
}

