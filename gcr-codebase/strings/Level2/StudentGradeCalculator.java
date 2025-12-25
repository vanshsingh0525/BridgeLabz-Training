import java.util.Random;

public class StudentGradeCalculator {

    // Method to generate random 2-digit marks for PCM
    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];
        Random rand = new Random();

        for (int i = 0; i < students; i++) {
            marks[i][0] = rand.nextInt(90) + 10; // Physics
            marks[i][1] = rand.nextInt(90) + 10; // Chemistry
            marks[i][2] = rand.nextInt(90) + 10; // Maths
        }
        return marks;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateScores(int[][] marks) {
        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrade(double[][] scores) {
        String[] grades = new String[scores.length];

        for (int i = 0; i < scores.length; i++) {
            double percentage = scores[i][2];

            if (percentage >= 80)
                grades[i] = "A";
            else if (percentage >= 70)
                grades[i] = "B";
            else if (percentage >= 60)
                grades[i] = "C";
            else if (percentage >= 50)
                grades[i] = "D";
            else if (percentage >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }
        return grades;
    }

    // Method to display scorecard in tabular format
    public static void displayScorecard(int[][] marks, double[][] scores, String[] grades) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                (int) scores[i][0] + "\t" +
                scores[i][1] + "\t" +
                scores[i][2] + "\t" +
                grades[i]
            );
        }
    }

    public static void main(String[] args) {

        int numberOfStudents = 5;

        // Generate random PCM marks
        int[][] marks = generateMarks(numberOfStudents);
        // Calculate total, average and percentage
        double[][] scores = calculateScores(marks);
        // Calculate grades
        String[] grades = calculateGrade(scores);

        // Display final scorecard
        displayScorecard(marks, scores, grades);
    }
}
