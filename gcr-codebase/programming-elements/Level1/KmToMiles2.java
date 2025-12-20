import java.util.Scanner;

public class KmToMiles2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read kilometers from user
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        // Convert kilometers to miles
        double miles = km / 1.6;

        // Display the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
            }
}
