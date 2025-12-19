import java.util.Scanner;

public class MeanHeightOfPlayers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare an array to store heights of 11 football players
        double[] heights = new double[11];
        // Variable to store sum of heights
        double sum = 0.0;
        // Take input for heights of players
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        }
        // Calculate the sum of all heights
        for (int i = 0; i < heights.length; i++) {
            sum = sum + heights[i];
        }
        // Calculate mean height
        double mean = sum / 11;

        // Display the mean height
        System.out.println("The mean height of the football team is: " + mean);
    }
}
