import java.util.Scanner;

public class SquareSideFromPerimeter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        // Calculate the side of the square
        double side = perimeter / 4;

        // Display the output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
