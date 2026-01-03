package hospitalpatientmanagement;

public class HospitalDemo {

    public static void main(String[] args) {

        Doctor doctor = new Doctor(1, "Dr. Sharma", "Cardiology");

        Patient p1 = new InPatient(101, "Amit", 40, "Heart Issue", 5, 4000);
        Patient p2 = new OutPatient(102, "Riya", 25, "Fever", 800);

        doctor.displayInfo();

        p1.displayInfo();
        p2.displayInfo();

        // Billing
        InPatient inPatient = (InPatient) p1;
        Bill bill1 = new Bill(inPatient.getCost(), 0.18, 1000);

        System.out.println("Total Bill Amount: " + bill1.calculatePayment());
    }
}

