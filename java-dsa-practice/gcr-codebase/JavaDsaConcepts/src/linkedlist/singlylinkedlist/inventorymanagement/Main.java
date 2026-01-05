package linkedlist.singlylinkedlist.inventorymanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Item list = new Item();
        int choice;

        do {
            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add item at beginning");
            System.out.println("2. Add item at end");
            System.out.println("3. Add item at specific position");
            System.out.println("4. Delete item by ID");
            System.out.println("5. Update quantity by ID");
            System.out.println("6. Search item by ID");
            System.out.println("7. Search item by Name");
            System.out.println("8. Display all items");
            System.out.println("9. Total inventory value");
            System.out.println("10. Sort by price (Ascending)");
            System.out.println("11. Sort by price (Descending)");
            System.out.println("12. Sort by name (Ascending)");
            System.out.println("13. Sort by name (Descending)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1, 2, 3 -> {
                    sc.nextLine();
                    System.out.print("Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Item ID: ");
                    int id = sc.nextInt();
                    System.out.print("Quantity: ");
                    double qty = sc.nextDouble();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    if (choice == 1) {
                        list.addFirst(name, id, qty, price);
                    } else if (choice == 2) {
                        list.addLast(name, id, qty, price);
                    } else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        list.addAtPosition(name, id, qty, price, pos);
                    }
                }

                case 4 -> {
                    System.out.print("Enter ID to delete: ");
                    list.delete(sc.nextInt());
                }

                case 5 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("New Quantity: ");
                    double q = sc.nextDouble();
                    list.update(id, q);
                }

                case 6 -> {
                    System.out.print("Enter ID: ");
                    list.searchById(sc.nextInt());
                }

                case 7 -> {
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    list.searchByName(sc.nextLine());
                }

                case 8 -> list.displayAll();
                case 9 -> list.totalInventoryValue();
                case 10 -> list.sortByPriceAscending();
                case 11 -> list.sortByPriceDescending();
                case 12 -> list.sortByNameAscending();
                case 13 -> list.sortByNameDescending();

                case 0 -> System.out.println("Exiting Inventory System...");
                default -> System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
