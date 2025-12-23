import java.util.Scanner;

public class RemoveDuplicates {

    // Method to remove duplicate characters from a string
    public static String removeDuplicateCharacters(String text) {

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isDuplicate = false;

            // Check if character already exists in result
            for (int j = 0; j < result.length(); j++) {
                if (current == result.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result = result + current;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String output = removeDuplicateCharacters(text);

        System.out.println("String after removing duplicates: " + output);
    }
}
