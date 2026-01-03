package com.objectmodelling.universitymanagement;

public class UniversityDemo {
    public static void main(String[] args) {
        // Create students
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");

        // Create professors
        Professor p1 = new Professor(201, "Dr. Smith");
        Professor p2 = new Professor(202, "Dr. Johnson");

        // Create courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Physics");

        // Assign professors to courses
        p1.assignCourse(c1);
        p2.assignCourse(c2);

        // Students enroll in courses
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        // Display course details
        c1.showCourseDetails();
        c2.showCourseDetails();
    }
}

