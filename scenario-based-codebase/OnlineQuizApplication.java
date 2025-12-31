import java.util.Scanner;

public class OnlineQuizApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array of questions
        String[] questions = {
                "1. Which keyword is used to inherit a class in Java?",
                "2. Which data type is used to store decimal values?",
                "3. Which method is the entry point of a Java program?",
                "4. Which loop is guaranteed to execute at least once?",
                "5. Which of these is not an OOP concept?"
        };

        // Options for each question
        String[][] options = {
                {"A. this", "B. extends", "C. implements", "D. super"},
                {"A. int", "B. float", "C. char", "D. boolean"},
                {"A. start()", "B. run()", "C. main()", "D. execute()"},
                {"A. for", "B. while", "C. do-while", "D. foreach"},
                {"A. Encapsulation", "B. Polymorphism", "C. Compilation", "D. Inheritance"}
        };

        // Correct answers
        char[] answers = {'B', 'B', 'C', 'C', 'C'};

        int score = 0;

        System.out.println("Welcome to the Online Quiz Application");

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            // Switch for answer checking
            switch (userAnswer) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == answers[i]) {
                        System.out.println("Correct answer\n");
                        score++;
                    } else {
                        System.out.println("Wrong answer\n");
                    }
                    break;

                default:
                    System.out.println("Invalid option. Question skipped\n");
            }
        }
        System.out.println("Quiz Completed");
        System.out.println("Your Score: " + score + " out of " + questions.length);
    }
}
