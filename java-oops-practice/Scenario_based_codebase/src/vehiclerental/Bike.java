package vehiclerental;

public class Bike extends Vehicle {

    public Bike(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;   // simple calculation
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike | ID: " + vehicleId +
                ", Brand: " + brand +
                ", Rate/day: " + baseRate);
    }
}

