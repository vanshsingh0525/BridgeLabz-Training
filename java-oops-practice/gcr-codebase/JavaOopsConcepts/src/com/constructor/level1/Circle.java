package com.constructor.level1;

public class Circle {

	    // Attribute
	    double radius;

	    // Default Constructor
	    Circle() {
	        this(1.0);   // calls parameterized constructor
	    }
	    // Parameterized Constructor
	    Circle(double radius) {
	        this.radius = radius;
	    }

	    // Method to display details
	    void display() {
	        System.out.println("Radius: " + radius);
	    }

	    // Main method for testing
	    public static void main(String[] args) {

	        // Using default constructor
	        Circle c1 = new Circle();
	        c1.display();

	        // Using parameterized constructor
	        Circle c2 = new Circle(5.5);
	        c2.display();
	    }
	}

