package tourmate;

public class Trip implements IBookable {
    protected String destination;
    protected int duration;
    protected double budget;

    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    // Constructor to create complete trip package
    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, Activity activity) {

        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        // Operator usage
        this.budget = transport.getCost()
                    + hotel.getCost()
                    + activity.getCost();
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public void book() {
        System.out.println("Booking generic trip to " + destination);
    }

    @Override
    public void cancel() {
        System.out.println("Trip to " + destination + " cancelled");
    }
}

