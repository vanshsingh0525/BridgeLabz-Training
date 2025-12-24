import java.util.Scanner;

public class LowercaseComparison {

    // Method to convert text to lowercase using ASCII values
    public static String convertToLowercase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase using ASCII difference
                ch = (char) (ch + 32);
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

        // Convert text to lowercase manually
        String manualLower = convertToLowercase(text);
        // Convert text to lowercase using built-in method
        String builtInLower = text.toLowerCase();
        // Compare the two results
        boolean isEqual = compareStrings(manualLower, builtInLower);

        // Display results
        System.out.println("Manual Lowercase: " + manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Both results are equal: " + isEqual);
    }
}
