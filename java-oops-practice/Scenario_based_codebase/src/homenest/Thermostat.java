package homenest;

public class Thermostat extends Device {

    public Thermostat(String deviceId) {
        super(deviceId);
        this.energyUsage = 15.0;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat regulating temperature");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat turned off");
    }

    public void reset() {
        System.out.println("Thermostat reset: temperature set to default");
    }
}
