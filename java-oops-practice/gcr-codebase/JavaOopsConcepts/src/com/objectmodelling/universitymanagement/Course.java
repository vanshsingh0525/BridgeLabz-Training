package com.objectmodelling.universitymanagement;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private Professor professor; // Aggregation: professor assigned to course
    private List<Student> students; // Aggregation: students enrolled in course

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Assign a professor
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // Display course details
    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: " + professor.getName());
        } else {
            System.out.println("No professor assigned yet.");
        }

        if (students.isEmpty()) {
            System.out.println("No students enrolled yet.");
        } else {
            System.out.print("Enrolled students: ");
            for (Student s : students) {
                System.out.print(s.getName() + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }

    // Getter
    public String getCourseName() {
        return courseName;
    }
}

