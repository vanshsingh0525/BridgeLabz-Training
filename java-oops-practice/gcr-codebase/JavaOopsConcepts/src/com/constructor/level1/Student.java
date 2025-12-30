package com.constructor.level1;

public class Student {

	    public int rollNumber;
	    protected String name;
	    private double cgpa;

	    // Public method to set CGPA
	    public void setCGPA(double cgpa) {
	        this.cgpa = cgpa;
	    }

	    // Public method to get CGPA
	    public double getCGPA() {
	        return cgpa;
	    }
}
