package skillforage;

public class SkillForgeApp {
    public static void main(String[] args) {

        Instructor instructor = new Instructor("Amit Sharma", "amit@skillforge.com");

        String[] modules = {"Intro", "OOP", "Collections", "Streams", "Projects"};
        Course javaCourse = new Course("Java Mastery", instructor, modules);

        Student student = new Student("Riya", "riya@gmail.com");
        student.updateProgress(5, 5);
        student.calculateScore(85, 100);

        System.out.println(student.generateCertificate());

        AdvancedStudent advStudent =
                new AdvancedStudent("Rahul", "rahul@gmail.com", javaCourse);

        System.out.println(advStudent.generateCertificate());
    }
}


