package universitycourse;

public class UniversityDemo {

    public static void main(String[] args) {

        Student s1 = new Undergraduate(101, "Amit", "AI");
        Student s2 = new Postgraduate(201, "Riya", "Data Science");

        Course c1 = new Course(1, "OOP");
        Course c2 = new Course(2, "Machine Learning");

        Enrollment e1 = new Enrollment(s1, c1);
        Enrollment e2 = new Enrollment(s2, c2);

        Faculty faculty = new Faculty(1, "Dr. Sharma");

        faculty.gradeStudent(e1, "A");
        faculty.gradeStudent(e2, "B");

        e1.displayEnrollment();
        e2.displayEnrollment();

        s1.displayInfo();
        s2.displayInfo();
    }
}

