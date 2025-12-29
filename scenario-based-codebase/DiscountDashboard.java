import java.util.Scanner;

public class DiscountDashboard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constant values for discount percentages
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;
        // Variable to store total bill amount
        double totalBill = 0.0;
        // Number of items
        int numberOfItems = 5;

        for (int i = 1; i <= numberOfItems; i++) {
            double price = scanner.nextDouble();
            totalBill = totalBill + price;
        }

        // Variable to store discount amount
        double discount;

        // if-else logic to calculate discount based on total bill
        if (totalBill >= 500 && totalBill < 1000) {
            discount = totalBill * DISCOUNT_10;
        } else if (totalBill >= 1000) {
            discount = totalBill * DISCOUNT_20;
        } else {
            discount = 0.0;
        }

        // Calculate final payable amount after discount
        double finalAmount = totalBill - discount;

        // Display bill details
        System.out.println("Total Bill: " + totalBill);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }
}
