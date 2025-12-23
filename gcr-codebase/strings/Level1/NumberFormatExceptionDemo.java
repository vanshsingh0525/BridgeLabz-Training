import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {

        // Converting text to number
        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } 
	catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled.");
        } 
	catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled.");
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input as String
        System.out.print("Enter the text: ");
        String text = sc.next();

        // Call method to generate exception
        try {
            generateException(text);
        } 
	catch (RuntimeException e) {
            System.out.println("Exception generated in main method.");
        }

        // Call method to handle exception
        handleException(text);
    }
}
