public class Main {

	public static void main(String[] args) {
//		interface => a blueprint for a class that specifies a set of abstract methods
//		          => that implementing classes MUST define.
//		          => supports multiple inheritance-like behavior

		Rabbit rabbit = new Rabbit();
		Hawk hawk = new Hawk();
		Fish fish = new Fish();

		fish.flee();
		fish.hunt();
	}
}
