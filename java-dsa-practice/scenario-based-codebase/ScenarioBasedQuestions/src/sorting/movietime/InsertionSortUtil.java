package sorting.movietime;

public class InsertionSortUtil {

    // Sort shows by time (ascending)
    public static void insertionSort(Show[] shows) {

        for (int i = 1; i < shows.length; i++) {
            Show key = shows[i];
            int j = i - 1;

            // Shift shows that start later than key
            while (j >= 0 && shows[j].time > key.time) {
                shows[j + 1] = shows[j];
                j--;
            }

            shows[j + 1] = key;
        }
    }
}
