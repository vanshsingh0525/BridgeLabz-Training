package homenest;

public class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId);
        this.energyUsage = 20.0;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Camera recording started");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Camera recording stopped");
    }

    public void reset() {
        System.out.println("Camera reset: recalibrating lens");
    }
}
