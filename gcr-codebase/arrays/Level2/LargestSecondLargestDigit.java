import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input from user
        int number = input.nextInt();
        int maxDigit = 10;
        // Array to store digits
        int[] digits = new int[maxDigit];
        int index = 0;
        while (number != 0) {
            if (index == maxDigit) {
                break; 
            }

            digits[index] = number % 10;
            number = number / 10;        
            index++;
        }

        // Variables to store largest and second largest digits
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if(digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
	    else if(digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest digit is: " + largest);
        System.out.println("Second largest digit is: " + secondLargest);
    }
}
