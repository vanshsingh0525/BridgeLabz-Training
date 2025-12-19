import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define an array of 5 integers
        int[] arr = new int[5];
        // Take user input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // Loop through the array and check conditions
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                // Check even or odd for positive numbers
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is a positive even number");
                } 
		else {
                    System.out.println(arr[i] + " is a positive odd number");
                }
            } 
	    else if (arr[i] < 0) {
                System.out.println(arr[i] + " is a negative number");
            } 
	    else {
                System.out.println(arr[i] + " is zero");
            }
        }

        // Compare first and last elements of the array
        int first = arr[0];
        int last = arr[arr.length - 1];

        if (first == last) {
            System.out.println("First and last elements are equal");
        } 
	else if (first > last) {
            System.out.println("First element is greater than last element");
        } 
	else {
            System.out.println("First element is less than last element");
        }
    }
}
