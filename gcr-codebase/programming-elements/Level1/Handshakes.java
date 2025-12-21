import java.util.Scanner;

public class Handshakes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        // Calculating maximum number of handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the output
        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is " + handshakes);
    }
}
