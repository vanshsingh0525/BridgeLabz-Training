import java.util.Scanner;

public class CharacterArrayComparison {

    // Method to return characters of a string without using toCharArray()
    public static char[] getCharactersUsingCharAt(String text) {

        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    // Method to display the result
    public static void displayResult(char[] arr1, char[] arr2, boolean result) {

        System.out.print("Characters using user-defined method: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.print("Characters using toCharArray(): ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println("Are both character arrays equal? " + result);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input text
        System.out.print("Enter the text: ");
        String text = sc.next();
        // Call user-defined method
        char[] userDefinedArray = getCharactersUsingCharAt(text);
        // Call built-in method
        char[] builtInArray = text.toCharArray();
        // Compare both arrays
        boolean comparisonResult = compareCharArrays(userDefinedArray, builtInArray);

        // Display result
        displayResult(userDefinedArray, builtInArray, comparisonResult);
    }
}
