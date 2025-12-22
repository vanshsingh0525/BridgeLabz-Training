import java.util.Scanner;

public class SubstringComparison {

    // Method to create substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {

        StringBuilder result = new StringBuilder();
        // Loop from start index to end index
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
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

    // Method to display the final result
    public static void displayResult(String sub1, String sub2, boolean result) {

        System.out.println("Substring using charAt(): " + sub1);
        System.out.println("Substring using substring(): " + sub2);
        System.out.println("Are both substrings equal? " + result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input string
        System.out.print("Enter the text: ");
        String text = sc.next();
        // Take start and end index
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Create substring using charAt()
        String subUsingCharAt = createSubstringUsingCharAt(text, start, end);
        // Create substring using built-in method
        String subUsingBuiltIn = text.substring(start, end);
        // Compare both substrings
        boolean comparisonResult = compareUsingCharAt(subUsingCharAt, subUsingBuiltIn);

        // Display output
        displayResult(subUsingCharAt, subUsingBuiltIn, comparisonResult);
    }
}
