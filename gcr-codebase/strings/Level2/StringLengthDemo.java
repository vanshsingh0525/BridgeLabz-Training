import java.util.Scanner;

public class StringLengthDemo {

    // Method to find length of string without using length()
    public static int findLengthUsingCharAt(String text) {

        int count = 0;
        try {
            // Infinite loop to count characters
            while (true) {
                text.charAt(count);
                count++;
            }
        } 
	catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index exceeds length
        }

        return count;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string
        System.out.print("Enter the text: ");
        String text = sc.next();

        // Call user-defined method
        int userLength = findLengthUsingCharAt(text);
        // Call built-in method
        int builtInLength = text.length();

        // Display result
        System.out.println("Length using user-defined method: " + userLength);
        System.out.println("Length using built-in length(): " + builtInLength);
    }
}
