import java.util.Scanner;

public class FibonacciSeries {

    // Method to calculate and print Fibonacci sequence
    public static void printFibonacci(int terms) {

        int first = 0;
        int second = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number of terms from user
        System.out.print("Enter the number of terms: ");
        int terms = input.nextInt();

        // Print Fibonacci sequence
        printFibonacci(terms);
    }
}
