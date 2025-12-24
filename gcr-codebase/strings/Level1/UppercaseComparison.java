import java.util.Scanner;

public class UppercaseComparison {

    // Method to convert text to uppercase using ASCII values
    public static String convertToUppercase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase using ASCII difference
                ch = (char) (ch - 32);
            }
            result += ch;
        }
        return result;
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking complete text input from user
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Convert text to uppercase manually
        String manualUpper = convertToUppercase(text);
        // Convert text to uppercase using built-in method
        String builtInUpper = text.toUpperCase();

        // Compare the two results using user-defined method
        boolean isEqual = compareStrings(manualUpper, builtInUpper);

        // Display results
        System.out.println("Manual Uppercase: " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Both results are equal: " + isEqual);
    }
}
