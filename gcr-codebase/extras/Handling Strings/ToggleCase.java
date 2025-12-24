import java.util.Scanner;

public class ToggleCase {

    // Method to toggle case of characters
    public static String toggleCase(String text) {

        String result = "";
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Check for uppercase letters (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32);
            }
            // Check for lowercase letters (a-z)
            else if (ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32);
            }
            // Other characters remain unchanged
            else {
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	//Taking Input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String toggledText = toggleCase(text);

        System.out.println("String after toggling case: " + toggledText);
    }
}
