import java.util.Scanner;

public class TrimStringDemo {

    // Method to find start and end indices after trimming spaces
    public static int[] getTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find first non-space character from start
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find first non-space character from end
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        // Return start and end indices in an array
        return new int[] { start, end };
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
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

        // Taking text input from user
        System.out.print("Enter text with spaces: ");
        String text = input.nextLine();

        // Get start and end indices after trimming manually
        int[] indices = getTrimIndices(text);
        // Create substring using charAt() to trim spaces
        String manualTrim = createSubstring(text, indices[0], indices[1]);
        // Trim using built-in trim() method
        String builtInTrim = text.trim();
        // Compare the two results
        boolean isEqual = compareStrings(manualTrim, builtInTrim);

        // Display results
        System.out.println("Manual trim result: '" + manualTrim + "'");
        System.out.println("Built-in trim result: '" + builtInTrim + "'");
        System.out.println("Both results are equal: " + isEqual);
    }
}
