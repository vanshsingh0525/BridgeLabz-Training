package com.objectmodelling.university;

public class CompositionAggregationDemo {

    public static void main(String[] args) {

        University university = new University("Global University");

        // Faculty exists independently (Aggregation)
        Faculty f1 = new Faculty(1, "Dr. Sharma");
        Faculty f2 = new Faculty(2, "Dr. Mehta");

        university.addFaculty(f1);
        university.addFaculty(f2);

        // Departments created by University (Composition)
        university.createDepartment("Computer Science");
        university.createDepartment("Mechanical");

        university.displayUniversity();

        // Delete University
        university.deleteUniversity();

        // Faculty still exists independently
        System.out.println("Faculty still exists:");
        f1.displayFaculty();
        f2.displayFaculty();
    }
}

