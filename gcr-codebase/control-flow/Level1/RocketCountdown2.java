import java.util.Scanner;

public class RocketCountdown2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        int counter = sc.nextInt();

        // Countdown using while loop
        for(int i=counter; i>=1; i--){
	      //Printing the value
	      System.out.println(i);
	}
    }
}