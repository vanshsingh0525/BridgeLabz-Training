package vehiclerental;

public class VehicleRentalDemo {

    public static void main(String[] args) {

        Customer customer = new Customer(1, "Amit");

        Vehicle bike = new Bike(101, "Honda", 300);
        Vehicle car = new Car(102, "Toyota", 1500, 2000);
        Vehicle truck = new Truck(103, "Tata", 2500, 5000);

        customer.rentVehicle(bike, 3);
        customer.rentVehicle(car, 2);
        customer.rentVehicle(truck, 1);
    }
}

