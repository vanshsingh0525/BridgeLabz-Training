package sorting.tailorshop;

import java.util.Scanner;

public class TailorShopApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine();

        Order[] orders = new Order[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Order " + (i + 1));

            System.out.print("Order ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Delivery Deadline (in days): ");
            int deadline = sc.nextInt();

            orders[i] = new Order(id, name, deadline);
        }

        // Sort using Insertion Sort
        InsertionSortUtil.insertionSort(orders);

        System.out.println("\n Orders Sorted by Delivery Deadline:");
        for (Order o : orders) {
            o.display();
        }

        sc.close();
    }
}
