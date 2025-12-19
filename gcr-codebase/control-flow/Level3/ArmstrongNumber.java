import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get integer input from the user
        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;
        while (originalNumber != 0) {
            // Get the last digit using modulus operator
            int digit = originalNumber % 10;
            // Find the cube of the digit and add it to sum
            sum = sum + (digit * digit * digit);
            // Remove the last digit by division
            originalNumber = originalNumber / 10;
        }

        // Check if the sum of cubes is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } 
	else {
            System.out.println(number + " is not an Armstrong Number");
        }
    }
}
