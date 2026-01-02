package com.inheritance.assistedproblems;

public class EmployeeUse {

    public static void main(String[] args) {

        Employee manager = new Manager("Amit", 101, 80000, 10);
        Employee developer = new Developer("Neha", 102, 60000, "Java");
        Employee intern = new Intern("Rahul", 103, 15000, 6);

        Employee[] employees = { manager, developer, intern };

        for (Employee emp : employees) {
            System.out.println("----------------------------");
            emp.displayDetails();   // Polymorphic method call
        }
    }
}

