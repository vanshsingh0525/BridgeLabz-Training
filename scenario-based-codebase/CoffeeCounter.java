import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double GST_RATE = 0.05; // 5% GST

        while (true) {

            System.out.println("\nEnter coffee type (Espresso / Latte / Cappuccino) or type 'exit' to stop:");
            String coffeeType = sc.next();

            // Exit condition
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you! Cafe closed ☕");
                break;
            }

            System.out.println("Enter quantity:");
            int quantity = sc.nextInt();

            double pricePerCup = 0;

            // Switch to determine coffee price
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    pricePerCup = 120;
                    break;
                case "latte":
                    pricePerCup = 150;
                    break;
                case "cappuccino":
                    pricePerCup = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue; // go back to start of loop
            }

            // Bill calculation
            double totalPrice = pricePerCup * quantity;
            double gstAmount = totalPrice * GST_RATE;
            double finalBill = totalPrice + gstAmount;

            // Display bill
            System.out.println("Coffee Type   : " + coffeeType);
            System.out.println("Quantity      : " + quantity);
            System.out.println("Price         : ₹" + totalPrice);
            System.out.println("GST (5%)      : ₹" + gstAmount);
            System.out.println("Total Bill    : ₹" + finalBill);
        }
    }
}
