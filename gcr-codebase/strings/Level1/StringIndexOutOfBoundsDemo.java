import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {

        // Accessing index beyond string length
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {

        try {
            // Accessing index beyond string length
            System.out.println(text.charAt(text.length()));
        } 
	catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled using try-catch.");
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
	catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception generated in main method.");
        }

        // Call method to handle exception
        handleException(text);
    }
}
