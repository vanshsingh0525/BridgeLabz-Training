package hospitalpatientmanagement;

public class InPatient extends Patient {

    private int daysAdmitted;
    private double dailyCharge;

    // Normal admission
    public InPatient(int id, String name, int age, String history,
                     int daysAdmitted, double dailyCharge) {
        super(id, name, age, history);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    // Emergency admission (constructor overloading)
    public InPatient(int id, String name, int age, String history) {
        super(id, name, age, history);
        this.daysAdmitted = 1;
        this.dailyCharge = 5000;
    }

    public double getCost() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void displayInfo() {
        System.out.println(getSummary() +
                ", Type: InPatient, Days: " + daysAdmitted);
    }
}

