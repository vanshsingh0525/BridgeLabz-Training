package campusconnect;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private Faculty faculty;
    private ArrayList<Student> students;

    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void printCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Faculty: " + faculty.name);
        System.out.println("Total Students: " + students.size());
    }
}

