import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();

        // Check if employee is eligible for bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;   // 5% bonus
            System.out.println("The bonus amount is " + bonus);
        } 
	else {
            // No bonus for employees with 5 or less years of service
            System.out.println("The bonus amount is 0");
        }
    }
}
