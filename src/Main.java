import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		to accept input from user, have to use Scanner Class!

		// Calculate area of rectangle
		double width = 0;
		double height = 0;
		double area = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter width:  ");
		width = scanner.nextDouble();

		System.out.println("Enter height: ");
		height = scanner.nextDouble();

		area = width * height;

		System.out.println("The area is " + area);
	}
}
