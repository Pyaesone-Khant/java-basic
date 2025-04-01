public abstract class Shape {
	
//	    abstract => used to define abstract classes and methods.
//		         => the process for hiding implementation details & showing only the essential features.
//			     => abstract classes CAN'T be instantiated directly.
//				 => can contain 'abstract' methods (which must be implemented)
//		         => can contain 'concrete' methods (which are inherited)

	abstract double area(); // ABSTRACT

	//	CONCRETE
	void display() {
		System.out.println("This is a shape!");
	}
}
