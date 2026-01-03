package com.objectmodelling.university;

public class Faculty {

    private int facultyId;
    private String facultyName;

    public Faculty(int facultyId, String facultyName) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
    }

    public void displayFaculty() {
        System.out.println("Faculty ID: " + facultyId +
                           ", Name: " + facultyName);
    }
}

