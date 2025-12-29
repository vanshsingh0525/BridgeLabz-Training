import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initial smart card balance
        double balance = 200.0;
        System.out.println("Initial Smart Card Balance: " + balance);

        // Loop continues until balance is exhausted
        while (balance > 0) {

            // Ask user for distance travelled
            System.out.print("Enter distance travelled in km: ");
            int distance = scanner.nextInt();
            // Calculate fare using ternary operator
            double fare = (distance <= 5) ? 20.0 : 40.0;

            // Check if enough balance is available
            if (balance >= fare) {
                balance = balance - fare;
                System.out.println("Fare deducted: " + fare);
                System.out.println("Remaining Balance: " + balance);
            } 
	    else {
                System.out.println("Insufficient balance! ");
                break;
            }
        }
    }
}
