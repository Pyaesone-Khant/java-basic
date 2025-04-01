public class Student extends Person {

	String major;

	Student(String firstName, String lastName, String major) {
		super(firstName, lastName);
		this.major = major;
	}

	void showMajor() {
		System.out.println(this.firstName + " is a " + this.major + " student.");
	}
}
