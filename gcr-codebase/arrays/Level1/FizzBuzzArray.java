import java.util.Scanner;

public class FizzBuzzArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Check for positive integer
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return; // Exit the program
        }
        // Create String array
        String[] results = new String[number + 1];
        // Loop from 0 to number and store values in array
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                results[i] = "Fizz";
            }
            else if (i % 5 == 0) {
                results[i] = "Buzz";
            }
	    
        }

        // Display the results
        System.out.println("FizzBuzz Results:");
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
