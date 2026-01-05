package campusconnect;

public class CampusConnectApp {

    public static void main(String[] args) {

        Faculty faculty = new Faculty(
                101,
                "Dr. Mehta",
                "mehta@university.edu",
                "Computer Science"
        );

        Course course = new Course("Object Oriented Programming", faculty);

        double[] grades = {8.2, 9.0, 7.5};

        Student student = new Student(
                201,
                "Vansh",
                "vansh@student.edu",
                grades
        );

        student.enrollCourse(course);

        System.out.println("---- Student Details ----");
        student.printDetails();

        System.out.println("\n---- Faculty Details ----");
        faculty.printDetails();

        System.out.println("\n---- Course Details ----");
        course.printCourseDetails();
    }
}

