import java.util.Scanner;

public class DistanceConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        // Convert feet to yards
        double distanceInYards = distanceInFeet / 3;
        // Convert yards to miles
        double distanceInMiles = distanceInYards / 1760;

        // Display the output
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
    }
}
