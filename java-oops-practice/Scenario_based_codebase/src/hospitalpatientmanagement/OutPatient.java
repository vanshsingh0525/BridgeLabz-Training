package hospitalpatientmanagement;

public class OutPatient extends Patient {

    private double consultationFee;

    public OutPatient(int id, String name, int age, String history, double fee) {
        super(id, name, age, history);
        this.consultationFee = fee;
    }

    public double getCost() {
        return consultationFee;
    }

    @Override
    public void displayInfo() {
        System.out.println(getSummary() +
                ", Type: OutPatient");
    }
}

