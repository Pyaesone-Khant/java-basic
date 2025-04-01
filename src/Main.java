public class Main {

	public static void main(String[] args) {
//		polymorphism => "POLY" = "MANY"
//		             => "MORPH" = "SHAPE"
//		             => Objects can identity as other objects.
//			         => Objets can be treated as objects of a common superclass.

		Car car = new Car("BMW", "M3", 2020, "Black");
		Boat boat = new Boat();
		Bike bike = new Bike();

		Vehicle[] vehicles = {car, boat, bike};

		for (Vehicle vehicle : vehicles) {
			vehicle.go();
		}
	}
}
