package linkedlist.circularlinkedlist.roundrobinalgorithm;

public class RoundRobinScheduler {

    private Node head;
    private Node tail;
    private int timeQuantum;
    private int totalProcesses;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
        this.head = null;
        this.tail = null;
        this.totalProcesses = 0;
    }

    // ---------------- ADD PROCESS ----------------

    public void addProcess(int pid, int burstTime, int priority) {
        Node newNode = new Node(pid, burstTime, priority);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }

        totalProcesses++;
        System.out.println("Process added");
    }

    // ---------------- REMOVE PROCESS ----------------

    private void removeProcess(Node prev, Node curr) {

        if (head == tail) {
            head = tail = null;
        } else if (curr == head) {
            head = head.next;
            tail.next = head;
        } else if (curr == tail) {
            tail = prev;
            tail.next = head;
        } else {
            prev.next = curr.next;
        }

        totalProcesses--;
    }

    // ---------------- ROUND ROBIN SCHEDULING ----------------

    public void execute() {

        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }

        Node curr = head;
        Node prev = tail;
        int currentTime = 0;

        while (totalProcesses > 0) {

            System.out.println("\nExecuting Process ID: " + curr.processId);

            if (curr.remainingTime > timeQuantum) {
                curr.remainingTime -= timeQuantum;
                currentTime += timeQuantum;
            } else {
                currentTime += curr.remainingTime;
                curr.remainingTime = 0;

                curr.turnaroundTime = currentTime;
                curr.waitingTime = curr.turnaroundTime - curr.burstTime;

                System.out.println("Process " + curr.processId + " completed");
                removeProcess(prev, curr);
            }

            displayQueue();

            if (totalProcesses == 0) break;

            prev = curr;
            curr = curr.next;
        }

        System.out.println("\nAll processes completed.");
    }

    // ---------------- DISPLAY QUEUE ----------------

    public void displayQueue() {

        if (head == null) {
            System.out.println("Queue empty");
            return;
        }

        Node temp = head;
        System.out.print("Queue: ");

        do {
            System.out.print(
                "[PID:" + temp.processId +
                ", RT:" + temp.remainingTime + "] -> "
            );
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // ---------------- CALCULATE AVERAGES ----------------

    public void calculateAverageTimes(Node[] completed) {

        int totalWT = 0;
        int totalTAT = 0;

        for (Node p : completed) {
            totalWT += p.waitingTime;
            totalTAT += p.turnaroundTime;
        }

        System.out.println("\nAverage Waiting Time = " +
                (double) totalWT / completed.length);
        System.out.println("Average Turnaround Time = " +
                (double) totalTAT / completed.length);
    }
    
}
