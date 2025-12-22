import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt() method
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Method to compare two strings using built-in equals() method
    public static boolean compareUsingEquals(String str1, String str2) {
        return str1.equals(str2);
    }

    // Method to display the comparison result
    public static void displayResult(boolean charAtResult, boolean equalsResult) {

        System.out.println("Result using charAt() comparison: " + charAtResult);
        System.out.println("Result using equals() method: " + equalsResult);

        // Check if both results are same
        if (charAtResult == equalsResult) {
            System.out.println("Both comparison results are the same.");
        } else {
            System.out.println("The comparison results are different.");
        }
    }

    // Main method (written at the end)
    public static void main(String[] args) {

        // Take user input for two strings
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.next();
        System.out.print("Enter the second string: ");
        String str2 = sc.next();

        // Call methods to compare strings
        boolean charAtResult = compareUsingCharAt(str1, str2);
        boolean equalsResult = compareUsingEquals(str1, str2);

        // Display the results
        displayResult(charAtResult, equalsResult);
    }
}
