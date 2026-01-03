package universitycourse;

public class Postgraduate extends Student {

    private String specialization;

    public Postgraduate(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {
        System.out.println("Postgraduate | ID: " + studentId +
                ", Name: " + name +
                ", Specialization: " + specialization +
                ", GPA: " + getTranscript());
    }
}

