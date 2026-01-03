package smarthome;

public class SmartHomeDemo {

    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan(50);
        Appliance ac = new AC(150);

        UserController controller = new UserController();

        controller.operateDevice(light, true);
        controller.operateDevice(fan, true);
        controller.operateDevice(ac, false);

        System.out.println();
        controller.compareEnergy(fan, ac);
    }
}
