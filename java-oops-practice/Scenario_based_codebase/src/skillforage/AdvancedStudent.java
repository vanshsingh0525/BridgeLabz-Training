package skillforage;

public class AdvancedStudent extends Student {

    private Course course;

    public AdvancedStudent(String name, String email, Course course) {
        super(name, email);
        this.course = course;
    }

    @Override
    public String generateCertificate() {
        return "🎓 " + course.getLevel() + 
               " Level Certificate awarded to " + name;
    }
}

