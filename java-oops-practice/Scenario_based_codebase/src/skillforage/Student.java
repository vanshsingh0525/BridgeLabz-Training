package skillforage;

public class Student extends User implements ICertifiable {

    private int progress;   // percentage
    private int score;

    public Student(String name, String email) {
        super(name, email);
        progress = 0;
        score = 0;
    }

    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules; // operator usage
    }

    public void calculateScore(int marksObtained, int totalMarks) {
        score = (marksObtained * 100) / totalMarks; // operator usage
    }

    @Override
    public String generateCertificate() {
        if (progress == 100 && score >= 60) {
            return "Standard SkillForge Certificate issued to " + name;
        }
        return "Course not completed yet.";
    }
}
