package com.constructor.level1;

public class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);     // Accessible
        System.out.println("Department: " + department);     // Accessible
        System.out.println("Salary: " + getSalary());         // Access via public method
    }
}

