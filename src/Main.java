import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
//        how to write a file using java (4 popular ways)

//        1. FileWriter => good for small/medium-sized text files
//        2. BufferedWriter => better performance for large amounts of text
//        3. PrintWriter => best for structured data, like reports or logs
//        4. FileOutputStream => best for binary files (eg: images, audio files)


//		FileWriter Example

		String filePath = "text.txt"; // can also give absolut file path (eg: C:\Users\hp user\Desktop\)
		String text = """
				I like yours Sketchers
				You like me, my Gucci Shoes
				I'll buy you the purse
				If you only show me your BooBs
				""";

		try (FileWriter fileWriter = new FileWriter(filePath)) {
			fileWriter.write(text);
			System.out.println("File written!");
		} catch (FileNotFoundException e) {
			System.out.println("Could not locate file location!.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("Something went wrong while writing to the file!");
		}
	}
}
