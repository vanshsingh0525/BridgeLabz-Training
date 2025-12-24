import java.util.Scanner;

public class GCDLCM {

    // Method to take input from the user
    public static int getInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextInt();
    }

    // Method to calculate GCD of two numbers
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM of two numbers
    public static int calculateLCM(int a, int b) {
        int gcd = calculateGCD(a, b);
        return (a * b) / gcd;
    }

    // Method to display GCD and LCM results
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static void main(String[] args) {

        // Taking input from user
        int number1 = getInput("Enter first number: ");
        int number2 = getInput("Enter second number: ");
        // Calculate GCD using function
        int gcd = calculateGCD(number1, number2);
        // Calculate LCM using function
        int lcm = calculateLCM(number1, number2);

        // Display the final results
        displayResult(number1, number2, gcd, lcm);
    }
}
