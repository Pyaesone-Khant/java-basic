import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String filePath = "words.txt";
		ArrayList<String> words = loadWordsFromFile(filePath);

		if (words.isEmpty()) {
			System.out.println("Word list is empty. Exiting game.");
			return;
		}

		System.out.println("========================");
		System.out.println("Welcome to Java Hangman!");
		System.out.println("========================");

		Random rand = new Random();
		boolean playAgain = true;

		while (playAgain) {
			String word = words.get(rand.nextInt(words.size()));
			playGame(scanner, word);
			playAgain = askToPlayAgain(scanner);
		}

		System.out.println("Thanks for playing!");
		scanner.close();
	}

	private static ArrayList<String> loadWordsFromFile(String filePath) {
		ArrayList<String> words = new ArrayList<>();

		try (
				BufferedReader br = new BufferedReader(new FileReader(filePath))
		) {
			String line;
			while ((line = br.readLine()) != null) {
				words.add(line.trim().toLowerCase());
			}
		} catch (IOException e) {
			System.out.println("Error reading the file: " + e.getMessage());
		}

		return words;
	}

	private static void playGame(Scanner scanner, String word) {
		ArrayList<Character> guessedChars = new ArrayList<>(Collections.nCopies(word.length(), '_'));
		int wrongGuesses = 0;

		while (wrongGuesses < 6) {
			if (wrongGuesses > 0) {
				System.out.println(getHangmanArt(wrongGuesses));
			}

			System.out.print("Word: ");
			for (char c : guessedChars) {
				System.out.print(c + " ");
			}
			System.out.println();

			System.out.print("Guess a letter: ");
			char guess = scanner.next().toLowerCase().charAt(0);

			if (word.indexOf(guess) != -1) {
				System.out.println("***CORRECT***");

				for (int i = 0; i < word.length(); i++) {
					if (word.charAt(i) == guess) {
						guessedChars.set(i, guess);
					}
				}

				if (!guessedChars.contains('_')) {
					System.out.println(getHangmanArt(wrongGuesses));
					System.out.println("YOU WIN! The word was: " + word);
					return;
				}
			} else {
				wrongGuesses++;
				System.out.println("***WRONG***");
			}
		}

		System.out.println(getHangmanArt(wrongGuesses));
		System.out.println("GAME OVER! YOU LOSE!");
		System.out.println("The word was: " + word);
	}

	private static boolean askToPlayAgain(Scanner scanner) {
		System.out.print("Would you like to play again? (y/n): ");
		char option = scanner.next().toLowerCase().charAt(0);
		return option == 'y';
	}

	private static String getHangmanArt(int guess) {
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
}
