import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take date input from user
        System.out.print("Enter a date (yyyy-mm-dd): ");
        String dateInput = input.next();
        // Convert String input to LocalDate
        LocalDate date = LocalDate.parse(dateInput);

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7)
                                    .plusMonths(1)
                                    .plusYears(2);

        LocalDate finalDate = updatedDate.minusWeeks(3);

        // Display results
        System.out.println("Original Date : " + date);
        System.out.println("After adding 7 days, 1 month, and 2 years : " + updatedDate);
        System.out.println("After subtracting 3 weeks : " + finalDate);
    }
}
