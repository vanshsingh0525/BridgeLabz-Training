package com.constructor.level1;

public class Employee {

    public int employeeID;        // Public
    protected String department;  // Protected
    private double salary;        // Private

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

