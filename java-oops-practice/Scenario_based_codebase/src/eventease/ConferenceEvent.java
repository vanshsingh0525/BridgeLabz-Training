package eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(int eventId, String location, String date,
                             int attendees, User organizer,
                             double venueCost, double serviceCost) {

        super(eventId, "Conference", location, date,
              attendees, organizer, venueCost, serviceCost, 1000);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with professional setup.");
    }

    @Override
    public void reschedule(String newDate) {
        updateDate(newDate);
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference has been cancelled.");
    }
}

