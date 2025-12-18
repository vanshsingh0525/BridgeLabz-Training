import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;
        // Taking input from user
        double number = input.nextDouble();
        while (number != 0) {
            total = total + number;  
            number = input.nextDouble(); 
        }

        // Display the total
        System.out.println("The total value is " + total);
    }
}
