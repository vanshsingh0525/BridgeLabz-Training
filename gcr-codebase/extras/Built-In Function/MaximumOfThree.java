import java.util.Scanner;

public class MaximumOfThree {

    // Method to take three integer inputs
    public static int[] takeInput(Scanner input) {
        int[] numbers = new int[3];

        System.out.print("Enter first number: ");
        numbers[0] = input.nextInt();
        System.out.print("Enter second number: ");
        numbers[1] = input.nextInt();
        System.out.print("Enter third number: ");
        numbers[2] = input.nextInt();

        return numbers;
    }

    // Method to find the maximum number
    public static int findMaximum(int[] numbers) {
        int max = numbers[0];

        if (numbers[1] > max) {
            max = numbers[1];
        }
        if (numbers[2] > max) {
            max = numbers[2];
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = takeInput(input);
        int max = findMaximum(numbers);

        System.out.println("Maximum number is: " + max);

        input.close();
    }
}
