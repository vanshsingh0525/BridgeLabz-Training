package parkease;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 30, 4);
    }

    @Override
    public double calculateCharges(int hours) {
        double penalty = hours > allowedHours ? (hours - allowedHours) * 10 : 0;
        return (baseRate * hours) + penalty;
    }
}

