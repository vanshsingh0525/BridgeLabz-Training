import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String text1, String text2) {

        // If lengths are not equal, they cannot be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] freq = new int[256]; // ASCII frequency array

        // Store frequency of characters from first string
        for (int i = 0; i < text1.length(); i++) {
            freq[text1.charAt(i)]++;
        }

        // Reduce frequency using second string characters
        for (int i = 0; i < text2.length(); i++) {
            freq[text2.charAt(i)]--;
        }

        // Check if all frequencies are zero
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String text2 = sc.nextLine();

        boolean result = isAnagram(text1, text2);

        if (result) {
            System.out.println("The strings are anagrams.");
        } 
	else {
            System.out.println("The strings are NOT anagrams.");
        }
    }
}
