package sortingalgorithms;

public class InsertionSort {
	    public static void main(String[] args) {
	        int[] empIds = {105, 102, 110, 101, 108};
	        int n = empIds.length;

	        // Insertion Sort
	        for (int i = 1; i < n; i++) {
	            int key = empIds[i];
	            int j = i - 1;

	            // Move elements greater than key one position ahead
	            while (j >= 0 && empIds[j] > key) {
	                empIds[j + 1] = empIds[j];
	                j--;
	            }

	            // Insert key at correct position
	            empIds[j + 1] = key;
	        }

	        // Print sorted employee IDs
	        System.out.println("Sorted Employee IDs:");
	        for (int id : empIds) {
	            System.out.print(id + " ");
	        }
	    }
}
