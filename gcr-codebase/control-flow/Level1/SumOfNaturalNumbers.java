import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        int n = input.nextInt();
        // Check whether the number is a natural number
        if (n >= 1) {
            // Compute sum using formula
            int formulaSum = n * (n + 1) / 2;
            // Compute sum using while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum = loopSum + i;
                i++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
            // Compare results
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct and equal.");
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
