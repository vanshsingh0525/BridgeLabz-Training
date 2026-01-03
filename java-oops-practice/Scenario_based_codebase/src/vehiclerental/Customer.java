package vehiclerental;

public class Customer {

    private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void rentVehicle(Vehicle vehicle, int days) {
        vehicle.displayInfo();
        System.out.println(
            name + " rented vehicle for " + days + " days"
        );
        System.out.println(
            "Total Rent: " + vehicle.calculateRent(days)
        );
        System.out.println();
    }
}

