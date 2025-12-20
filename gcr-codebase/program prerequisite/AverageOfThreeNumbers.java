import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for three numbers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        // Calculate average
        double average = (num1 + num2 + num3) / 3.0;

        // Display the result
        System.out.println("The average of the three numbers is: " + average);
    }
}
