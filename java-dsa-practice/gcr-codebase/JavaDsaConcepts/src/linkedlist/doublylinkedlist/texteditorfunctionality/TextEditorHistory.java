package linkedlist.doublylinkedlist.texteditorfunctionality;

public class TextEditorHistory {
	
	private Node head;        // oldest state
    private Node tail;        // latest state
    private Node current;     // current active state

    private int size;
    private final int MAX_SIZE = 10;

    // Constructor: start with empty text
    public TextEditorHistory() {
        Node initial = new Node("");
        head = tail = current = initial;
        size = 1;
    }

    /* ---------------- ADD NEW STATE ---------------- */

    // Add a new text state (typing or action)
    public void addState(String newText) {

        Node newNode = new Node(newText);

        // Clear redo history if present
        if (current.next != null) {
            clearRedoHistory();
        }

        // Link new node
        current.next = newNode;
        newNode.prev = current;
        current = newNode;
        tail = newNode;
        size++;

        // Enforce history size limit
        if (size > MAX_SIZE) {
            removeOldestState();
        }
    }

    // Remove all states after current (redo history)
    private void clearRedoHistory() {
        Node temp = current.next;

        while (temp != null) {
            Node next = temp.next;
            temp.prev = null;
            temp.next = null;
            temp = next;
            size--;
        }

        current.next = null;
        tail = current;
    }

    // Remove the oldest state (head)
    private void removeOldestState() {
        if (head == null) return;

        head = head.next;
        head.prev = null;
        size--;
    }

    /* ---------------- UNDO ---------------- */

    public void undo() {
        if (current.prev == null) {
            System.out.println("Nothing to undo");
            return;
        }
        current = current.prev;
        System.out.println("Undo performed");
    }

    /* ---------------- REDO ---------------- */

    public void redo() {
        if (current.next == null) {
            System.out.println("Nothing to redo");
            return;
        }
        current = current.next;
        System.out.println("Redo performed");
    }

    /* ---------------- DISPLAY ---------------- */

    public void displayCurrentState() {
        System.out.println("Current Text:");
        System.out.println(current.text);
    }

}
