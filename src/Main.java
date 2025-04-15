import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		runtime polymorphism => when the method that gets executed is decided at runtime based on the actual type of the object.

		Animal animal;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Would you like a dog or cat? (1 = dog, 2 = cat): ");
		int choice = scanner.nextInt();

		if(choice == 1){
			animal = new Dog();
			animal.speak();
		}else if(choice == 2){
			animal = new Cat();
			animal.speak();
		}

		scanner.close();
	}
}
