package universitycourse;

public class Student {

    protected int studentId;
    protected String name;

    private double gpa;   // private for encapsulation

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = 0.0;
    }

    protected void updateGPA(double value) {
        this.gpa = value;
    }

    public double getTranscript() {
        return gpa;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + studentId +
                           ", Name: " + name +
                           ", GPA: " + gpa);
    }
}

