import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get integer input from user
        int number = input.nextInt();
        // Initialize sum of divisors to 0
        int sum = 0;
        // Run loop from 1 to number - 1
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor of number
            if (number % i == 0) {
                sum = sum + i;  // Add divisor to sum
            }
        }

        // Check if sum of divisors is greater than number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } 
	else {
            System.out.println(number + " is not an Abundant Number");
        }
    }
}
