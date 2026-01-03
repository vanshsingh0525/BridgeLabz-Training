package com.objectmodelling.companydepartments;

import java.util.ArrayList;

public class Company {

    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Department created only through Company
    public Department createDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

    public void displayCompany() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.displayDepartment();
            System.out.println();
        }
    }

    // Simulate deletion of Company
    public void deleteCompany() {
        departments.clear();
        System.out.println("Company deleted. All departments and employees removed.");
    }
}


