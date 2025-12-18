import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        int number = input.nextInt();
        // Check whether the number is a natural number
        if (number >= 1) {
            // Loop from 1 to the number
            for (int i = 1; i <= number; i++) {

                // Check odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } 
		else {
                    System.out.println(i + " is an odd number");
                }
            }

        } 
	else {
            // If the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
