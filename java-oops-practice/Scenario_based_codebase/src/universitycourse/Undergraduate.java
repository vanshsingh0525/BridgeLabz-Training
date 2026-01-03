package universitycourse;

public class Undergraduate extends Student {

    private String elective;

    // Without elective preference
    public Undergraduate(int id, String name) {
        super(id, name);
    }

    // With elective preference
    public Undergraduate(int id, String name, String elective) {
        super(id, name);
        this.elective = elective;
    }

    @Override
    public void displayInfo() {
        System.out.println("Undergraduate | ID: " + studentId +
                ", Name: " + name +
                ", Elective: " + elective +
                ", GPA: " + getTranscript());
    }
}

