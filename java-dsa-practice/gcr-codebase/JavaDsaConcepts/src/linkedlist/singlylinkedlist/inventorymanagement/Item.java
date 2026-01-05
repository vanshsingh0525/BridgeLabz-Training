package linkedlist.singlylinkedlist.inventorymanagement;

public class Item {
	
	private Node head;
	private Node tail;
	
	// Add item at beginning
	public void addFirst(String name, int id, double quantity, double price) {
		Node newNode = new Node( name,  id, quantity,  price);
		if(head==null) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}

	//Add item at last
	public void addLast(String name, int id, double quantity, double price) {
		Node newNode = new Node( name,  id, quantity,  price);
		if(head==null) {
			head = tail = newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
	}
	
	//Add item at a specific position
	public void addAtPosition(String name, int id, double quantity, double price, int pos) {
		
		 if (pos == 1) {
	            addFirst(name, id, quantity, price);
	            return;
	        }
		
		Node newNode = new Node( name,  id, quantity,  price);
		
		if(head == null) {
			head = tail = newNode;
		}
		
		Node temp = head;
		int index = 1;
		
		while(index < pos) {
			temp = temp.next;
			index++;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		
	}
	
	// Remove an item based on Item ID.
	public void delete(int id) {
		
		if (head == null) {
            System.out.println("No items available");
            return;
        }
		
		if(head.id == id) {
			head = head.next;	
			if(head==null) {
				tail = null;
			}	
			System.out.println("Item deleted");
			return;
		}
		
		Node temp = head;
	    while (temp.next != null) {
	        if (temp.next.id == id) {
	            // If deleting tail
	            if (temp.next == tail) {
	                tail = temp;
	            }
	            temp.next = temp.next.next;
	            System.out.println("Item deleted");
	            return;
	        }
	        temp = temp.next;
	    }
	    System.out.println("Item not found");	
	}
	
	// Update the quantity of an item by Item ID.
	public void update(int id, double newQuantity) {	
		Node temp = head;	
		while(temp!=null) {
			if(temp.id == id) {
				temp.quantity = newQuantity;
				System.out.println("Quantity updated");
				return;
			}
			temp = temp.next;
		}	
		System.out.println("Item not found");	
	}
	
	//Search for an item based on Item ID
	public void searchById(int id) {	
		Node temp = head;	
		while(temp!=null) {
			if(temp.id == id) {
				System.out.println("------Item found------");
				System.out.println("Item name : " + temp.name);
				System.out.println("Item Id : " + temp.id);
				return;
			}
			temp = temp.next;
		}		
		System.out.println("Item not found");	
	}
	
	//Search for an item based on Item Name
	public void searchByName(String name) {	
		Node temp = head;	
		while(temp!=null) {
			if(temp.name.equalsIgnoreCase(name)) {
				System.out.println("------Item found------");
				System.out.println("Item name : " + temp.name);
				System.out.println("Item Id : " + temp.id);
				return;
			}
			temp = temp.next;
		}		
		System.out.println("Item not found");	
	}
	
	// display all items value of inventory 
	public void displayAll() {
		Node temp = head;
		while(temp!=null) {
			System.out.println("----------------------------");
	        System.out.println("Name     : " + temp.name);
	        System.out.println("ID       : " + temp.id);
	        System.out.println("Quantity : " + temp.quantity);
	        System.out.println("Price    : " + temp.price);
	        System.out.println("Value    : " + (temp.price * temp.quantity));
			System.out.println();
			temp = temp.next;
		}
	}
	
	//Calculate total inventory value
    public void totalInventoryValue() {
        double total = 0;
        Node temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value = " + total);
    }
    
    //SORTING
	
	// Get the mid node
	private Node getMid(Node head) {
		Node slow = head;
		Node fast = head.next;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow; // mid value
	}
	
	// Merge the nodes
	private Node mergeDescendingSortByPrice(Node left, Node right) {
		Node mergedLL = new Node("", -1, -1, -1);
		Node temp = mergedLL;
		
		while(left!=null && right!=null) {
			if(left.price >= right.price) {
				temp.next = left;
				left = left.next;
				temp = temp.next;
			}
			else {
				temp.next = right;
				right = right.next;
				temp = temp.next;
			}
		}
		
		temp.next = (left != null) ? left : right;
		
		return mergedLL.next;
	}
	
	//Sort inventory based on Item price in descending
	public Node descendingSortByPrice(Node head) {
		
		if(head == null || head.next == null) {
			return head;
		}
		
		//find mid value
		Node mid = getMid(head);
		
		//Update pointers
		Node rightHead = mid.next;
		mid.next = null;
		Node newLeft = descendingSortByPrice(head);
		Node newRight = descendingSortByPrice(rightHead);
		
		//merge the nodes in sorted order
		return mergeDescendingSortByPrice(newLeft, newRight);
	}
	
    public void sortByPriceDescending() {
        head = descendingSortByPrice(head);
        System.out.println("Sorted by price (Descending)");
    }
	
	//Merge by price in ascending order
	private Node mergeAscendingByPrice(Node left, Node right) {
		Node mergedLL = new Node(null, -1, -1, -1);
		Node temp = mergedLL;
		
		while(left != null && right != null) {
			if(left.price<=right.price) {
				temp.next = left;
				left = left.next;
				temp = temp.next;
			}
			else {
				temp.next = right;
				right = right.next;
				temp = temp.next;
			}
		}
		
		while(left != null) {
			temp.next = left;
			left = left.next;
			temp = temp.next;
		}
		
		while(right != null) {
			temp.next = right;
			right = right.next;
			temp = temp.next;
		}
		return mergedLL.next;
	}
	
	
	//Sort inventory based on Item price in ascending
	public Node ascendingSortByPrice(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		//find mid
		Node mid = getMid(head);
		Node rightHead = mid.next;
		mid.next = null;
		
		Node newLeft = ascendingSortByPrice(head);
		Node newRight = ascendingSortByPrice(rightHead);
		
		return mergeAscendingByPrice(newLeft, newRight);
		
	}
	

    public void sortByPriceAscending() {
        head = ascendingSortByPrice(head);
        System.out.println("Sorted by price (Ascending)");
    }
	
	/* ---------------- SORT BY NAME ---------------- */

	private Node mergeByName(Node left, Node right, boolean ascending) {
	    Node dummy = new Node("", -1, 0, 0);
	    Node temp = dummy;

	    while (left != null && right != null) {
	        int cmp = left.name.compareToIgnoreCase(right.name);

	        boolean condition = ascending ? cmp <= 0 : cmp >= 0;

	        if (condition) {
	            temp.next = left;
	            left = left.next;
	        } else {
	            temp.next = right;
	            right = right.next;
	        }
	        temp = temp.next;
	    }

	    temp.next = (left != null) ? left : right;
	    return dummy.next;
	}

	private Node mergeSortByName(Node head, boolean ascending) {
	    if (head == null || head.next == null) {
	        return head;
	    }

	    Node mid = getMid(head);
	    Node rightHead = mid.next;
	    mid.next = null;

	    Node leftSorted = mergeSortByName(head, ascending);
	    Node rightSorted = mergeSortByName(rightHead, ascending);

	    return mergeByName(leftSorted, rightSorted, ascending);
	}

	public void sortByNameAscending() {
	    head = mergeSortByName(head, true);
	    System.out.println("Sorted by name (Ascending)");
	}

	public void sortByNameDescending() {
	    head = mergeSortByName(head, false);
	    System.out.println("Sorted by name (Descending)");
	}

	
}