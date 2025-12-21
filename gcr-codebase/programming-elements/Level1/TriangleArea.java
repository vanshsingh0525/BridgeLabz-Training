import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle (in inches): ");
        double height = input.nextDouble();
        // Calculate area in square inches
        double areaInSquareInches = 0.5 * base * height;
        // Convert square inches to square centimeters
        double areaInSquareCm = areaInSquareInches * 6.4516;

        // Display the output
        System.out.println( "The area of the triangle is " + areaInSquareInches + " square inches and " + areaInSquareCm + " square centimeters");
    }
}
