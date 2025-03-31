import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		JAVA SLOT MACHINE

//		1. Declare variables
//		2. display welcome message
//		3. can play if balance > 0
//		4. enter bet amount
//		    1. check if BET < BALANCE
//			2. check if BET > 0
//		    3. subtract bet from balance
//		5. Spin row
//		6. print row
//		7. get payout
//		8. ask to play again
//		9. display exit message

		Scanner scanner = new Scanner(System.in);

//		1. =>
		double balance = 100;
		double bet;
		double payout;
		String[] rows;
		String playAgain = "Y";

//		2. =>
		System.out.println("=================================");
		System.out.println("Welcome to the JAVA slot machine!");
		System.out.println("Symbols: 🍋‍ 🍒 🔔 ⭐ 🍇");
		System.out.println("=================================");

//		3. =>
		while (balance > 0) {
			System.out.println("Current balance: $" + balance);
			System.out.print("Place your bet amount: ");
			bet = scanner.nextDouble();
			scanner.nextLine();

			if (bet > balance) {
				System.out.println("INSUFFICIENT BALANCE!");
				continue;
			} else if (bet <= 0) {
				System.out.println("BET MUST BE GREATER THAN 0!");
			} else {
				balance -= bet;
			}

			System.out.println("Spinning...");
//			5. =>
			rows = spinRow();
//			6. =>
			printRow(rows);
//			7. =>
			payout = getPayout(rows, bet);
			if (payout > 0) {
				System.out.println("You won $" + payout + "!");
				balance += payout;
			} else {
				System.out.println("Sorry You lost this round!");
			}

//			8. =>
			playAgain = askToPlayAgain(scanner);
			if (!playAgain.equals("Y")) {
				break;
			}
		}

//		9. =>
		System.out.println("Thanks for playing! Your final balance is $" + balance);
		scanner.close();
	}

	static String[] spinRow() {

		String[] symbols = {"🍋‍", "🍒", "🔔", "⭐", "🍇"};
		String[] row = new String[3];

		Random random = new Random();
		for (int i = 0; i < row.length; i++) {
			row[i] = symbols[random.nextInt(symbols.length)];
		}

		return row;
	}

	static void printRow(String[] row) {
		System.out.println("***************");
		System.out.println(" " + String.join(" | ", row));
		System.out.println("***************");
	}

	static double getPayout(String[] row, double bet) {
		if (row[0].equals(row[1]) && row[1].equals(row[2])) {
			return switch (row[0]) {
				case "🍋" -> bet * 3;
				case "🍒" -> bet * 4;
				case "🔔" -> bet * 5;
				case "⭐" -> bet * 10;
				case "🍇" -> bet * 20;
				default -> 0;
			};
		} else if (row[0].equals(row[1])) {
			return switch (row[0]) {
				case "🍋" -> bet * 1;
				case "🍒" -> bet * 2;
				case "🔔" -> bet * 3;
				case "⭐" -> bet * 5;
				case "🍇" -> bet * 10;
				default -> 0;
			};
		} else if (row[1].equals(row[2])) {
			return switch (row[1]) {
				case "🍋" -> bet * 1.5;
				case "🍒" -> bet * 2.5;
				case "🔔" -> bet * 3.5;
				case "⭐" -> bet * 5.5;
				case "🍇" -> bet * 10.5;
				default -> 0;
			};
		}

		return 0;
	}

	static String askToPlayAgain(Scanner scanner) {
		System.out.print("Play again? (Y/N): ");
		String playAgain = scanner.nextLine().toUpperCase();
		if (!playAgain.equals("Y") && !playAgain.equals("N")) {
			System.out.println("Invalid input! Please enter 'Y' or 'N' to continue!");
			askToPlayAgain(scanner);
		}

		return playAgain.toUpperCase();
	}
}
