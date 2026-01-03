package com.objectmodelling.companydepartments;

public class CompositionDemo {

    public static void main(String[] args) {

        Company company = new Company("TechCorp");

        Department itDept = company.createDepartment("IT");
        itDept.addEmployee(1, "Amit");
        itDept.addEmployee(2, "Neha");

        Department hrDept = company.createDepartment("HR");
        hrDept.addEmployee(3, "Rahul");

        company.displayCompany();

        // Deleting company (composition effect)
        company.deleteCompany();
    }
}

