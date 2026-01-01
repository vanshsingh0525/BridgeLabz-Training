package com.encapsulation.employeemanagement;

public class PartTimeEmployee extends Employee {

    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, int workHours, double hourlyRate) {
        super(employeeId, name, 0);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }
}

