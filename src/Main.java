import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		switch statement
		String day;

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the day of the week: ");
		day = sc.nextLine();

		System.out.println("Output from switch case 1: =>");
//		switch-case 1
		switch (day) {
			case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
				System.out.println("It's a weekday! 🤨");
				break;
			case "Saturday", "Sunday":
				System.out.println("Yay! It's a weekend! 🤣");
				break;
			default:
				System.out.println(day + " is not a day!");
		}

		System.out.println("Output from switch case 2: =>");
//		switch-case 2
		switch (day) {
			case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It's a weekday! 🤨");
			case "Saturday", "Sunday" -> System.out.println("Yay! It's a weekend! 🤣");
			default -> System.out.println(day + " is not a day!");
		}

		sc.close();
	}

}
