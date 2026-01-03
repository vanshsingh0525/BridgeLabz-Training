package smarthome;

public class Light extends Appliance {

    public Light() {
        super(10);   // default energy usage
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Light turned ON (Soft glow)");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Light turned OFF");
    }

    @Override
    public void displayStatus() {
        System.out.println("Light Status: " + (isOn() ? "ON" : "OFF"));
    }
}

