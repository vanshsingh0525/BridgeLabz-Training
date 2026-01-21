package sorting.med_warehouse;

public class Medicine {

    int medicineId;
    String name;
    int expiry;   // number of days remaining until expiry

    public Medicine(int medicineId, String name, int expiry) {
        this.medicineId = medicineId;
        this.name = name;
        this.expiry = expiry;
    }

    public void display() {
        System.out.println(medicineId + " | " + name + " | Expires in " + expiry + " days");
    }
}
