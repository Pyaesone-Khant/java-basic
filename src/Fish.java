public class Fish extends Animal {

//	method overriding => when a subclass override its own implementation of a method that is already defined.
//	                     allows for code reusability and give specific implementation.

	@Override
	void move() {
		System.out.println("This animal is swimming!");
	}

}
