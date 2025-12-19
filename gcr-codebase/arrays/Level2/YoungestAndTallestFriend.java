import java.util.Scanner;

public class YoungestAndTallestFriend {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input for age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);
            System.out.print("Enter age: ");
            ages[i] = input.nextInt();
            System.out.print("Enter height: ");
            heights[i] = input.nextDouble();
        }

        // Assume first friend is youngest and tallest initially
        int youngestIndex = 0;
        int tallestIndex = 0;
        // Loop to find youngest and tallest friend
        for (int i = 1; i < 3; i++) {
            // Check for youngest
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            // Check for tallest
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("Youngest Friend: " + names[youngestIndex]);
        System.out.println("Tallest Friend: " + names[tallestIndex]);

    }
}
