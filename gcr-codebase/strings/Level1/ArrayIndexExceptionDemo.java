import java.util.Scanner;

public class ArrayIndexExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing index greater than array length
        System.out.println(names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            // Accessing invalid index to generate exception
            System.out.println(names[names.length]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking array input from user inside main method
        System.out.print("Enter number of names: ");
        int size = input.nextInt();
        input.nextLine(); // consume newline

        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        // Calling method that generates exception (program will stop here)
        generateException(names);

        // Calling method that handles exception using try-catch
        handleException(names);
    }
}
