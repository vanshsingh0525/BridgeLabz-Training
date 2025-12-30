import java.util.Scanner;

public class LibraryReminderApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constant fine per day
        final int FINE_PER_DAY = 5;
        // Variable to store total fine
        int totalFine = 0;

        for (int i = 1; i <= 5; i++) {
            // Ask for due date of the book
            System.out.println("Enter due date (day number) for book " + i + ":");
            int dueDate = scanner.nextInt();

            // Ask for return date of the book
            System.out.println("Enter return date (day number) for book " + i + ":");
            int returnDate = scanner.nextInt();

            // Check if the book is returned late
            if (returnDate > dueDate) {
                // Calculate late days
                int lateDays = returnDate - dueDate;
                // Calculate fine for the book
                int fine = lateDays * FINE_PER_DAY;
                // Add fine to total fine
                totalFine = totalFine + fine;
            }
        }

        // Display total fine for all books
        System.out.println("Total Fine Amount: ₹" + totalFine);
    }
}
