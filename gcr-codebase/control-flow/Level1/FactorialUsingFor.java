import java.util.Scanner;

public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        int number = input.nextInt();
        // Check whether the number is a positive integer
        if (number > 0) {
            int factorial = 1;
            // Compute factorial using for loop
            for(int i=1; i<=number; i++){
		factorial = factorial * i;		
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