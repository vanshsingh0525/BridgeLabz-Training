package homenest;

public abstract class Device implements IControllable {

    private String deviceId;        // Encapsulated
    private boolean status;          // Cannot be modified externally
    protected double energyUsage;    // Accessible to subclasses

    // Secure firmware logs
    protected String firmwareLogs;

    // Constructor for device registration
    public Device(String deviceId) {
        this.deviceId = deviceId;
        this.status = false;
        this.firmwareLogs = "Initialized";
    }

    // Public getters (NO setter for status)
    public String getDeviceId() {
        return deviceId;
    }

    public boolean getStatus() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    // Energy usage calculation using operators
    public double calculateEnergy(int hours) {
        return energyUsage * hours;   // * operator
    }
}