package parkease;

public class ParkEaseApp {

    public static void main(String[] args) {

        ParkingSlot slot1 = new ParkingSlot(1, "Block A", "Car");
        Vehicle car = new Car("DL01AB1234");

        ParkingManager manager = new ParkingManager();

        if (manager.assignSlot(slot1, car)) {
            double bill = manager.releaseSlot(slot1, car, 5);
            System.out.println("Total Parking Charges: " + bill);
        }

        System.out.println();
        manager.showLogs();
    }
}

