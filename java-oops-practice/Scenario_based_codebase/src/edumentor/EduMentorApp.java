package edumentor;

public class EduMentorApp {

    public static void main(String[] args) {

        Learner learner = new Learner("Aman", "aman@gmail.com", 101);
        Instructor instructor = new Instructor("Dr. Sharma", "sharma@gmail.com", 201);

        learner.printDetails();
        instructor.printDetails();

        String[] questions = {"Q1", "Q2", "Q3"};
        String[] answers = {"A", "B", "C"};

        Quiz quiz = new Quiz(questions, answers, "Medium");

        String[] userAnswers = {"A", "B", "D"};
        quiz.calculateScore(userAnswers);

        double percentage = quiz.calculatePercentage();
        System.out.println("Quiz Percentage: " + percentage);

        ICertifiable shortCourse = new ShortCourse(percentage);
        ICertifiable fullTimeCourse = new FullTimeCourse(percentage);

        shortCourse.generateCertificate();
        fullTimeCourse.generateCertificate();
    }
}

