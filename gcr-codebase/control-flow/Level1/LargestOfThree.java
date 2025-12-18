import java.util.Scanner;

public class LargestOfThree {
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
        // Check which number is the largest
        boolean isFirstLargest = (number1 >= number2 && number1 >= number3);
        boolean isSecondLargest = (number2 >= number1 && number2 >= number3);
        boolean isThirdLargest = (number3 >= number1 && number3 >= number2);

        // Display output
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

    }
}
