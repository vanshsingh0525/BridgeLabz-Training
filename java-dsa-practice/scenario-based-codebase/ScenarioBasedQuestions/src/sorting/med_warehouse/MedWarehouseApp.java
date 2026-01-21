package sorting.med_warehouse;

import java.util.Scanner;

public class MedWarehouseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of medicines: ");
        int n = sc.nextInt();
        sc.nextLine();

        Medicine[] medicines = new Medicine[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of medicine " + (i + 1));

            System.out.print("Medicine ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Medicine Name: ");
            String name = sc.nextLine();

            System.out.print("Days until expiry: ");
            int expiry = sc.nextInt();

            medicines[i] = new Medicine(id, name, expiry);
        }

        // Sort medicines by expiry using Merge Sort
        MergeSortUtil.mergeSort(medicines, 0, n - 1);

        System.out.println("\n Medicines Sorted by Expiry (Soonest First):");
        for (Medicine m : medicines) {
            m.display();
        }

        sc.close();
    }
}
