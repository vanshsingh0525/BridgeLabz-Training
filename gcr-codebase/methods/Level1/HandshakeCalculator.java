import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        // Call the method to calculate handshakes
        int handshakes = calculateHandshakes(numberOfStudents);

        // Display the output
        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is " + handshakes );
    }
}
