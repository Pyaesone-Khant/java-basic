public class Employee extends Person {

//	super => refers to the parent class (subclass <- superclass)
//	         used in constructors and method overriding
//	         calls the parent constructor to initialize attributes

	int salary;

	Employee(String firstName, String lastName, int salary) {
		super(firstName, lastName);
		this.salary = salary;
	}

	void showSalary() {
		System.out.println(this.firstName + " earns $" + this.salary + " a month!");
	}

}
