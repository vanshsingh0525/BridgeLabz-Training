package regex;

import java.util.Scanner;

public class ReplaceSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        // Replace two or more spaces with a single space
        String result = input.replaceAll("\\s+", " ");

        // Display the output
        System.out.println("After replacing multiple spaces:");
        System.out.println(result);

        sc.close();
    }
}
