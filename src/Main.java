import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		number guessing game

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		int guess;
		int attempts = 0;
		int min = 1;
		int max = 100;
		int randomNumber = rand.nextInt(min, max + 1);

		System.out.println("Number Guessing Game!");
		System.out.printf("Please enter a number between %d - %d \n", min, max);

		do {
			System.out.print("Enter a guess: ");
			guess = sc.nextInt();
			attempts++;

			if (guess < randomNumber) {
				System.out.println("Your number is too low! Please try again.");
			} else if (guess > randomNumber) {
				System.out.println("Your number is too high! Please try again.");
			} else {
				System.out.println("Correct! Your number is " + guess);
				System.out.println("Total Number of Attempts #: " + attempts);
			}
		} while (guess != randomNumber);

		System.out.printf("You have won with the total number of attempts: %d!\n", attempts);

		sc.close();
	}

}
