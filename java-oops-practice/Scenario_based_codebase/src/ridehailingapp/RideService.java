package ridehailingapp;

public class RideService implements IRideService {

    private static final double BASE_FARE = 50;

    @Override
    public void bookRide(Driver driver, Vehicle vehicle, double distance) {

        double totalFare =
                BASE_FARE + (distance * vehicle.getRatePerKm()); // operators used

        vehicle.setFare(totalFare);

        System.out.println("Ride Booked Successfully!");
        driver.displayDriver();
        vehicle.displayVehicle();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Estimated Fare: ₹" + vehicle.getFare());
    }

    @Override
    public void endRide() {
        System.out.println("Ride Ended. Thank you for riding with CabbyGo!");
    }
}

