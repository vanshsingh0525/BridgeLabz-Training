import java.util.Scanner;

public class PalindromeCheck {

    // Method to take user input
    public static String getInput(Scanner input) {
        System.out.print("Enter a text: ");
        return input.nextLine();
    }

    // Method to check if the text is a palindrome
    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method to display result
    public static void displayResult(String text, boolean result) {

        if (result) {
            System.out.println("The text \"" + text + "\" is a Palindrome");
        } 
	else {
            System.out.println("The text \"" + text + "\" is NOT a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input
        String text = getInput(input);
        // Check palindrome
        boolean result = isPalindrome(text);

        // Display result
        displayResult(text, result);
    }
}
