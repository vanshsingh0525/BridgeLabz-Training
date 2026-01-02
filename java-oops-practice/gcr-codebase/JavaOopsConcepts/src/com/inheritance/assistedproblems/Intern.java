package com.inheritance.assistedproblems;

public class Intern extends Employee {

    private int durationInMonths;

    public Intern(String name, int id, double salary, int durationInMonths) {
        super(name, id, salary);
        this.durationInMonths = durationInMonths;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration : " + durationInMonths + " months");
        System.out.println("Role                : Intern");
    }
}

