import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        int n = input.nextInt();
        // Check whether the number is a natural number
        if (n >= 1) {
            // Compute sum using formula
            int formulaSum = n * (n + 1) / 2;
            // Compute sum using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum = loopSum + i;
            }

            // Display both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);
            // Compare results
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct ");
            } 
	    else {
                System.out.println("The computations are not equal.");
            }
        } 
	else {
            // Not a natural number
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}
