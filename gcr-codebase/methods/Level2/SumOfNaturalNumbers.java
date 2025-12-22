import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find sum using recursion
    static int sumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find sum using formula
    static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        // Checking for natural number
        if (n > 0) {
            // Calculating sum using recursion
            int recursiveSum = sumUsingRecursion(n);
            // Calculating sum using formula
            int formulaSum = sumUsingFormula(n);

            // Displaying results
            System.out.println("Sum using recursion is " + recursiveSum);
            System.out.println("Sum using formula is " + formulaSum);
            // Comparing results
            if (recursiveSum == formulaSum) {
                System.out.println("Both results are correct and equal.");
            } 
	    else {
                System.out.println("Results are not equal.");
            }

        } 
	else {
            System.out.println("Please enter a valid natural number.");
        }
    }
}
