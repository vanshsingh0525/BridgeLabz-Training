import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read user input
        int number = sc.nextInt();

        // Check whether the number is a positive integer
        if (number > 0) {
            // Loop from 1 to the given number
            for (int i = 1; i <= number; i++) {
                // Check multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
		else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
		else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
		else {
                    System.out.println("Not applicable");
                }
            }

        } 
	else {
            // If input is not a positive integer
            System.out.println("Please enter a positive integer");
        }
    }
}
