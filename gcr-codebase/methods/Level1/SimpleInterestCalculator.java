import java.util.Scanner;

public class SimpleInterestCalculator {

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for Principal
        System.out.print("Enter Principal amount: ");
        double principal = input.nextDouble();
        // Take input for Rate of Interest
        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();
        // Take input for Time
        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();
        // Call the method to calculate Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Display the output
        System.out.println("The Simple Interest is " + simpleInterest +" for Principal " + principal +", Rate of Interest " + rate + " and Time " + time);
    }
}
