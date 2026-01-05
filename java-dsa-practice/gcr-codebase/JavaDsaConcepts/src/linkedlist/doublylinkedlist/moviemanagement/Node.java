package linkedlist.doublylinkedlist.moviemanagement;

public class Node {
	
	String title;
	String director;
	int yearOfRelease;
	double rating;
	Node prev;
	Node next;
	
	public Node(String title, String director, int yearOfRelease, double rating) {
		this.title = title;
		this.director = director;
		this.yearOfRelease = yearOfRelease;
		this.rating = rating;
		this.prev = null;
		this.next = null;
	}
	
}
