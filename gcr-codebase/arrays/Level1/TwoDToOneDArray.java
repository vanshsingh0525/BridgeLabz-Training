import java.util.Scanner;

public class TwoDToOneDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of rows and columns from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        // Create 2D array
        int[][] matrix = new int[rows][columns];
        // Take input for 2D array elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create 1D array of size rows * columns
        int[] array = new int[rows * columns];
        // Index variable for 1D array
        int index = 0;
        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Display the 1D array
        System.out.println("Elements of the 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
