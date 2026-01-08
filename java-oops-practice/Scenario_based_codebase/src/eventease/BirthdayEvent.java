package eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(int eventId, String location, String date,
                          int attendees, User organizer,
                          double venueCost, double serviceCost) {

        super(eventId, "Birthday Party", location, date,
              attendees, organizer, venueCost, serviceCost, 500);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday event scheduled with fun activities.");
    }

    @Override
    public void reschedule(String newDate) {
        updateDate(newDate);
        System.out.println("Birthday event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday event has been cancelled.");
    }
}
