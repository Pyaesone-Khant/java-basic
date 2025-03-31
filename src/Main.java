import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] fruits = {"apple", "orange", "banana", "grapes", "coconut"};

//		int numberOfFruits = fruits.length;
		Arrays.sort(fruits); // default array sorting method
		Arrays.fill(fruits, "watermelon"); // replacing all elements from array with "watermelon"

		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
