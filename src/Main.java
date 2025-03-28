import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Shopping Cart Program
		Scanner scanner = new Scanner(System.in);

		String item;
		double price;
		int quantity;
		char currency = '$';
		double total = 0.0;

		System.out.print("What item would you like to buy: ");
		item = scanner.nextLine();

		System.out.print("What is the price for each?: ");
		price = scanner.nextDouble();

		System.out.print("How many " + item + " would you like to get?: ");
		quantity = scanner.nextInt();

		total = price * quantity;

		System.out.println("\nYou've bought " + quantity + " " + item + "/s");
		System.out.println("Your total will be " + currency + total);

		scanner.close();
	}
}
