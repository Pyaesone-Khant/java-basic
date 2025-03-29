import java.util.Random;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		JAVA Dice Roller Program

//		declare variables
//		get # of Dice from user
//		check if # of Dice > 0
//		roll all the Dice
//		get the total
//		display ASCII of dice

//		1. declaration
		Random rand = new Random();

		int numOfDice;
		int total = 0;

//		2. get # of Dice from user
		numOfDice = getNumOfDice();

		for (int i = 0; i < numOfDice; i++) {
			int roll = rand.nextInt(1, 7);
			total += roll;
			printDie(roll);
			System.out.println("You rolled " + roll + ".");
		}

		System.out.println("Total Points: " + total);

	}

	static int getNumOfDice() {
		int numOfDice = 0;

		System.out.print("Enter the # of dice to roll: ");
		numOfDice = sc.nextInt();

		if (numOfDice > 0) {
			System.out.println("You rolled the dice " + numOfDice + " time(s).");
			return numOfDice;
		} else {
			System.out.println("Number of dice must be greater than 0! Please try again.");
			getNumOfDice();
			return numOfDice;
		}
	}

	static void printDie(int roll) {

		String dice1 = """
				 -------
				|       |
				|   ●   |
				|       |
				 -------
				""";

		String dice2 = """
				 -------
				| ●     |
				|       |
				|     ● |
				 -------
				""";

		String dice3 = """
				 -------
				| ●     |
				|   ●   |
				|     ● |
				 -------
				""";

		String dice4 = """
				 -------
				| ●   ● |
				|       |
				| ●   ● |
				 -------
				""";

		String dice5 = """
				 -------
				| ●   ● |
				|   ●   |
				| ●   ● |
				 -------
				""";

		String dice6 = """
				 -------
				| ●   ● |
				| ●   ● |
				| ●   ● |
				 -------
				""";

		switch (roll) {
			case 1 -> System.out.print(dice1);
			case 2 -> System.out.print(dice2);
			case 3 -> System.out.print(dice3);
			case 4 -> System.out.print(dice4);
			case 5 -> System.out.print(dice5);
			case 6 -> System.out.print(dice6);
			default -> System.out.print("Invalid Roll!");
		}
	}
}
