import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        int age = input.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } 
	else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }       
    }
}
