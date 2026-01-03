package com.objectmodelling.schoolstudents;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    // Association: Course ↔ Student
    public void addStudent(Student student) {
        students.add(student);
    }

    public void viewStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println();
    }
}

