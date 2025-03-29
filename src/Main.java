import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		compound interest calculator
//		formula => A = P [1 + (r/n)] pow n*t

		Scanner sc = new Scanner(System.in);

		double principal;
		double rate;
		int timesCompounded;
		int years;
		double amount;

		System.out.print("Enter principal amount: ");
		principal = sc.nextDouble();

		System.out.print("Enter interest rate amount (in %): ");
		rate = sc.nextDouble() / 100;

		System.out.print("Enter the number of times compounded per year: ");
		timesCompounded = sc.nextInt();

		System.out.print("Enter the number of years: ");
		years = sc.nextInt();

		amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

		System.out.printf("The Amount after %d year(s) is: $%,.2f", years, amount);

		sc.close();
	}
}
