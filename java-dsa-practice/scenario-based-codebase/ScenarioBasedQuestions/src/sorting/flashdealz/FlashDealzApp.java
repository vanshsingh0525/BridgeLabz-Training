package sorting.flashdealz;

import java.util.Scanner;

public class FlashDealzApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of product " + (i + 1));

            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Discount (%): ");
            double discount = sc.nextDouble();

            products[i] = new Product(id, name, discount);
        }

        // Quick Sort by discount (descending)
        QuickSortUtil.quickSort(products, 0, n - 1);

        System.out.println("\n Top Discounted Products (Sorted):");
        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + ": " + products[i]);
        }

        sc.close();
    }
}
