import java.util.Scanner;

public class HeightConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        // Convert centimeters to inches
        double heightInches = heightCm / 2.54;
        // Convert inches to feet 
        int feet = (int) (heightInches / 12);
        double inches = heightInches % 12;

        // Display the output
        System.out.println("Your Height in cm is " + heightCm +" while in feet is " + feet +" and inches is " + inches );
    }
}
