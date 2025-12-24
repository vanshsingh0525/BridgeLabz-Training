import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find the most frequent character in a string
    public static char findMostFrequentChar(String text) {

        int[] freq = new int[256]; // ASCII character frequency array

        // Find frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char mostFrequent = text.charAt(0);
        int maxFreq = freq[mostFrequent];

        // Find character with maximum frequency
        for (int i = 1; i < text.length(); i++) {
            if (freq[text.charAt(i)] > maxFreq) {
                maxFreq = freq[text.charAt(i)];
                mostFrequent = text.charAt(i);
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        char result = findMostFrequentChar(text);

        System.out.println("Most frequent character is: " + result);
    }
}
