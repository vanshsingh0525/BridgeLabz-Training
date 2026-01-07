package stacks_queqes.circular_tour_problem;

public class CircularTour {

    public static int findStartingPump(int[] petrol, int[] distance) {

        int start = 0;
        int surplus = 0;
        int deficit = 0;

        for (int i = 0; i < petrol.length; i++) {

            surplus += petrol[i] - distance[i];

            // If petrol becomes negative, start is invalid
            if (surplus < 0) {
                deficit += surplus;
                surplus = 0;
                start = i + 1;
            }
        }

        // Check if total petrol is sufficient
        if (surplus + deficit >= 0) {
            return start;
        }

        return -1;
    }
}

