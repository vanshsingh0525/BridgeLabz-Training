package vehiclerental;

public class Truck extends Vehicle {

    private double loadCharge;

    public Truck(int id, String brand, double rate, double loadCharge) {
        super(id, brand, rate);
        this.loadCharge = loadCharge;
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + loadCharge;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck | ID: " + vehicleId +
                ", Brand: " + brand +
                ", Rate/day: " + baseRate);
    }
}
