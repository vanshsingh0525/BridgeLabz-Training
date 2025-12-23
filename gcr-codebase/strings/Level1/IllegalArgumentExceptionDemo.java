import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate runtime exception
    public static void generateException(String text) {

        // start index greater than end index
        System.out.println(text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {

        try {
            // start index greater than end index
            System.out.println(text.substring(5, 2));
        } 
	catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled.");
        } 
	catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled.");
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input string
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
