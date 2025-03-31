public class User {
	String username;
	String email;
	int age;

//	overloaded constructor

	User() {
		this.username = "GUEST";
		this.email = "NOT PROVIDED!";
		this.age = 0;
	}

	User(String username) {
		this.username = username;
		this.email = "NOT PROVIDED!";
		this.age = 0;
	}

	User(String username, String email) {
		this.username = username;
		this.email = email;
		this.age = 0;
	}

	User(String username, String email, int age) {
		this.username = username;
		this.email = email;
		this.age = age;
	}
}
