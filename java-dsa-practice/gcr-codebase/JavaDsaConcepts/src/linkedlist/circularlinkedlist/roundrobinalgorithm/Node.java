package linkedlist.circularlinkedlist.roundrobinalgorithm;

public class Node {
	
	 int processId;
	    int burstTime;
	    int remainingTime;
	    int priority;

	    int waitingTime;
	    int turnaroundTime;

	    Node next;

	    public Node(int processId, int burstTime, int priority) {
	        this.processId = processId;
	        this.burstTime = burstTime;
	        this.remainingTime = burstTime;
	        this.priority = priority;
	        this.waitingTime = 0;
	        this.turnaroundTime = 0;
	        this.next = null;
	    }

}
