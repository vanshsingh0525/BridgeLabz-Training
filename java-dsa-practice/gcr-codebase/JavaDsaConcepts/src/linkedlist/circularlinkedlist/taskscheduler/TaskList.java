package linkedlist.circularlinkedlist.taskscheduler;

import java.util.Date;

public class TaskList {
	
	private Node head;
    private Node tail;

    // ------------------- INSERTION -----------------------

    // Add task at beginning
    public void addFirst(int id, String name, double priority, Date date) {
        Node newNode = new Node(id, name, priority, date);

        // Empty list
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    // Add task at end
    public void addLast(int id, String name, double priority, Date date) {
        Node newNode = new Node(id, name, priority, date);

        // Empty list
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    // Add task at specific position (1-based)
    public void addAtPosition(int id, String name, double priority, Date date, int pos) {

        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            addFirst(id, name, priority, date);
            return;
        }

        Node newNode = new Node(id, name, priority, date);
        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;

            // If we loop back to head, position is invalid
            if (temp == head) {
                System.out.println("Position out of range");
                return;
            }
        }

        newNode.next = temp.next;
        temp.next = newNode;

        // If inserted at end
        if (temp == tail) {
            tail = newNode;
        }
    }

    // ------------------- DELETION -----------------------

    // Remove task by Task ID
    public void delete(int id) {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Node curr = head;
        Node prev = tail;

        do {
            if (curr.id == id) {

                // Single node
                if (head == tail) {
                    head = tail = null;
                }
                // Deleting head
                else if (curr == head) {
                    head = head.next;
                    tail.next = head;
                }
                // Deleting tail
                else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                }
                // Deleting middle
                else {
                    prev.next = curr.next;
                }

                System.out.println("Task deleted");
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Task not found");
    }

    // ------------------- CURRENT TASK -----------------------

    // View current task and move to next task
    public void viewAndMoveNext() {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        System.out.println("Current Task:");
        displayTask(head);

        // Move head to next task (round-robin behavior)
        head = head.next;
        tail = tail.next;
    }

    // ------------------- DISPLAY -----------------------

    // Display all tasks starting from head
    public void displayAll() {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Node temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // ------------------- SEARCH -----------------------

    // Search for a task by priority
    public void searchByPriority(double priority) {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Node temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println("Task Found:");
                displayTask(temp);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found");
    }

    // ------------------- HELPER -----------------------

    private void displayTask(Node temp) {
        System.out.println("----------------------------");
        System.out.println("Task ID   : " + temp.id);
        System.out.println("Task Name : " + temp.name);
        System.out.println("Priority  : " + temp.priority);
        System.out.println("Due Date  : " + temp.date);
        System.out.println("----------------------------");
    }

}
