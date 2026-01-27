package regex;

import java.util.Scanner;

public class CensorBadWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // List of bad words to censor
        String[] badWords = {"damn", "stupid", "idiot", "fool"};

        // Taking sentence input from user
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        // Loop through each bad word
        for (String badWord : badWords) {
            // Replace bad word with **** (case-insensitive)
            sentence = sentence.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }

        // Print the censored sentence
        System.out.println("Censored Sentence:");
        System.out.println(sentence);

        sc.close();
    }
}
