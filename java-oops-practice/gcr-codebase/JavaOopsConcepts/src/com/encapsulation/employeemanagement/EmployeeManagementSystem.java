package com.encapsulation.employeemanagement;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        // Polymorphic list
        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Rahul", 50000);
        e1.assignDepartment("IT");

        Employee e2 = new PartTimeEmployee(102, "Anita", 80, 400);
        e2.assignDepartment("HR");

        employees.add(e1);
        employees.add(e2);

        // Polymorphism in action
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}

