package parkease;

public class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    protected void occupySlot() {
        isOccupied = true;
    }

    protected void freeSlot() {
        isOccupied = false;
    }

    public String getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }

    public int getSlotId() {
        return slotId;
    }
}

