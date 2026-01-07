package stacks_queqes.queue_using_stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QueueUsingStack queue = new QueueUsingStack();
        int choice;

        do {
            System.out.println("\n===== Queue Using Stacks =====");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if Queue is Empty");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int data = sc.nextInt();
                    queue.enqueue(data);
                    break;

                case 2:
                    try {
                        System.out.println("Dequeued element: " + queue.dequeue());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Front element: " + queue.peek());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println(queue.isEmpty()
                            ? "Queue is empty"
                            : "Queue is not empty");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
