public class Car {

	String make;
	String model;
	String color;
	int year;

	Car(String make, String model, int year, String color) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}

//	.toString() => method inherited from the object class.
//	               used to return a string representation for an object.
//	               by default, it returns a hash code as a unique identifier.
//	               it can be overridden to provide meaningful details.

	@Override
	public String toString() {
		return this.make + " " + this.model + " " + this.year + " " + this.color;
	}
}

