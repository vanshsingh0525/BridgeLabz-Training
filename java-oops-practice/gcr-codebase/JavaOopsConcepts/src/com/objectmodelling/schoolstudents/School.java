package com.objectmodelling.schoolstudents;

import java.util.ArrayList;

public class School {

    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("School: " + schoolName);
        for (Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println();
    }
}

