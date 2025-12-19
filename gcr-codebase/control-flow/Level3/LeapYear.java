import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        int year = input.nextInt();
        // Check if year is valid (Gregorian calendar)
        if (year >= 1582) {

            // -------- Part 1: Using multiple if-else statements --------
            if (year % 400 == 0) {
                System.out.println("Using if-else: Year is a Leap Year");
            } 
	    else if (year % 100 == 0) {
                System.out.println("Using if-else: Year is not a Leap Year");
            }
	    else if (year % 4 == 0) {
                System.out.println("Using if-else: Year is a Leap Year");
            }
            else {
                System.out.println("Using if-else: Year is not a Leap Year");
            }

            // -------- Part 2: Using single if with logical operators --------
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Using logical operators: Year is a Leap Year");
            } 
	    else {
                System.out.println("Using logical operators: Year is not a Leap Year");
            }

        } 
	else {
            // Year less than 1582
            System.out.println("Year must be 1582 or later");
        }
    }
}
