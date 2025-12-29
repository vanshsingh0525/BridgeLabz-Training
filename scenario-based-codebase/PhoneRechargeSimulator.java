import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable to store current balance
        double balance = 0.0;
        // Loop to allow repeated recharges
        while (true) {

            // Ask user for mobile operator
            System.out.println("Enter mobile operator (Airtel / Jio / Vi) or type Exit to stop:");
            String operator = scanner.nextLine();

            // Exit condition
            if (operator.equalsIgnoreCase("Exit")) {
                break;
            }

            // Ask user for recharge amount
            System.out.println("Enter recharge amount:");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Add recharge amount to balance
            balance = balance + amount;

            // Switch statement to display offers based on operator
            switch (operator.toLowerCase()) {

                case "airtel":
                    System.out.println("Offer: 1.5GB/day for 28 days");
                    break;
                case "jio":
                    System.out.println("Offer: 2GB/day for 28 days");
                    break;
                case "vi":
                    System.out.println("Offer: Unlimited calls + 1GB/day");
                    break;
                default:
                    System.out.println("No offers available");
            }

            // Display updated balance after recharge
            System.out.println("Current Balance: " + balance);
        }
    }
}
