import java.util.Scanner;

public class NumberChecker4 {

    // Method to check whether a number is a Prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check whether a number is a Neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == number;
    }

    // Method to check whether a number is a Spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }

    // Method to check whether a number is an Automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int temp = number;

        while (temp != 0) {
            if (square % 10 != temp % 10) {
                return false;
            }
            square /= 10;
            temp /= 10;
        }
        return true;
    }

    // Method to check whether a number is a Buzz number
    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0 || number % 10 == 7);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking number input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking and displaying Prime number result
        System.out.println("Is Prime Number: " + isPrime(number));

        // Checking and displaying Neon number result
        System.out.println("Is Neon Number: " + isNeonNumber(number));

        // Checking and displaying Spy number result
        System.out.println("Is Spy Number: " + isSpyNumber(number));

        // Checking and displaying Automorphic number result
        System.out.println("Is Automorphic Number: " + isAutomorphicNumber(number));

        // Checking and displaying Buzz number result
        System.out.println("Is Buzz Number: " + isBuzzNumber(number));
    }
}
