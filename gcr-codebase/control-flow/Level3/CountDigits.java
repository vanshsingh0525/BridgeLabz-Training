import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get integer input from user
        int number = input.nextInt();
        // Initialize count to 0
        int count = 0;
        // If number is 0, it has one digit
        if (number == 0) {
            count = 1;
        } 
	else {
            // Use loop until number becomes 0
            while (number != 0) {
                number = number / 10;  // Remove last digit
                count++;               // Increase count
            }
        }

        // Display the number of digits
        System.out.println("Number of digits: " + count);
    }
}
