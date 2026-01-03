package com.objectmodelling.universitymanagement;

public class Professor {
    private int professorId;
    private String name;

    // Constructor
    public Professor(int professorId, String name) {
        this.professorId = professorId;
        this.name = name;
    }

    // Assign to a course
    public void assignCourse(Course course) {
        course.setProfessor(this);
        System.out.println(name + " is now teaching course: " + course.getCourseName());
    }

    // Getters
    public int getProfessorId() {
        return professorId;
    }

    public String getName() {
        return name;
    }
}

