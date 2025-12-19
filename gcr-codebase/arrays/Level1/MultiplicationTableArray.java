import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get integer input from user
        int number = sc.nextInt();
        // Define an integer array to store multiplication results (1 to 10)
        int[] table = new int[10];

        // Store multiplication results in array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the multiplication table from array
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
