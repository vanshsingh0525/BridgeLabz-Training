import java.util.Scanner;

public class DistanceConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        // Converting feet to yards
        double distanceInYards = distanceInFeet / 3;
        // Converting yards to miles
        double distanceInMiles = distanceInYards / 1760;

        // Display the output
        System.out.println("The distance in yards is " + distanceInYards +" while the distance in miles is " + distanceInMiles);
    }
}
