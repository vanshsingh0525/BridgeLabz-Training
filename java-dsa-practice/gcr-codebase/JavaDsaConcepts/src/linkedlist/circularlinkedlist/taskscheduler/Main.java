package linkedlist.circularlinkedlist.taskscheduler;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TaskList list = new TaskList();
        int choice;

        do {
            System.out.println("\n===== Task Scheduler =====");
            System.out.println("1. Add task at beginning");
            System.out.println("2. Add task at end");
            System.out.println("3. Add task at specific position");
            System.out.println("4. Delete task by ID");
            System.out.println("5. View current task and move to next");
            System.out.println("6. Display all tasks");
            System.out.println("7. Search task by priority");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                case 2:
                case 3:
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Priority: ");
                    double priority = sc.nextDouble();

                    Date date = new Date(); // current date as due date

                    if (choice == 1) {
                        list.addFirst(id, name, priority, date);
                    } 
                    else if (choice == 2) {
                        list.addLast(id, name, priority, date);
                    } 
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        list.addAtPosition(id, name, priority, date, pos);
                    }
                    break;

                /* -------- DELETE -------- */
                case 4:
                    System.out.print("Enter Task ID to delete: ");
                    list.delete(sc.nextInt());
                    break;

                /* -------- CURRENT TASK -------- */
                case 5:
                    list.viewAndMoveNext();
                    break;

                /* -------- DISPLAY -------- */
                case 6:
                    list.displayAll();
                    break;

                /* -------- SEARCH -------- */
                case 7:
                    System.out.print("Enter Priority to search: ");
                    list.searchByPriority(sc.nextDouble());
                    break;

                case 0:
                    System.out.println("Exiting Task Scheduler...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}

