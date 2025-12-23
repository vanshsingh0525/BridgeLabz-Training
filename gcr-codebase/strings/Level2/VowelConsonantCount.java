import java.util.Scanner;

public class VowelConsonantCount {

    // Method to check if a character is vowel, consonant or not a letter
    public static String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    public static int[] findVowelsAndConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {

            String result = checkCharacter(text.charAt(i));

            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[] { vowels, consonants };
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input string
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        // Call method to count vowels and consonants
        int[] count = findVowelsAndConsonants(text);

        // Display result
        System.out.println("Number of vowels: " + count[0]);
        System.out.println("Number of consonants: " + count[1]);
    }
}
