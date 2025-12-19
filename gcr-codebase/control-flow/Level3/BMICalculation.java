import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for weight and height
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();
        // Convert height from cm to meters
        double heightMeter = heightCm / 100;
        // Calculate BMI using formula
        double bmi = weight / (heightMeter * heightMeter);

        // Display BMI value
        System.out.println("BMI is: " + bmi);
        // Determine weight status using BMI table
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } 
	else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status: Normal");
        } 
	else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } 
	else {
            System.out.println("Status: Obese");
        }
    }
}
