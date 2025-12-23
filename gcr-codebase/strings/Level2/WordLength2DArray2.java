import java.util.Scanner;

public class WordLength2DArray2 {

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

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }

        words[wordCount - 1] = text.substring(start, length);

        return words;
    }

    // Method to create 2D array of words and their lengths
    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input text
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Split text into words
        String[] words = splitUsingCharAt(text);

        // Create 2D array with word and length
        String[][] wordLengthArray = createWordLengthArray(words);

        // Display result in tabular format
        System.out.println("Word Length");
        for (int i = 0; i < wordLengthArray.length; i++) {
            int length = Integer.parseInt(wordLengthArray[i][1]);
            System.out.println(wordLengthArray[i][0]  + length);
        }
    }
}
