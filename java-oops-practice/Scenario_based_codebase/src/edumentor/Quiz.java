package edumentor;

public class Quiz {
	
	private String[] questions;
	private String[] answers;
	public int score;
	public String Difficulty;
	
	public Quiz(String[] questions, String[] answers, String difficulty) {
		this.questions  = questions;
		this.answers = answers;
		this.Difficulty = difficulty;
	}
	
	public void calculateScore(String[] userAnswers) {
		score = 0;
		for(int i=0; i<answers.length; i++) {
			if(answers[i].equals(userAnswers[i])) {
				score++;
			}
		}
	}
	
	public double calculatePercentage() {
		return (score*100)/ answers.length;
	}
}
