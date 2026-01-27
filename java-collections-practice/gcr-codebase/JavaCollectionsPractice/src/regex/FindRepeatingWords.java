package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take sentence input from user
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        // Regex to find repeated words
        String regex = "\\b(\\w+)\\s+\\1\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Repeating words found:");

        boolean found = false;

        while (matcher.find()) {
            System.out.println(matcher.group(1)); // print the repeated word
            found = true;
        }

        if (!found) {
            System.out.println("No repeating words found.");
        }

        sc.close();
    }
}
