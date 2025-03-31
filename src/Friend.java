public class Friend {

//	static => makes a variable or method belong to class
//	          rather than to any specific object.
//	          commonly used for utility methods or shared resources.

//	static (vars/methods) don't need `this` keyword to access them

	static int numOfFriends;
	String name;

	Friend(String name) {
		this.name = name;
		numOfFriends++;
	}

	static void showFriends() {
		System.out.println("You have " + numOfFriends + " friends.");
	}
}
