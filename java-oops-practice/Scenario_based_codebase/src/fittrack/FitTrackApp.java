package fittrack;

public class FitTrackApp {

    public static void main(String[] args) {

        UserProfile user = new UserProfile("Rahul", 25, 70.5, "Lose Weight");

        Workout cardio = new CardioWorkout(30);
        Workout strength = new StrengthWorkout(40);

        cardio.startWorkout();
        cardio.calculateCalories();
        cardio.stopWorkout();

        strength.startWorkout();
        strength.calculateCalories();
        strength.stopWorkout();

        double dailyTarget = 500;

        double totalBurned = cardio.getCaloriesBurned() + strength.getCaloriesBurned();

        double progress = dailyTarget - totalBurned; // operator usage

        System.out.println("Calories Burned: " + totalBurned);
        System.out.println("Remaining Target: " + progress);
    }
}

