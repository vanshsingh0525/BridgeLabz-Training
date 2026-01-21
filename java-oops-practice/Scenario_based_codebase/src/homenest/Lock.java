package homenest;

public class Lock extends Device {

    public Lock(String deviceId) {
        super(deviceId);
        this.energyUsage = 5.0;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Lock engaged");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Lock disengaged");
    }

    public void reset() {
        System.out.println("Lock reset: security keys refreshed");
    }
}
