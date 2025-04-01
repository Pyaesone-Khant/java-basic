public class Fish implements Prey, Predator {

//	method overriding => when a subclass override its own implementation of a method that is already defined.
//	                     allows for code reusability and give specific implementation.

	@Override
	public void flee() {
		System.out.println("This fish is swimming away!");
	}

	@Override
	public void hunt() {
		System.out.println("The fish is hunting!");
	}

}
