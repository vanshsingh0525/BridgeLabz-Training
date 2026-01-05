package linkedlist.singlylinkedlist.studentrecord;

public class Student {

    private Node head;
    private Node tail;

    // Add student at the beginning
    public void addFirst(int rollNumber, String name, int age, String grade) {
        Node newNode = new Node(rollNumber, name, age, grade);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add student at the end
    public void addLast(int rollNumber, String name, int age, String grade) {
        Node newNode = new Node(rollNumber, name, age, grade);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Add student at a specific position (1-based index)
    public void addAtPosition(int rollNumber, String name, int age, String grade, int pos) {

        if (pos == 1) {
            addFirst(rollNumber, name, age, grade);
            return;
        }

        Node newNode = new Node(rollNumber, name, age, grade);
        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Delete student by roll number
    public void delete(int rollNum) {

        if (head == null) {
            System.out.println("No students available");
            return;
        }

        // If head needs to be deleted
        if (head.rollNumber == rollNum) {
            head = head.next;

            if (head == null) {
                tail = null;
            }

            System.out.println("Student deleted successfully");
            return;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (curr.rollNumber == rollNum) {
                prev.next = curr.next;

                if (curr == tail) {
                    tail = prev;
                }

                System.out.println("Student deleted successfully");
                return;
            }

            prev = curr;
            curr = curr.next;
        }

        System.out.println("Student not found");
    }

    // Search student by roll number
    public void search(int rollNum) {
        Node temp = head;

        while (temp != null) {
            if (temp.rollNumber == rollNum) {
                System.out.println("Student Found:");
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    // Update grade by roll number
    public void updateGrade(int rollNum, String newGrade) {
        Node temp = head;

        while (temp != null) {
            if (temp.rollNumber == rollNum) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    // Display all students
    public void displayAll() {

        if (head == null) {
            System.out.println("No student records available");
            return;
        }

        Node temp = head;

        System.out.println("----- Student Records -----");
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber);
            System.out.println("Name       : " + temp.name);
            System.out.println("Age        : " + temp.age);
            System.out.println("Grade      : " + temp.grade);
            System.out.println("---------------------------");
            temp = temp.next;
        }
    }
}
