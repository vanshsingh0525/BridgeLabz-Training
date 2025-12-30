package com.constructor.level1;

public class PostgraduateStudent extends Student {
	
	// Method to display student details
    public void displayDetails() {

        // Accessing public variable
        System.out.println("Roll Number: " + rollNumber);
        // Accessing protected variable
        System.out.println("Name: " + name);
        // Accessing private variable via public method
        System.out.println("CGPA: " + getCGPA());
    }
    
    public static void main(String[] args) {

        // Create PostgraduateStudent object
        PostgraduateStudent student = new PostgraduateStudent();
        // Assign values to public and protected members
        student.rollNumber = 101;
        student.name = "Rohan";

        // Set CGPA using public method
        student.setCGPA(8.7);
        // Display student details
        student.displayDetails();
    }
}
