import java.util.Scanner;

public class FactorialRecursive {

    // Method to take input from the user
    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    // Recursive method to calculate factorial of a number
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Method to display the factorial result
    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static void main(String[] args) {

        // Taking input from user
        int number = getInput();
        //Calculate factorial using recursive function
        long result = factorial(number);

        // Display the final factorial value
        displayResult(number, result);
    }
}
