import java.util.Scanner;

public class LeapYear {

    // Method to check whether a year is a leap year
    static boolean isLeapYear(int year) {

        // Leap year conditions
        if (year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Checking leap year
        if (isLeapYear(year)) {
            System.out.println("The Year is a Leap Year");
        } 
	else {
            System.out.println("The Year is not a Leap Year");
        }
    }
}
