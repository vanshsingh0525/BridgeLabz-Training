package com.encapsulation.employeemanagement;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int employeeId, String name, double fixedSalary) {
        super(employeeId, name, fixedSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Fixed salary
    }
}
