package ridehailingapp;

public class CabbyGoDemo {

    public static void main(String[] args) {

        Driver driver = new Driver("Amit", "DL12345", 4.8);

        Vehicle mini = new Mini("MH12AB1234");
        Vehicle sedan = new Sedan("MH14CD5678");

        IRideService rideService = new RideService();

        rideService.bookRide(driver, mini, 12);
        rideService.endRide();

        System.out.println();

        rideService.bookRide(driver, sedan, 8);
        rideService.endRide();
    }
}

