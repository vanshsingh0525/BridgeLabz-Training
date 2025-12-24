import java.util.Scanner;

public class BasicCalculator {

    // Method to take number input from the user
    public static double getInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextDouble();
    }

    // Method to perform addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to perform subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method to perform multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method to perform division
    public static double divide(double a, double b) {
        return a / b;
    }

    // Method to display the result
    public static void displayResult(double result) {
        System.out.println("Result is: " + result);
    }

    public static void main(String[] args) {

        // Taking input numbers from user
        double number1 = getInput("Enter first number: ");
        double number2 = getInput("Enter second number: ");
        // Taking operation choice from user
        int choice = (int) getInput(
                "Enter 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division: ");

        // Perform operation based on user choice
        if (choice == 1) {
            displayResult(add(number1, number2));
        } 
	else if (choice == 2) {
            displayResult(subtract(number1, number2));
        } 
	else if (choice == 3) {
            displayResult(multiply(number1, number2));
        } 
	else if (choice == 4) {
            displayResult(divide(number1, number2));
        } 
	else {
            System.out.println("Invalid choice");
        }
    }
}
