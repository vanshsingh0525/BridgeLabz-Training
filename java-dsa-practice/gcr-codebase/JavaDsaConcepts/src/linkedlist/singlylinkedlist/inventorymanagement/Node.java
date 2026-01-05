package linkedlist.singlylinkedlist.inventorymanagement;

public class Node {
	
	String name;
	int id;
	double quantity;
	double price;
	Node next;
	
	public Node(String name, int id, double quantity, double price) {
		this.name = name;
		this.id = id;
		this.quantity = quantity;
		this.price = price;
		this.next = null;
	}
	
}