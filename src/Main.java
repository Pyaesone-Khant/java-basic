import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		ROCK - PAPER - SCISSORS GAME

//		1. declare vars
//		2. get choice from the user
//		3. get random choice for the computer
//		4. check win condition
//		5. ask to play again?
//		6. goodbye message

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

//		1. =>
		String[] choices = {"ROCK", "PAPER", "SCISSORS"};
		String playerChoice;
		String computerChoice;
		String playAgain = "YES";

		do {
			System.out.println("------------------------------------------");
			System.out.println("Welcome to the Rock, Paper, Scissors game!");
			System.out.println("------------------------------------------");

			//		2. =>
			playerChoice = getUserChoice(scanner);

//			3. =>
			computerChoice = choices[random.nextInt(choices.length)];
			System.out.println("Computer choice: " + computerChoice);

//			4. =>
			System.out.println("************");
			if (computerChoice.equals(playerChoice)) {
				System.out.println("It's a tie!");
			} else if (checkWin(playerChoice, computerChoice)) {
				System.out.println("You win!");
			} else {
				System.out.println("You lose!");
			}
			System.out.println("************");

//			5. =>
			System.out.print("Do you want to play again? (yes/no): ");
			playAgain = scanner.nextLine().toUpperCase();
		} while (playAgain.equals("YES"));

//		6. =>
		System.out.println("Goodbye! See you next time!");

		scanner.close();
	}

	static boolean checkWin(String playerChoice, String computerChoice) {
		return playerChoice.equals("ROCK") && computerChoice.equals("SCISSORS") ||
				playerChoice.equals("PAPER") && computerChoice.equals("ROCK") ||
				playerChoice.equals("SCISSORS") && computerChoice.equals("PAPER");
	}

	static String getUserChoice(Scanner scanner) {
		System.out.print("Please enter your choice (ROCK, PAPER, SCISSORS): ");
		String userChoice = scanner.nextLine().toUpperCase();

		if (!userChoice.equals("ROCK") && !userChoice.equals("PAPER") && !userChoice.equals("SCISSORS")) {
			System.out.println("Invalid choice!");
			return getUserChoice(scanner);
		}

		return userChoice;
	}
}
