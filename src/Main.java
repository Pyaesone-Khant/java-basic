public class Main {

	public static void main(String[] args) {
//		2D array = an array where each element is an array
//		useful for storing a matrix of data

		String[] fruits = {"apple", "banana", "orange"};
		String[] vegetables = {"carrot", "tomato", "pepper"};
		String[] meats = {"beef", "pork", "chicken"};

		String[][] menu = {fruits, vegetables, meats};

		for (String[] row : menu) {
			for (String item : row) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
	}
}
