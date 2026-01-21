package homenest;

public class Light extends Device {

    public Light(String deviceId) {
        super(deviceId);
        this.energyUsage = 10.5;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Light ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Light OFF");
    }

    // Polymorphic behavior
    public void reset() {
        System.out.println("Light reset: brightness normalized");
    }
}
