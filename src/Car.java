public class Car {
	String make = "Ford";
	String model = "Mustang";
	int year = 1969;
	double price = 150000.00;
	String color = "Red";
	boolean isRunning = false;

	void start() {
		isRunning = true;
		System.out.println("You're starting the car!");
	}

	void stop() {
		isRunning = false;
		System.out.println("You're stopping the car!");
	}

	void drive() {
		System.out.println("You're driving the car!");
	}

	void brake() {
		System.out.println("You're breaking the car!");
	}
}

