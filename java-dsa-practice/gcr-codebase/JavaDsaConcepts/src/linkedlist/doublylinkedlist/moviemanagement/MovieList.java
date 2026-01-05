package linkedlist.doublylinkedlist.moviemanagement;

public class MovieList {
	
	private Node head;
	private Node tail;
	
	//--------------------INSERTION----------------
	
	//Add at beginning
	public void addFirst(String title, String director, int yearOfRelease, double rating) {
		Node newNode = new Node(title, director, yearOfRelease, rating);
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	
	//Add at end
	public void addLast(String title, String director, int yearOfRelease, double rating) {
		Node newNode = new Node(title, director, yearOfRelease, rating);
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		newNode.prev = tail;
		tail.next = newNode;
		tail = newNode;
		
	}
	
	//Add at specific position
	public void addAtPosition(String title, String director, int yearOfRelease, double rating, int pos) {
		
		if(pos<=0) {
			System.out.println("Invalid Position");
			return;
		}
		
		if(pos == 1) {
			addFirst(title, director, yearOfRelease, rating);
			return;
		}
		
		Node newNode = new Node(title, director, yearOfRelease, rating);
		Node temp = head;
		
		for(int i=1; i<pos-1; i++) {
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
			temp = temp.next;
		}
		
        if (temp == tail) {
            addLast(title, director, yearOfRelease, rating);
            return;
        }
		
		newNode.next = temp.next;
		newNode.prev = temp;
		temp.next.prev = newNode;
		temp.next = newNode;
	}
	
	//---------------------DELETION-----------------------
	
	//Remove a movie record by Movie Title
	
	public void delete(String title) {
		
		if(head == null) {
			System.out.println("No movie available");
			return;
		}
		
		Node temp = head;
		
		if (head.title.equalsIgnoreCase(title)) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            System.out.println("Movie Deleted");
            return;
        }
		
		while(temp!=null) {
			if (temp.title.equalsIgnoreCase(title)) {

                if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Movie Deleted");
                return;
            }
            temp = temp.next;
        }
		System.out.println("Movie Not Found");
	}
	
	//-------------------SEARCH-------------------------
	
	//Search for a movie record by Director
	public void searchByDirector(String director) {
		Node temp = head;
		
		while(temp != null) {
			if(temp.director.equalsIgnoreCase(director)) {
				System.out.println("Movie Found");
				System.out.println("Title :" + temp.title);
				return;
			}
			temp = temp.next;
		}
		
		System.out.println("Movie Not Found");
	}
	
	//Search for a movie record by Rating
	public void searchByRating(double rating) {
		Node temp = head;
		
		while(temp != null) {
			if(temp.rating == rating) {
				System.out.println("Movie Found");
				System.out.println("Title :" + temp.title);
				return;
			}
			temp = temp.next;
		}
		
		System.out.println("Movie Not Found");
	}
	
	//------------------UPDATION------------------
	public void update(String title, double rating) {
		Node temp = head;
		
		while(temp!=null) {
			if(temp.title.equalsIgnoreCase(title)) {
				temp.rating = rating;
				System.out.println("Rating updated");
				return;
			}
			temp = temp.next;
		}
		
		System.out.println("Movie not found");
	}
	
	//------------------------DISPLAY--------------------
	
	//Display all movie records in forward order
	public void displayForward() {
		if(head == null) {
			System.out.println("No Movie Available");
			return;
		}
		
		Node temp = head;
		while(temp!=null) {
			System.out.println("-----------------------------");
			System.out.println("Title : " + temp.title);
			System.out.println("Director Name : " + temp.director);
			System.out.println("Year Of Release : " + temp.yearOfRelease);
			System.out.println("Ratings : " + temp.rating);
			System.out.println("-----------------------------");
			temp = temp.next;
		}
		
	}
	
	//Display all movie records in backward order
	public void displayBackward() {
		if(head == null) {
			System.out.println("No Movie Available");
			return;
		}
		
		Node temp = tail;
		while(temp!=null) {
			System.out.println("-----------------------------");
			System.out.println("Title : " + temp.title);
			System.out.println("Director Name : " + temp.director);
			System.out.println("Year Of Release : " + temp.yearOfRelease);
			System.out.println("Ratings : " + temp.rating);
			System.out.println("-----------------------------");
			temp = temp.prev;
		}
		
	}
	
}
