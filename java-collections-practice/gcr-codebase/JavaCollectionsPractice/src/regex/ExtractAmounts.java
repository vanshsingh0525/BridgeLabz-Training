package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAmounts {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        // Regex to match $45.99 OR 10.50 or 100 etc.
        String amountRegex = "(\\$\\d+(\\.\\d{1,2})?)|(\\b\\d+\\.\\d{1,2}\\b)";

        Pattern pattern = Pattern.compile(amountRegex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Extracted values:");

        boolean found = false;

        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No values found.");
        }

        sc.close();
    }
}
