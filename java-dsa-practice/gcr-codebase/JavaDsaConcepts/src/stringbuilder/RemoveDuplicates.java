package stringbuilder;

import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String input = "programming";

        StringBuilder result = new StringBuilder();

        HashSet<Character> seen = new HashSet<>();

        // Step 3: Traverse the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        // Step 5: Convert to String
        String output = result.toString();

        // Output
        System.out.println("Original String: " + input);
        System.out.println("String without duplicates: " + output);
    }
}

