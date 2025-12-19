import java.util.Scanner;

public class OddEvenArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take integer input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Check for Natural Number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            return; // Exit the program
        }

        // Create arrays for odd and even numbers
        int size = number / 2 + 1;
        int[] oddNumbers = new int[size];
        int[] evenNumbers = new int[size];

        // Index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;
        // Loop from 1 to the given number
        for (int i = 1; i <= number; i++) {
            // Check if number is even
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            }
            // Else number is odd
            else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print odd numbers array
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
	System.out.println();
        // Print even numbers array
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
