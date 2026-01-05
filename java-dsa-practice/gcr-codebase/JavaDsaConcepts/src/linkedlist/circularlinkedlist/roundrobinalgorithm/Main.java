package linkedlist.circularlinkedlist.roundrobinalgorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Time Quantum: ");
        int tq = sc.nextInt();

        RoundRobinScheduler scheduler = new RoundRobinScheduler(tq);

        int choice;

        do {
            System.out.println("\n===== Round Robin Scheduler =====");
            System.out.println("1. Add process");
            System.out.println("2. Execute scheduling");
            System.out.println("3. Display process queue");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Process ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Burst Time: ");
                    int bt = sc.nextInt();
                    System.out.print("Priority: ");
                    int pr = sc.nextInt();

                    scheduler.addProcess(pid, bt, pr);
                    break;

                case 2:
                    scheduler.execute();
                    break;

                case 3:
                    scheduler.displayQueue();
                    break;

                case 0:
                    System.out.println("Exiting Scheduler...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
