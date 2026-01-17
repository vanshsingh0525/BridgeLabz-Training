package sorting.robo_warehouse;

import java.util.Scanner;

public class RoboWareHouse {

    // Insertion Sort by package weight (ascending)
    public static void insertionSort(PackageItem[] packages, int n) {

        for (int i = 1; i < n; i++) {
            PackageItem key = packages[i];
            int j = i - 1;

            // Shift heavier packages
            while (j >= 0 && packages[j].weight > key.weight) {
                packages[j + 1] = packages[j];
                j--;
            }

            // Insert at correct position
            packages[j + 1] = key;
        }
    }

    // Display shelf
    public static void display(PackageItem[] packages, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(packages[i].weight + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        PackageItem[] packages = new PackageItem[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight of package " + (i + 1) + ": ");
            int weight = sc.nextInt();
            packages[i] = new PackageItem(weight);

            // Sort after each insertion (dynamic behavior)
            RoboWareHouse.insertionSort(packages, i + 1);

            System.out.print("Shelf state: ");
            RoboWareHouse.display(packages, i + 1);
        }

        sc.close();
    }
}
