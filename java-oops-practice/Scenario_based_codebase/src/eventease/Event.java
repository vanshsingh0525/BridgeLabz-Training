package eventease;

public abstract class Event implements ISchedulable {

    private final int eventId;      // Cannot be modified once assigned
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;
    protected User organizer;

    // Encapsulated pricing
    private double venueCost;
    private double serviceCost;
    private double discount;

    // Constructor without services
    public Event(int eventId, String eventName, String location, String date,
                 int attendees, User organizer, double venueCost) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = venueCost;
        this.serviceCost = 0;
        this.discount = 0;
    }

    // Constructor with services
    public Event(int eventId, String eventName, String location, String date,
                 int attendees, User organizer, double venueCost,
                 double serviceCost, double discount) {

        this(eventId, eventName, location, date, attendees, organizer, venueCost);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Cost calculation using operators
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }

    protected void updateDate(String newDate) {
        this.date = newDate;
    }

    public void showDetails() {
        System.out.println("Event ID: " + eventId);
        System.out.println("Event: " + eventName);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Attendees: " + attendees);
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

