public class Main {

	public static void main(String[] args) {

		User user = new User();
		User user1 = new User("Pyaesone Khant");
		User user2 = new User("Woodi", "woodi@gmail.com");
		User user3 = new User("PK", "pk@gmail.com", 23);

		System.out.println(user.username);
		System.out.println(user.email);
		System.out.println(user.age);
		System.out.println();

		System.out.println(user1.username);
		System.out.println(user1.email);
		System.out.println(user1.age);
		System.out.println();

		System.out.println(user2.username);
		System.out.println(user2.email);
		System.out.println(user2.age);
		System.out.println();

		System.out.println(user3.username);
		System.out.println(user3.email);
		System.out.println(user3.age);
	}
}
