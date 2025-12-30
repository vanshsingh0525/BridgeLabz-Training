public class FitnessChallengeTracker {

    public static void main(String[] args) {

        // Array to store push-up counts for a week (0 represents rest day)
        int[] pushUpsPerDay = {30, 0, 25, 40, 0, 35, 20};
        // Variable to store total push-ups
        int totalPushUps = 0;
        // Variable to count active workout days
        int activeDays = 0;

        // for-each loop 
        for (int pushUps : pushUpsPerDay) {

            // Skip rest days using continue
            if (pushUps == 0) {
                continue;
            }
            // Add push-ups to total
            totalPushUps = totalPushUps + pushUps;
            // Count workout day
            activeDays++;
        }

        // Calculate average push-ups per active day
        double averagePushUps = (double) totalPushUps / activeDays;

        // Display total and average push-ups
        System.out.println("Total Push-ups: " + totalPushUps);
        System.out.println("Average Push-ups per day: " + averagePushUps);
    }
}
