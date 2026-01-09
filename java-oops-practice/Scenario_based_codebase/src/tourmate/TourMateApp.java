package tourmate;

public class TourMateApp {

    public static void main(String[] args) {

        Transport flight = new Transport(15000);
        Hotel hotel = new Hotel(10000);
        Activity sightseeing = new Activity(5000);

        Trip trip1 = new DomesticTrip("Goa", 5, flight, hotel, sightseeing);
        trip1.book();
        System.out.println("Total Budget: " + trip1.getBudget());

        System.out.println("----------------------");

        Trip trip2 = new InternationalTrip("Paris", 7, flight, hotel, sightseeing);
        trip2.book();
        System.out.println("Total Budget: " + trip2.getBudget());
    }
}
