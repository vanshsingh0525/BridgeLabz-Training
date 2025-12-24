import java.util.Scanner;

public class TemperatureConversion {

    // Method to take temperature input from the user
    public static double getInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextDouble();
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to display the converted temperature
    public static void displayResult(String message, double value) {
        System.out.println(message + value);
    }

    public static void main(String[] args) {

        // Taking temperature input from user
        double temperature = getInput("Enter temperature: ");

        // Taking choice from user
        int choice = (int) getInput("Enter 1 for Fahrenheit to Celsius or 2 for Celsius to Fahrenheit: ");

        // Perform conversion based on user choice
        if (choice == 1) {
            double result = fahrenheitToCelsius(temperature);
            displayResult("Temperature in Celsius is: ", result);
        } 
	else if (choice == 2) {
            double result = celsiusToFahrenheit(temperature);
            displayResult("Temperature in Fahrenheit is: ", result);
        } 
	else {
            System.out.println("Invalid choice");
        }
    }
}
