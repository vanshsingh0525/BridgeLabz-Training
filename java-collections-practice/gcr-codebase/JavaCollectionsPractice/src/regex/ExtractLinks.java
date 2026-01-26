package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String input = sc.nextLine();

        // Regex to match URLs
        String regex = "(https?://[\\w.-]+(?:\\.[a-z]{2,})(?:/[\\w./?%&=-]*)?)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Extracted Links:");

        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No links found.");
        }

        sc.close();
    }
}