package linkedlist.circularlinkedlist.taskscheduler;

import java.util.*;

public class Node {
	
	 int id;
	    String name;
	    double priority;
	    Date date;

	    Node next;

	    public Node(int id, String name, double priority, Date date) {
	        this.id = id;
	        this.name = name;
	        this.priority = priority;
	        this.date = date;
	        this.next = null;
	    }
	

}
