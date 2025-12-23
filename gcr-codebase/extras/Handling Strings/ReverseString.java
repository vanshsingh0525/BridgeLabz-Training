import java.util.Scanner;

public class ReverseString {

    // Method to reverse a string using charAt()
    public static String reverseText(String text) {

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String result = reverseText(text);

        System.out.println("Reversed string: " + result);
    }
}
