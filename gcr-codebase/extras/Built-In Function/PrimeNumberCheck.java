import java.util.Scanner;

public class PrimeNumberCheck {

    // Method to check if a number is prime
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Check prime and display result
        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number");
        } 
	else {
            System.out.println(num + " is NOT a Prime Number");
        }
    }
}
