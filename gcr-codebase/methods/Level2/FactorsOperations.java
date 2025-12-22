import java.util.Scanner;

public class FactorsOperations {

    // Method to find factors and return as array
    static int[] findFactors(int number) {
        int count = 0;
        // First loop to count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        // Initializing array with count
        int[] factors = new int[count];
        int index = 0;
        // Second loop to store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to find sum of factors
    static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum = sum + factors[i];
        }
        return sum;
    }

    // Method to find product of factors
    static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product = product * factors[i];
        }
        return product;
    }

    // Method to find sum of squares of factors
    static double findSumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int i = 0; i < factors.length; i++) {
            sumOfSquares = sumOfSquares + Math.pow(factors[i], 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Finding factors
        int[] factors = findFactors(number);

        // Displaying factors
        System.out.print("Factors are: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        // Calculating results
        int sum = findSumOfFactors(factors);
        int product = findProductOfFactors(factors);
        double sumOfSquares = findSumOfSquaresOfFactors(factors);

        // Displaying results
        System.out.println("Sum of factors is " + sum);
        System.out.println("Product of factors is " + product);
        System.out.println("Sum of squares of factors is " + sumOfSquares);
    }
}
