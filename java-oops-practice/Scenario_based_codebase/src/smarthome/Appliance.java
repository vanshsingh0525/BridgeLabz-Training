package smarthome;

public abstract class Appliance implements Controllable {

    private boolean powerStatus;      // internal state
    private int energyUsage;          // units per hour

    public Appliance(int energyUsage) {
        this.energyUsage = energyUsage;
        this.powerStatus = false;
    }

    protected int getEnergyUsage() {
        return energyUsage;
    }

    protected boolean isOn() {
        return powerStatus;
    }

    protected void setPowerStatus(boolean status) {
        this.powerStatus = status;
    }

    public abstract void displayStatus();
}
