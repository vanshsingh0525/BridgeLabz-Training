package com.objectmodelling.universitymanagement;

public class Student {
    private int studentId;
    private String name;

    // Constructor
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Enroll in a course
    public void enrollCourse(Course course) {
        course.addStudent(this);
        System.out.println(name + " enrolled in course: " + course.getCourseName());
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

