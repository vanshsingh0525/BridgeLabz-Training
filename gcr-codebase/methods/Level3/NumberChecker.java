import java.util.Scanner;

public class NumberChecker {

    // Method to find count of digits in a number
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Method to store digits of the number in an array
    public static int[] getDigitsArray(int number, int count) {
        int[] digits = new int[count];
        int temp = number;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Method to check if the number is a Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong Number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;

        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], power);
        }
        return sum == number;
    }

    // Method to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        return new int[] { largest, secondLargest };
    }

    // Method to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        return new int[] { smallest, secondSmallest };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Count digits
        int count = countDigits(number);
        // Store digits in array
        int[] digits = getDigitsArray(number, count);

        // Display digits
        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        // Duck number check
        System.out.println("Is Duck Number: " + isDuckNumber(digits));

        // Armstrong number check
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digits));

        // Find largest and second largest
        int[] large = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + large[0]);
        System.out.println("Second Largest Digit: " + large[1]);

        // Find smallest and second smallest
        int[] small = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + small[0]);
        System.out.println("Second Smallest Digit: " + small[1]);
    }
}
