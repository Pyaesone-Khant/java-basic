public class Main {

	public static void main(String[] args) {
//		printf() => a method used to format output

//		%[flags][width][.precision][specifier-character]

//		[flags]
//		+ => output a plus
//		- => comma grouping separator
//		( => negative numbers are enclosed in ()
//		space => display a minus if negative, space if positive


//		[widths]
//		0 => zero padding
//		just number => right justified padding
//		- => left justified padding


//		[.precision] for float/double
//		0.1 => 9.9
//		0.2 => 9.99
//		0.3 => 9.999


//		[specifier-character]
//		s => String
//		c => char
//		d => int
//		f => double
//		b => booleanfe


		String name = "Spongebob";
		char firstLetter = name.charAt(0);
		int age = 23;
		double height = 1.5;
		boolean isEmployed = true;

		System.out.printf("Hello %s.\n", name);
		System.out.printf("Your name start with %c.\n", firstLetter);
		System.out.printf("Your age is %d.\n", age);
		System.out.printf("Your height is %f.\n", height);
		System.out.printf("Your isEmployed is %b\n", isEmployed);
	}
}
