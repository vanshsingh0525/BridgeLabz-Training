import java.util.Scanner;

public class NumberGuessingGame {

    // Method to generate a random guess between min and max
    public static int generateGuess(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

    // Method to get user feedback
    public static String getFeedback(Scanner input) {
        System.out.print("Enter feedback (high / low / correct): ");
        return input.next();
    }

    // Method to update range based on feedback
    public static int[] updateRange(String feedback, int guess, int min, int max) {

        if (feedback.equalsIgnoreCase("high")) {
            max = guess - 1;
        } 
        else if (feedback.equalsIgnoreCase("low")) {
            min = guess + 1;
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 1;
        int max = 100;
        boolean isCorrect = false;

        System.out.println("Think of a number between 1 and 100.");

        while (!isCorrect) {

            int guess = generateGuess(min, max);
            System.out.println("Computer guesses: " + guess);

            String feedback = getFeedback(input);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Computer guessed the correct number!");
                isCorrect = true;
            } 
            else {
                int[] range = updateRange(feedback, guess, min, max);
                min = range[0];
                max = range[1];
            }
        }
    }
}
