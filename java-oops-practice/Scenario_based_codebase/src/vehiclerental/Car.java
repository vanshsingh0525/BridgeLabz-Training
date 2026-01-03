package vehiclerental;

public class Car extends Vehicle {

    private double luxuryCharge;

    public Car(int id, String brand, double rate, double luxuryCharge) {
        super(id, brand, rate);
        this.luxuryCharge = luxuryCharge;
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + luxuryCharge;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car | ID: " + vehicleId +
                ", Brand: " + brand +
                ", Rate/day: " + baseRate);
    }
}

