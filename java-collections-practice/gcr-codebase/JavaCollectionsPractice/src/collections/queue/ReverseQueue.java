package collections.queue;

import java.util.*;

public class ReverseQueue {

    // Reverse queue using recursion and only queue operations
    public static void reverseQueue(Queue<Integer> queue) {

        if (queue.isEmpty()) {
            return;
        }

        int front = queue.remove();   // remove front
        reverseQueue(queue);          // reverse remaining queue
        queue.add(front);             // add element at rear
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter number of elements in queue: ");
        int n = sc.nextInt();

        System.out.println("Enter queue elements:");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        System.out.println("Original Queue: " + queue);

        reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);

        sc.close();
    }
}