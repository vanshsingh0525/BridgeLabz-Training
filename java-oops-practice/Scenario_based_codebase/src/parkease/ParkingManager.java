package parkease;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {

    private List<String> bookingLogs;   // Internal records

    public ParkingManager() {
        bookingLogs = new ArrayList<>();
    }

    public boolean assignSlot(ParkingSlot slot, Vehicle vehicle) {

        if (!slot.isAvailable()) {
            bookingLogs.add("Slot " + slot.getSlotId() + " already occupied.");
            return false;
        }

        if (!slot.getVehicleTypeAllowed()
                .equals(vehicle.getClass().getSimpleName())) {

            bookingLogs.add("Vehicle type not allowed for slot " + slot.getSlotId());
            return false;
        }

        slot.occupySlot();
        bookingLogs.add("Vehicle parked in slot " + slot.getSlotId());
        return true;
    }

    public double releaseSlot(ParkingSlot slot, Vehicle vehicle, int hours) {
        slot.freeSlot();
        double charges = vehicle.calculateCharges(hours);
        bookingLogs.add("Slot " + slot.getSlotId() +
                " released. Charges: " + charges);
        return charges;
    }

    public void showLogs() {
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}

