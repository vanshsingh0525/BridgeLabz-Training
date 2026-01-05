package linkedlist.singlylinkedlist.studentrecord;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	    System.out.println("Enter number of student : ");
	    int n = sc.nextInt();
	    sc.nextLine();
	    
		Student student = new Student();
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter case to add : 1. beginning, 2. last, 3. specific position");
			int addCase = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter roll number :");
			int rollNumber = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter name :");
			String name = sc.nextLine();
			
			System.out.println("Enter age");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter grade");
			String grade = sc.nextLine();
			
			switch(addCase) {
			case 1 :
				student.addFirst(rollNumber, name, age, grade);
				break;
				
			case 2 :
				student.addLast(rollNumber, name, age, grade);
				break;
				
			case 3 :
				System.out.println("Enter specific position");
				int pos = sc.nextInt();
				student.addAtPosition(rollNumber, name, age, grade, pos);
				break;
			
			default:
			    System.out.println("Invalid choice");
			}
		}
		
		System.out.println("--------Student Details--------");
		student.displayAll();
		
        // Search student
        System.out.print("\nEnter roll number to search: ");
        int searchRoll = sc.nextInt();
        student.search(searchRoll);

        // Delete student
        System.out.print("\nEnter roll number to delete: ");
        int deleteRoll = sc.nextInt();
        student.delete(deleteRoll);

        // Display after deletion
        System.out.println("\n-------- Student Records After Deletion --------");
        student.displayAll();

	}

}
