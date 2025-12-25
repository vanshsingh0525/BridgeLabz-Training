import java.util.Scanner;

public class NumberChecker2 {

    // Method to find the count of digits in the given number
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Method to store digits of the number into an array
    public static int[] storeDigits(int number, int count) {
        int[] digits = new int[count];
        int temp = number;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Method to find the sum of digits using the digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }

    // Method to find the sum of squares of digits using Math.pow()
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }

    // Method to check if the number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);

        if (sum == 0) {
            return false;
        }
        return number % sum == 0;
    }

    // Method to find the frequency of each digit and return a 2D array
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        // Count frequency
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking number input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Finding the count of digits
        int count = countDigits(number);

        // Storing digits in an array
        int[] digits = storeDigits(number, count);

        // Displaying digits
        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        // Finding sum of digits
        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of Digits: " + sumDigits);

        // Finding sum of squares of digits
        int sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of Squares of Digits: " + sumSquares);

        // Checking Harshad number
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));

        // Finding and displaying digit frequency
        int[][] frequency = digitFrequency(digits);
        System.out.println("\nDigit\tFrequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "\t" + frequency[i][1]);
            }
        }
    }
}
