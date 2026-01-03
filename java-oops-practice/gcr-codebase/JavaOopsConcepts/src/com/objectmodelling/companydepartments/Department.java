package com.objectmodelling.companydepartments;

import java.util.ArrayList;

public class Department {

    private String departmentName;
    private ArrayList<Employee> employees;

    // Department cannot exist without Company (created via Company)
    Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Employee created only inside Department
    public void addEmployee(int id, String name) {
        employees.add(new Employee(id, name));
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }

    // 🔹 Inner Employee class (true composition)
    private class Employee {
        private int empId;
        private String empName;

        private Employee(int empId, String empName) {
            this.empId = empId;
            this.empName = empName;
        }

        private void displayEmployee() {
            System.out.println("Employee ID: " + empId + ", Name: " + empName);
        }
    }
}

