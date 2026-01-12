package challengeproblem;

import java.util.Arrays;
import java.util.Scanner;

public class SearchChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // -------- Linear Search: First Missing Positive --------
        int missing = firstMissingPositive(arr.clone());
        System.out.println("First Missing Positive Integer: " + missing);

        // -------- Binary Search: Target Index --------
        System.out.print("Enter target to search: ");
        int target = sc.nextInt();

        Arrays.sort(arr); // binary search needs sorted array

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Target found at index (sorted array): " + index);
        } else {
            System.out.println("Target not found");
        }

        sc.close();
    }

    // ---------- Linear Search Logic ----------
    public static int firstMissingPositive(int[] arr) {

        int n = arr.length;

        // Step 1: Mark valid numbers
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        // Step 2: Find first missing
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    // ---------- Binary Search ----------
    public static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
