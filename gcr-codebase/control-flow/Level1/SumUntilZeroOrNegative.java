import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;
        while (true) {
            // Take user input
            double number = input.nextDouble();
            // Check for 0 or negative number
            if (number <= 0) {
                break;   // Exit the loop
            }
            // Add number to total
            total = total + number;
        }

        // Display the total
        System.out.println("The total value is " + total);
    }
}
