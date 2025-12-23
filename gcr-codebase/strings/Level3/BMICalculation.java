vimport java.util.Scanner;

public class BMICalculation {

    // Method to calculate BMI status based on BMI value
    public static String getBMIStatus(double bmi) {

        if (bmi <= 18.4) {
            return "Underweight";
        } 
	else if (bmi <= 24.9) {
            return "Normal";
        } 
	else if (bmi <= 39.9) {
            return "Overweight";
        } 
	else {
            return "Obese";
        }
    }

    // Method to compute BMI and status and return 2D String array
    public static String[][] computeBMI(double[][] data) {

        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;   // cm to meter

            double bmi = weight / (heightM * heightM);
            String status = getBMIStatus(bmi);

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Method to prepare final BMI data
    public static String[][] prepareBMIData(double[][] hwData) {
        return computeBMI(hwData);
    }

    // Method to display BMI details in tabular format
    public static void displayResult(String[][] data) {

        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");

        for (int i = 0; i < data.length; i++) {
            System.out.println(
                    data[i][0] + "\t\t" +
                    data[i][1] + "\t\t" +
                    data[i][2] + "\t" +
                    data[i][3]
            );
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array to store weight and height
        double[][] hwData = new double[10][2];

        // Take input for 10 members
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            hwData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            hwData[i][1] = sc.nextDouble();
        }

        // Compute BMI details
        String[][] bmiData = prepareBMIData(hwData);

        // Display result
        displayResult(bmiData);
    }
}
