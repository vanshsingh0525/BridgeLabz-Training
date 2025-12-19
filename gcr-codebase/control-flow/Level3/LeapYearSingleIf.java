import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read year from user
        int year = input.nextInt();

        // Check for Gregorian calendar year and Leap Year using single if condition
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Year is a Leap Year");
        } 
	else {
            System.out.println("Year is not a Leap Year");
        }
    }
}
