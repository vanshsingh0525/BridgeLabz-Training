import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        int number = input.nextInt();
        // Check if the number is a natural number
        if (number >= 1) {
            // Formula to calculate sum of n natural numbers
            int sum = number * (number + 1) / 2;

            // Display the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } 
	else {
            // If the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }

    }
}
