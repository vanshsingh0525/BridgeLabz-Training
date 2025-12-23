import java.util.Scanner;

public class SplitTextDemo {

    // Method to find length of string without using length()
    public static int findLength(String text) {

        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } 
	catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitUsingCharAt(String text) {

        int length = findLength(text);
        int wordCount = 1;

        // Count number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Extract words using indexes
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }

        words[wordCount - 1] = text.substring(start, length);

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input text
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        String[] userWords = splitUsingCharAt(text);

        // Built-in split
        String[] builtInWords = text.split(" ");

        // Compare results
        boolean result = compareStringArrays(userWords, builtInWords);

        // Display user-defined split result
        System.out.print("Words using user-defined method: ");
        for (int i = 0; i < userWords.length; i++) {
            System.out.print(userWords[i] + " ");
        }

        // Display built-in split result
        System.out.print("Words using split() method: ");
        for (int i = 0; i < builtInWords.length; i++) {
            System.out.print(builtInWords[i] + " ");
        }

        // Display comparison result
        System.out.println("Are both results equal? " + result);
    }
}
