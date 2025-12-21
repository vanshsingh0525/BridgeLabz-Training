import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();
        // Calculating area in square centimeters
        double areaInSqCm = 0.5 * base * height;
        // Converting square centimeters to square inches
        double areaInSqIn = areaInSqCm / 6.4516;

        // Display the output
        System.out.println("The Area of the triangle in sq in is " + areaInSqIn + " and sq cm is " + areaInSqCm);
    }
}
