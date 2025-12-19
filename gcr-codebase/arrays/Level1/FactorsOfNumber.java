import java.util.Scanner;

public class FactorsOfNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Initial maximum size for factors array
        int maxFactor = 10;
        // Create factors array
        int[] factors = new int[maxFactor];
        // Index variable to track number of factors stored
        int index = 0;
        // Loop from 1 to the given number to find factors
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                if (index == maxFactor) {
                    // Double the size of array
                    maxFactor = maxFactor * 2;

                    // Create temporary array with new size
                    int[] temp = new int[maxFactor];

                    // Copy existing elements to temp array
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    
                    factors = temp;
                }

                factors[index] = i;
                index++;
            }
        }

        // Display the factors of the number
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
