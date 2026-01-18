package sorting.fleetmanager;

import java.util.Scanner;

public class FleetManager {

    // Merge Sort
    public static void mergeSort(Vehicle[] vehicles, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(vehicles, left, mid);
            mergeSort(vehicles, mid + 1, right);

            merge(vehicles, left, mid, right);
        }
    }

    // Merge two sorted subarrays
    private static void merge(Vehicle[] vehicles, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Vehicle[] L = new Vehicle[n1];
        Vehicle[] R = new Vehicle[n2];

        for (int i = 0; i < n1; i++)
            L[i] = vehicles[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = vehicles[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].mileage <= R[j].mileage) {
                vehicles[k++] = L[i++];
            } else {
                vehicles[k++] = R[j++];
            }
        }

        while (i < n1) {
            vehicles[k++] = L[i++];
        }

        while (j < n2) {
            vehicles[k++] = R[j++];
        }
    }

    // Display master schedule
    public static void display(Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println(
                v.vehicleId + " | Mileage: " + v.mileage
            );
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter vehicle ID: ");
            String id = sc.nextLine();

            System.out.print("Enter mileage: ");
            int mileage = sc.nextInt();
            sc.nextLine();

            vehicles[i] = new Vehicle(id, mileage);
        }

        System.out.println("\nBefore Master Scheduling:");
        FleetManager.display(vehicles);

        FleetManager.mergeSort(vehicles, 0, n - 1);

        System.out.println("\nMaster Maintenance Schedule (By Mileage):");
        FleetManager.display(vehicles);

        sc.close();
    }
}
