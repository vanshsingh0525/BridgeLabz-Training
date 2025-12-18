import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        int number = input.nextInt();
        // Check whether the number is a positive integer
        if (number > 0) {
            int factorial = 1;
            int i = 1;
            // Compute factorial using while loop
            while (i <= number) {
                factorial = factorial * i;
                i++;
            }

            // Print the factorial
            System.out.println("The factorial of " + number + " is " + factorial);

        } 
	else {
            // If the number is not a positive integer
            System.out.println("Please enter a positive integer");
        }
    }
}
