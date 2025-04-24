import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
// Java HANGMAN GAME

		String word = "pizza";

		Scanner scanner = new Scanner(System.in);

		ArrayList<Character> chars = new ArrayList<>();
		int wrongGuess = 0;

		for (int i = 0; i < word.length(); i++) {
			chars.add('_');
		}

		System.out.println("========================");
		System.out.println("Welcome to Java Hangman!");
		System.out.println("========================");

		while (wrongGuess < 6) {
			if (wrongGuess > 0) {
				System.out.print(getHangmanArt(wrongGuess));
				System.out.println();
			}
			System.out.println();
			System.out.print("Word: ");
			for (char c : chars) {
				System.out.print(c + " ");
			}
			System.out.println();

			System.out.print("Guess a letter: ");
			char guess = scanner.next().toLowerCase().charAt(0);

			if (word.indexOf(guess) != -1) {
				System.out.println("***CORRECT***");

				for (int i = 0; i < word.length(); i++) {
					if (word.charAt(i) == guess) {
						chars.set(i, guess);
					}
				}

				if (!chars.contains('_')) {
					System.out.println(getHangmanArt(wrongGuess));
					System.out.println("YOU WIN!");
					System.out.println("The word was: " + word);
					break;
				}

			} else {
				wrongGuess++;
				System.out.println("***WRONG***");
			}
		}

		if (wrongGuess >= 6) {
			System.out.println(getHangmanArt(wrongGuess));
			System.out.println("GAME OVER!");
			System.out.println("YOU LOSE!");
			System.out.println("The word was " + word);
		}
		
		scanner.close();
	}

	static String getHangmanArt(int guess) {
		return switch (guess) {
			case 0 -> """
					
					
					
					""";
			case 1 -> """
					  O
					
					
					""";
			case 2 -> """
					  O
					  |
					
					""";
			case 3 -> """
					  O
					 /|
					
					""";
			case 4 -> """
					  O
					 /|\\
					
					""";
			case 5 -> """
					  O
					 /|\\
					 /
					""";
			case 6 -> """
					  O
					 /|\\
					 / \\
					""";
			default -> "";
		};
	}

	;
}
