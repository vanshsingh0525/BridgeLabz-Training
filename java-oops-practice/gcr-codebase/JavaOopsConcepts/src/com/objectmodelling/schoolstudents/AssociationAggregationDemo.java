package com.objectmodelling.schoolstudents;

public class AssociationAggregationDemo {

    public static void main(String[] args) {

        School school = new School("Green Valley School");

        Student s1 = new Student("Amit");
        Student s2 = new Student("Neha");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        // Aggregation: School has Students
        school.addStudent(s1);
        school.addStudent(s2);

        // Association: Student ↔ Course (many-to-many)
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c2);

        // Display data
        school.displayStudents();

        s1.viewCourses();
        s2.viewCourses();

        c1.viewStudents();
        c2.viewStudents();
    }
}

