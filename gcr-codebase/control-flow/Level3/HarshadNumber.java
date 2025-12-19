import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get integer input from user
        int number = input.nextInt();
        // Store original number for divisibility check
        int originalNumber = number;
        // Initialize sum of digits to 0
        int sum = 0;
        // Use while loop to extract and add digits
        while (number != 0) {
            int digit = number % 10;  // Get last digit
            sum = sum + digit;        // Add digit to sum
            number = number / 10;     // Remove last digit
        }

        // Check divisibility
        if (sum != 0 && originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } 
	else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }
    }
}
