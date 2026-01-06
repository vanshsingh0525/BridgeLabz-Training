package fittrack;

public class Workout implements ITrackable {

    public String type;
    public int duration; // minutes
    protected double caloriesBurned;

    // Internal logs should not be exposed
    private String workoutLog = "Internal Log";

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public void calculateCalories() {
        caloriesBurned = duration * 5; // default logic
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " workout stopped");
    }
}

