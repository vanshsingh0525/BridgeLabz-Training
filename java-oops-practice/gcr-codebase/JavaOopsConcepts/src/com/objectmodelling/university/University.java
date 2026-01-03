package com.objectmodelling.university;

import java.util.ArrayList;

public class University {

    private String universityName;
    private ArrayList<Department> departments; // Composition
    private ArrayList<Faculty> faculties;      // Aggregation

    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    // Composition: create Department
    public Department createDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

    // Aggregation: add existing Faculty
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayUniversity() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Department dept : departments) {
            dept.displayDepartment();
        }

        System.out.println("Faculty Members:");
        for (Faculty faculty : faculties) {
            faculty.displayFaculty();
        }

        System.out.println();
    }

    // Composition effect
    public void deleteUniversity() {
        departments.clear(); // departments destroyed
        System.out.println("University deleted. All departments removed.");
    }
}

