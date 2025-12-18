import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int number1, number2, number3;
        // Take input from user
        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        System.out.print("Enter second number: ");
        number2 = input.nextInt();
        System.out.print("Enter third number: ");
        number3 = input.nextInt();
        // Check if first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Display output
        System.out.println("Is the first number the smallest? " + isSmallest);

    }
}
