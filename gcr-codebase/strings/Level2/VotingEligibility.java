import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // Random age between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility and return 2D array [age, canVote]
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "Cannot Vote";
            } else if (age >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayResults(String[][] data) {
        System.out.println("Age\tVoting Eligibility");
        System.out.println("------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ages = new int[10];

        // Take input for 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }
        // Check voting eligibility
        String[][] results = checkVotingEligibility(ages);

        // Display results
        displayResults(results);
    }
}
