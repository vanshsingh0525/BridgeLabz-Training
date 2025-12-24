import java.util.Scanner;

public class ReplaceWord {

    // Method to replace a word with another word
    public static String replaceWord(String sentence, String oldWord, String newWord) {

        String result = "";
        int i = 0;
        while (i < sentence.length()) {

            int j = 0;
            int start = i;
            // Check if oldWord matches starting at position i
            while (j < oldWord.length()
                    && i < sentence.length()
                    && sentence.charAt(i) == oldWord.charAt(j)) {
                i++;
                j++;
            }

            // If full word matched, replace it
            if (j == oldWord.length()) {
                result = result + newWord;
            } 
	    else {
                result = result + sentence.charAt(start);
                i = start + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();

        String output = replaceWord(sentence, oldWord, newWord);

        System.out.println("Updated sentence:");
        System.out.println(output);
    }
}
