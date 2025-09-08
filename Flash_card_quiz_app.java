import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Question {
	String question;
	String[] options;
	int correctAnswer;

	public Question(String question, String[] options, int correctAnswer) {
		this.question = question;
		this.options = options;
		this.correctAnswer = correctAnswer;
	}
}

public class FlashcardQuizApp {
	public static void main(String[] args) {
		List<Question> questions = new ArrayList<>();

		// Add questions to the list
		questions.add(new Question("What is the capital of France?", new String[] {"Paris", "London", "Berlin", "Rome"}, 0));
		questions.add(new Question("What is the largest planet in our solar system?", new String[] {"Earth", "Saturn", "Jupiter", "Mars"}, 2));
		questions.add(new Question("Who is the author of the book 'To Kill a Mockingbird'?", new String[] {"F. Scott Fitzgerald", "Harper Lee", "Jane Austen", "J.K. Rowling"}, 1));

		// Shuffle the questions
		Collections.shuffle(questions);

		Scanner scanner = new Scanner(System.in);
		int score = 0;

		// Ask the questions
		for (Question question : questions) {
			System.out.println(question.question);
			for (int i = 0; i < question.options.length; i++) {
				System.out.println((i + 1) + ". " + question.options[i]);
			}

			System.out.print("Enter your answer (1-" + question.options.length + "): ");
			int answer = scanner.nextInt() - 1;

			if (answer == question.correctAnswer) {
				System.out.println("Correct!");
				score++;
			} else {
				System.out.println("Incorrect. The correct answer is " + (question.correctAnswer + 1) + ". " + question.options[question.correctAnswer]);
			}
		}

		System.out.println("Your final score is " + score + "/" + questions.size());
	}
}
