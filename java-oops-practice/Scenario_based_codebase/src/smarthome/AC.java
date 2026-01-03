package smarthome;

public class AC extends Appliance {

    public AC(int energyUsage) {
        super(energyUsage);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("AC turned ON (Cooling mode)");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("AC turned OFF");
    }

    @Override
    public void displayStatus() {
        System.out.println("AC Status: " + (isOn() ? "ON" : "OFF"));
    }
}

