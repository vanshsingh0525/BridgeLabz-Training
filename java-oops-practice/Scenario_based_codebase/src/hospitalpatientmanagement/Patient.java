package hospitalpatientmanagement;

public class Patient {

    protected int patientId;
    protected String name;
    protected int age;

    private String medicalHistory;   // sensitive data (Encapsulation)

    public Patient(int patientId, String name, int age, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    public String getSummary() {
        return "Patient ID: " + patientId +
               ", Name: " + name +
               ", Age: " + age;
    }

    public void displayInfo() {
        System.out.println(getSummary());
    }
}

