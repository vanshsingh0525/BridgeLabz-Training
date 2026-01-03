package smarthome;

public class Fan extends Appliance {

    public Fan(int energyUsage) {
        super(energyUsage);   // user-defined power setting
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Fan turned ON (Medium speed)");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Fan turned OFF");
    }

    @Override
    public void displayStatus() {
        System.out.println("Fan Status: " + (isOn() ? "ON" : "OFF"));
    }
}

