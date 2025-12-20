import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate number of rounds required to complete 5 km
    static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000;
        return (totalDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for three sides of the triangle
        System.out.print("Enter length of side 1 (in meters): ");
        double side1 = input.nextDouble();
        System.out.print("Enter length of side 2 (in meters): ");
        double side2 = input.nextDouble();
        System.out.print("Enter length of side 3 (in meters): ");
        double side3 = input.nextDouble();
        double rounds = calculateRounds(side1, side2, side3);

        // Display the output
        System.out.println("The athlete must complete " + rounds + " rounds to finish a 5 km run." );
    }
}
