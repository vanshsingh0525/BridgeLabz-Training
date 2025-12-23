import java.util.Scanner;

public class PalindromeStringCheck {

    // Method to check if string is palindrome
    public static boolean isPalindrome(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        boolean result = isPalindrome(text);

        if (result) {
            System.out.println("The given string is a Palindrome");
        } 
	else {
            System.out.println("The given string is NOT a Palindrome");
        }
    }
}
