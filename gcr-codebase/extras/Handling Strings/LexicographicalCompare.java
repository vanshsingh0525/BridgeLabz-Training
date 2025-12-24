import java.util.Scanner;

public class LexicographicalCompare {

    // Method to compare two strings lexicographically
    public static int compareStrings(String text1, String text2) {

        int i = 0;
        // Compare characters one by one
        while (i < text1.length() && i < text2.length()) {

            if (text1.charAt(i) != text2.charAt(i)) {
                return text1.charAt(i) - text2.charAt(i);
            }
            i++;
        }
        // If all compared characters are equal
        return text1.length() - text2.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	// Taking input
        System.out.print("Enter first string: ");
        String text1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String text2 = sc.nextLine();
        int result = compareStrings(text1, text2);

        if (result == 0) {
            System.out.println("Both strings are equal");
        } 
	else if (result < 0) {
            System.out.println("First string comes before second string");
        } 
	else {
            System.out.println("First string comes after second string");
        }
    }
}
