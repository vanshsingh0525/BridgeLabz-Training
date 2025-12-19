import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read user input
        int number = input.nextInt();
        boolean isPrime = true;
	//Checking for prime number
        if (number <= 1) {
            isPrime = false;
        } 
	else {
            // Loop from 2 to number - 1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;  // Number is divisible by another number
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

    }
}
