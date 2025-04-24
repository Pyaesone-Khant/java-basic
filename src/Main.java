import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
//        how to read a file using Java (3 popular ways)

//		1. BufferedReader + FileReader => best for reading text files line-by-line
//		2. FileInputStream => best for binary files (eg: images, audio files)
//		3. RandomAccessFile => best for read/writer specific portions of a large file.

		String filePath = "text.txt";


		try (BufferedReader br = new BufferedReader(new FileReader(filePath));) {
			System.out.println("File found!");
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
}
