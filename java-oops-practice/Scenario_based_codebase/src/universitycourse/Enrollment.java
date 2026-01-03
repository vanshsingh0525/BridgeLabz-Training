package universitycourse;

public class Enrollment implements Graded {

    private Student student;
    private Course course;
    private String grade;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    // Letter grading system
    @Override
    public void assignGrade(String grade) {
        this.grade = grade;

        double gpaValue = 0;

        if (grade.equals("A")) gpaValue = 4.0;
        else if (grade.equals("B")) gpaValue = 3.0;
        else if (grade.equals("C")) gpaValue = 2.0;
        else gpaValue = 0.0;

        student.updateGPA((student.getTranscript() + gpaValue) / 2);
    }

    public void displayEnrollment() {
        System.out.println("Student: " + student.name +
                           ", Course: " + course.getCourseName() +
                           ", Grade: " + grade);
    }
}

