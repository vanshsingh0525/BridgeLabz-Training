import java.util.Scanner;

public class ZaraEmployeeBonus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Number of employees
        int employees = 10;
        // Arrays to store salary and years of service
        double[] salary = new double[employees];
        double[] yearsOfService = new double[employees];
        // Arrays to store bonus amount and new salary
        double[] bonus = new double[employees];
        double[] newSalary = new double[employees];

        // Variables to store totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input loop for salary and years of service
        for (int i = 0; i < employees; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double sal = input.nextDouble();

            System.out.print("Enter years of service: ");
            double service = input.nextDouble();

            // Validation for invalid input
            if (sal <= 0 || service < 0) {
                System.out.println("Invalid input! Please enter valid values.");
                i--; // Decrement index to repeat input for same employee
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = service;
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < employees; i++) {

            // Bonus calculation based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }
            newSalary[i] = salary[i] + bonus[i];
            // Calculate totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("Total Old Salary of Employees = " + totalOldSalary);
        System.out.println("Total Bonus Amount to be Paid = " + totalBonus);
        System.out.println("Total New Salary of Employees = " + totalNewSalary);
    }
}
