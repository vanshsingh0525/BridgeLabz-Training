package eventease;

public class EventEaseApp {

    public static void main(String[] args) {

        User organizer = new User("Ravi Sharma", "ravi@gmail.com", "9999999999");

        Event birthday = new BirthdayEvent(
                101, "Banquet Hall", "15-Aug-2026",
                50, organizer, 20000, 8000);

        Event conference = new ConferenceEvent(
                102, "Convention Center", "10-Sep-2026",
                300, organizer, 80000, 25000);

        birthday.schedule();
        birthday.showDetails();

        System.out.println();

        conference.schedule();
        conference.reschedule("12-Sep-2026");
        conference.showDetails();
    }
}

