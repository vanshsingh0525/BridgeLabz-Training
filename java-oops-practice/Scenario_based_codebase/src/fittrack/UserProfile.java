package fittrack;

public class UserProfile {

    public String name;
    public int age;
    private double weight;   // protected health data
    public String goal;

    // Constructor with default goal
    public UserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = "Stay Fit";
    }

    // Constructor with custom goal
    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
    }

    // Getter (no direct access to weight)
    public double getWeight() {
        return weight;
    }
}

