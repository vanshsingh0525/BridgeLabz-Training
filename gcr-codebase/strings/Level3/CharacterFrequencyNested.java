import java.util.Scanner;

public class CharacterFrequencyNested {

    // Method to find frequency using nested loops
    public static String[] findCharacterFrequency(String text) {

        char[] chars = text.toCharArray();
        int length = chars.length;
        int[] freq = new int[length];

        // Initialize frequency
        for (int i = 0; i < length; i++) {
            freq[i] = 1;
        }

        // Nested loops to find frequency
        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;

        // Count unique characters
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        String[] result = new String[count * 2];
        int index = 0;

        // Store character and frequency in 1D array
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[index++] = String.valueOf(chars[i]);
                result[index++] = String.valueOf(freq[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequency = findCharacterFrequency(text);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < frequency.length; i += 2) {
            System.out.println(frequency[i] + "\t\t" + frequency[i + 1]);
        }
    }
}
