package sorting.icecreamrush;

import java.util.Scanner;

public class IceCreamRushApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of flavors: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] flavors = new String[n];
        int[] sales = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter flavor name: ");
            flavors[i] = sc.nextLine();

            System.out.print("Enter sales count: ");
            sales[i] = sc.nextInt();
            sc.nextLine();
        }

        // Create object of sorting class
        IceCreamSorter sorter = new IceCreamSorter();
        sorter.bubbleSort(flavors, sales);

        System.out.println("\nFlavors sorted by popularity:");
        for (int i = 0; i < n; i++) {
            System.out.println(flavors[i] + " → " + sales[i]);
        }

        sc.close();
    }
}
