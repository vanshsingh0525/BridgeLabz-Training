import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
	    //Printing the value
            System.out.println(counter);
            counter--;   
        }
    }
}
