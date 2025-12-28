package com.constructor.level1;

public class Course {

    // Instance variables
    String courseName;
    int duration;      // duration in months
    double fee;

    // Class variable
    static String instituteName = "ABC";

    // Parameterized constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Course Fee     : ₹" + fee);
    }

    // Class method
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method
    public static void main(String[] args) {

        Course c1 = new Course("Core Java", 3, 12000);
        Course c2 = new Course("Full Stack Development", 6, 35000);

        c1.displayCourseDetails();

        c2.displayCourseDetails();

        Course.updateInstituteName("BridgeLabz Solutions");

        c1.displayCourseDetails();

        c2.displayCourseDetails();
    }
}
