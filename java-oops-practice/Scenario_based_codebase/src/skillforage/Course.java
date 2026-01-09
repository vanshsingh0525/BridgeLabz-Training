package skillforage;

public class Course {

    private String title;
    private Instructor instructor;
    private double rating;          // encapsulated rating logic
    private String[] modules;
    private final String[] reviews; // read-only internal reviews

    // Default constructor (default modules)
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Introduction", "Basics", "Advanced"};
        this.reviews = new String[]{"Excellent content", "Very helpful"};
        this.rating = 4.0;
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new String[]{"Well structured"};
        this.rating = 4.5;
    }

    // Protected rating logic (encapsulation)
    protected void updateRating(int newRating) {
        if (newRating >= 1 && newRating <= 5) {
            rating = (rating + newRating) / 2; // operator usage
        }
    }

    public double getRating() {
        return rating;
    }

    public String[] getReviews() {
        return reviews; // read-only (no setter)
    }

    public String getLevel() {
        if (modules.length <= 3) return "Beginner";
        else if (modules.length <= 6) return "Intermediate";
        return "Advanced";
    }
}
