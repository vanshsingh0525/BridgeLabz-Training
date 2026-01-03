package com.constructor.level1;

public class EmployeeTest {
    public static void main(String[] args) {

        Manager mgr = new Manager(201, "IT", 75000);

        mgr.displayDetails();

        // Modify salary using public method
        mgr.setSalary(80000);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}
