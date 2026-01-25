package collections.queue;

import java.util.*;

public class CircularBuffer {

    private int[] buffer;
    private int size;
    private int front;
    private int rear;
    private int count;

    // Constructor
    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        front = 0;
        rear = 0;
        count = 0;
    }

    // Insert element (overwrite if full)
    public void insert(int value) {

        if (count == size) {
            // Buffer full → overwrite oldest
            front = (front + 1) % size;
        } else {
            count++;
        }

        buffer[rear] = value;
        rear = (rear + 1) % size;
    }

    // Display buffer contents (oldest → newest)
    public void display() {
        if (count == 0) {
            System.out.println("Buffer is empty");
            return;
        }

        System.out.print("Buffer: [ ");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter buffer size: ");
        int size = sc.nextInt();

        CircularBuffer cb = new CircularBuffer(size);

        while (true) {
            System.out.println("""
            
             Circular Buffer Menu
            1. Insert element
            2. Display buffer
            3. Exit
            """);

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    cb.insert(val);
                    System.out.println(val + " inserted");
                }

                case 2 -> cb.display();

                case 3 -> {
                    System.out.println("Exiting 👋");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
    }
}
