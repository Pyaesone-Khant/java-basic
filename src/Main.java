import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Java Quiz Game

//		1. questions array[]
//		2. options array[]
//		3. declare variables
//		4. welcome message
//		5. question (loop)
//		    1. options (loop)
//		    2. get guess from user
//		    3. check our guess
//		6. display final score

		String[] questions = {
				"What is the capital of France?",
				"What is the capital of Germany?",
				"What is the capital of Italy?",
				"What is the capital of Spain?",
				"What is the capital of Myanmar?"
		};

		String[][] options = {
				{"1. Paris", "2. Berlin", "3. London", "4. Rome"},
				{"1. Madrid", "2. Barcelona", "3. Vienna", "4. Berlin"},
				{"1. Empoli", "2. Milan", "3. Rome", "4. Turin"},
				{"1. Betis", "2. Madrid", "3. Vienna", "4. Rome"},
				{"1. Naypyidaw", "2. Kayah", "3. Myanmar", "4. Shan"}
		};

		int[] answers = {1, 4, 3, 2, 1};
		int score = 0;
		int guess;

		Scanner scanner = new Scanner(System.in);

		System.out.println("--------------------------------");
		System.out.println("Welcome to Java Quiz Game!");
		System.out.println("--------------------------------");

		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);

			for (String option : options[i]) {
				System.out.println(option);
			}

			System.out.print("Enter your guess: ");
			guess = scanner.nextInt();

			if (guess == answers[i]) {
				System.out.println("********");
				System.out.println("CORRECT!");
				System.out.println("********");
				score++;
			} else {
				System.out.println("********");
				System.out.println(" WRONG! ");
				System.out.println("********");
			}
		}

		System.out.println("--------------------------------");
		System.out.println("Your total score is: " + score + " out of " + questions.length);
		System.out.println("--------------------------------");

		scanner.close();
	}
}
