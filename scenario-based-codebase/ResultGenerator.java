import java.util.Scanner;

public class ResultGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store marks of 5 subjects
        int[] marks = new int[5];
        int total = 0; 
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }

        // Calculate average marks
        int average = total / 5;
        char grade;
        // Switch statement 
        switch (average / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
	System.out.println(grade);
    }
}
