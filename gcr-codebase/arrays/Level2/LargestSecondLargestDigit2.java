import java.util.Scanner;

public class LargestSecondLargestDigit2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input from user
        int number = input.nextInt();
        int maxDigit = 10;
        // Array to store digits
        int[] digits = new int[maxDigit];
        int index = 0;
        while (number != 0) {

            // Hint (f): Increase array size if index equals maxDigit
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;        // Increase size by 10
                int[] temp = new int[maxDigit]; // Create temp array

                // Copy existing elements to temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                // Assign temp array back to digits
                digits = temp;
            }
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Variables to store largest and second largest digits
        int largest = 0;
        int secondLargest = 0;
        // Loop through digits array
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
	    else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest digit is: " + largest);
        System.out.println("Second largest digit is: " + secondLargest);
    }
}
