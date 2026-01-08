package parkease;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 80, 2);
    }

    @Override
    public double calculateCharges(int hours) {
        double penalty = hours > allowedHours ? (hours - allowedHours) * 40 : 0;
        return (baseRate * hours) + penalty;
    }
}

