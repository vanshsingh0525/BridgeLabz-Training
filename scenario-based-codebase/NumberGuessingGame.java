import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;

        // Variable to store user's guess
        int guess;
        // Variable to count number of attempts
        int attempts = 0;

        // Do-while loop to allow at least one attempt
        do {

            // Take user input
            guess = scanner.nextInt();
            attempts++;

            if (guess > numberToGuess) {
                System.out.println("Too high");
            }
            else if (guess < numberToGuess) {
                System.out.println("Too low");
            }
            else {
                System.out.println("Correct guess");
                break;
            }

        } while (attempts < 5);

        // Exit message after 5 wrong attempts
        if (attempts == 5 && guess != numberToGuess) {
            System.out.println("Maximum attempts reached");
        }
    }
}
