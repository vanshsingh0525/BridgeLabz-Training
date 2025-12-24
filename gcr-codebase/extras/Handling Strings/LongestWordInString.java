import java.util.Scanner;

public class LongestWordInString {

    // Method to find the longest word in a string
    public static String findLongestWord(String text) {

        String longestWord = "";
        String currentWord = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                currentWord = currentWord + ch;
            } 
	    else {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }

        // Check last word
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }

        return longestWord;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String result = findLongestWord(text);

        System.out.println("Longest word in the string: " + result);
    }
}
