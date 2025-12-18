import java.util.Scanner;

public class CheckNumberSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        int number = input.nextInt();

        // Check whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("positive");
        } 
	else if (number < 0) {
            System.out.println("negative");
        } 
	else {
            System.out.println("zero");
        }
    }
}
