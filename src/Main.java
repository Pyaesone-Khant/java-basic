import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		JAVA Banking Program

//		1. declare variables
//		2. display menu
//      3. Get & Process user's choice
//	    4. showBalance()
//	    5. deposit()
//	    6. withdraw()
//	    7. exit message

		double balance = 0;
		boolean isRunning = true;
		int choice;

		while (isRunning) {
			System.out.println("******************************");
			System.out.println("Banking Program");
			System.out.println("******************************");
			System.out.println("1. Show Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("******************************");

			choice = getChoice();

			switch (choice) {
				case 1 -> showBalance(balance);
				case 2 -> balance += deposit();
				case 3 -> balance -= withdraw(balance);
				case 4 -> isRunning = false;
				default -> System.out.println("Invalid choice");
			}
		}

		System.out.println("******************************");
		System.out.println("Thank you for using our program. Goodbye!");

		sc.close();
	}

	static int getChoice() {
		System.out.print("Enter choice (1-4) : ");
		int choice = sc.nextInt();

		if (choice < 1 || choice > 4) {
			System.out.println("INVALID CHOICE! PLEASE ENTER A VALID CHOICE");
			return getChoice();
		}

		return choice;
	}

	static void showBalance(double balance) {
		System.out.println("******************************");
		System.out.printf("TOTAL BALANCE: $%,.2f.\n", balance);
	}

	static double deposit() {
		double amount;
		System.out.print("Enter amount to be deposited: ");
		amount = sc.nextDouble();

		if (amount <= 0) {
			System.out.println("******************************");
			System.out.println("INVALID AMOUNT TO DEPOSIT!");
			return 0;
		} else {
			System.out.println("******************************");
			System.out.printf("AMOUNT DEPOSITED: $%,.2f.\n", amount);
			return amount;
		}
	}

	static double withdraw(double balance) {
		double amount;

		System.out.print("Enter amount to be withdrawn: ");
		amount = sc.nextDouble();

		if (amount <= 0) {
			System.out.println("******************************");
			System.out.println("INVALID AMOUNT TO WITHDRAWN!");
			return 0;
		} else if (amount > balance) {
			System.out.println("******************************");
			System.out.println("INSUFFICIENT AMOUNT TO WITHDRAWN!");
			return 0;
		} else {
			System.out.println("******************************");
			System.out.printf("AMOUNT WITHDRAWN: $%,.2f.\n", amount);
			return amount;
		}
	}
}
