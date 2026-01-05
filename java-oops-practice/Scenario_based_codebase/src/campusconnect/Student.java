package campusconnect;

public class Student extends Person implements ICourseActions {

    private double[] grades;   // private as required
    private Course course;

    public Student(int id, String name, String email, double[] grades) {
        super(id, name, email);
        this.grades = grades;
    }

    // GPA calculation using operators
    public double calculateGPA() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    @Override
    public void enrollCourse(Course course) {
        this.course = course;
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        this.course = null;
        course.removeStudent(this);
    }

    // Polymorphism
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Role: Student");
        System.out.println("GPA: " + calculateGPA());
    }
}

