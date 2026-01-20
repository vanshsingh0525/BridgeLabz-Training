package sorting.fitnesstracker;

public class BubbleSortUtil {

    // Optimized Bubble Sort (Descending order by steps)
    public static void bubbleSort(User[] users) {
        int n = users.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (users[j].steps < users[j + 1].steps) {
                    // swap
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swap happened → already sorted
            if (!swapped)
                break;
        }
    }
}
