public class Main {

	public static void main(String[] args) {
//		varargs => allow a method to accept a varying # of arguments
//				   make methods more flexible, no more overloaded methods
//		           java will pack the arguments into an array => (...) ellipse

		System.out.println(average());

	}

	static int add(int... numbers) {
		int sum = 0;

		if (numbers.length == 0) {
			return sum;
		}

		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}

	static double average(double... numbers) {
		double sum = 0;

		if (numbers.length == 0) {
			return sum;
		}

		for (double i : numbers) {
			sum += i;
		}
		return sum / numbers.length;
	}
}
