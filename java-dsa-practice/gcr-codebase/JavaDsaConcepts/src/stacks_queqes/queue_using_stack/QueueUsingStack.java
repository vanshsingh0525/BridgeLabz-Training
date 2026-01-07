package stacks_queqes.queue_using_stack;

import java.util.Stack;

/*
 * Queue implementation using two stacks
 */
public class QueueUsingStack {

    // Stack used for enqueue operation
    private Stack<Integer> inputStack;

    // Stack used for dequeue operation
    private Stack<Integer> outputStack;

    public QueueUsingStack() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    // ---------------- ENQUEUE ----------------
    public void enqueue(int data) {
        inputStack.push(data);
        System.out.println(data + " inserted into queue");
    }

    // ---------------- DEQUEUE ----------------
    public int dequeue() {

        if (inputStack.isEmpty() && outputStack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        // Transfer elements only if outputStack is empty
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }

        return outputStack.pop();
    }

    // ---------------- PEEK ----------------
    public int peek() {

        if (inputStack.isEmpty() && outputStack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }

        return outputStack.peek();
    }

    // ---------------- IS EMPTY ----------------
    public boolean isEmpty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}
