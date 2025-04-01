public class Main {

	public static void main(String[] args) {

		Circle circle = new Circle(10);
		Triangle triangle = new Triangle(4, 5);
		Rectangle rectangle = new Rectangle(10, 4);

		System.out.println(circle.area());
		System.out.println(triangle.area());
		System.out.println(rectangle.area());
	}
}
