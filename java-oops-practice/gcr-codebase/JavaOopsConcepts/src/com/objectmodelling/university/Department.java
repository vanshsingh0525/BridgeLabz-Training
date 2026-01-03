package com.objectmodelling.university;

public class Department {

    private String departmentName;

    // Department created only by University
    Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
    }
}

