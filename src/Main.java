import java.util.Scanner;

public class Main {

	public static int getChoice(Scanner scanner) {
		System.out.print("\nChoose an option: ");
		int choice = scanner.nextInt();

		if (choice == 1 || choice == 2) {
			return choice;
		} else {
			System.out.println("Invalid choice! Please try again");
			return getChoice(scanner);
		}
	}

	public static void main(String[] args) {

//		Weight conversion program

		Scanner sc = new Scanner(System.in);

		double weight;
		double newWeight;
		int choice;

		System.out.println("Weight Conversion Program");
		System.out.println("Type 1 to convert lbs to kgs");
		System.out.println("Type 2 to convert kgs to lbs");

		choice = getChoice(sc);

		if (choice == 1) {
			System.out.print("Enter your weight in lbs: ");
			weight = sc.nextDouble();

			newWeight = weight * 0.453592;

			System.out.printf("Your weight in kgs is %.2f.\n", newWeight);
		} else if (choice == 2) {
			System.out.print("Enter your weight in kgs: ");
			weight = sc.nextDouble();

			newWeight = weight * 2.20462;

			System.out.printf("Your weight in lbs is %.2f.\n", newWeight);
		}

		sc.close();
	}

}
