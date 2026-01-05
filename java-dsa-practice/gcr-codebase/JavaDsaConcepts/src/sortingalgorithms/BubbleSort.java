package sortingalgorithms;

public class BubbleSort {
	    public static void main(String[] args) {
	        int[] marks = {78, 45, 90, 32, 67, 88};

	        int n = marks.length;
	        boolean swapped;

	        // Bubble Sort
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;

	            for (int j = 0; j < n - 1 - i; j++) {
	                if (marks[j] > marks[j + 1]) {
	                    // Swap
	                    int temp = marks[j];
	                    marks[j] = marks[j + 1];
	                    marks[j + 1] = temp;
	                    swapped = true;
	                }
	            }

	            // If no swaps occurred, array is already sorted
	            if (!swapped)
	                break;
	        }

	        // Print sorted marks
	        System.out.println("Sorted Student Marks:");
	        for (int mark : marks) {
	            System.out.print(mark + " ");
	        }
	    }
}
