import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vote counters for candidates
        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {
            // Ask for age or exit code
            System.out.print("\nEnter voter age (or enter -1 to exit): ");
            int age = scanner.nextInt();
            // Exit condition
            if (age == -1) {
                break;
            }

            // Check voting eligibility
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
                System.out.print("Enter your vote (1 / 2 / 3): ");
                int vote = scanner.nextInt();

                // Record the vote
                if (vote == 1) {
                    candidate1Votes++;
                } 
		else if (vote == 2) {
                    candidate2Votes++;
                } 
		else if (vote == 3) {
                    candidate3Votes++;
                } 
		else {
                    System.out.println("Invalid vote! Vote not counted.");
                }

            } 
	    else {
                System.out.println("You are NOT eligible to vote.");
            }
        }

        // Display final results
        System.out.println("Election Results:");
        System.out.println("Candidate 1 Votes: " + candidate1Votes);
        System.out.println("Candidate 2 Votes: " + candidate2Votes);
        System.out.println("Candidate 3 Votes: " + candidate3Votes);
    }
}
