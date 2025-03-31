public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("John", 25, "Computer Science");
		Student student2 = new Student("Jane", 23, "Electrical Engineering");

		System.out.println("Student 1 => ");
		System.out.println(student1.name);
		System.out.println(student1.age);
		System.out.println(student1.major);

		System.out.println("\nStudent 2 => ");
		System.out.println(student2.name);
		System.out.println(student2.age);
		System.out.println(student2.major);
	}
}
