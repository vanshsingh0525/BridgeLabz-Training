import java.util.Scanner;

public class NumberCheck {

    // Method to check whether the number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;      
        } 
	else if (number < 0) {
            return -1;     
        } 
	else {
            return 0;     
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take integer input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Call the method 
        int result = checkNumber(number);

        // Display the output
        if (result == 1) {
            System.out.println("The number is Positive.");
        } 
	else if (result == -1) {
            System.out.println("The number is Negative.");
        } 
	else {
            System.out.println("The number is Zero.");
        }
    }
}
