package smarthome;

public class UserController {

    public void operateDevice(Appliance appliance, boolean power) {
        if (power) {
            appliance.turnOn();
        } else {
            appliance.turnOff();
        }
        appliance.displayStatus();
    }

    public void compareEnergy(Appliance a1, Appliance a2) {
        if (a1.getEnergyUsage() > a2.getEnergyUsage()) {
            System.out.println("First appliance consumes more energy");
        } else if (a1.getEnergyUsage() < a2.getEnergyUsage()) {
            System.out.println("Second appliance consumes more energy");
        } else {
            System.out.println("Both appliances consume equal energy");
        }
    }
}

