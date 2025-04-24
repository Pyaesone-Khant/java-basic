import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//        how to play Audio with JAVA (.wav, .au, .aiff)

		String filePath = "src\\The Last Bit Of Us.wav";

		File file = new File(filePath);

		try (
				Scanner scanner = new Scanner(System.in);
				AudioInputStream ais = AudioSystem.getAudioInputStream(file)
		) {
			Clip clip = AudioSystem.getClip();
			clip.open(ais);

			String response = "";
			while (!response.equals("Q")) {
				System.out.println("P = Play");
				System.out.println("S = Stop");
				System.out.println("R = Reset");
				System.out.println("Q = Quit");
				System.out.print("Enter your choice: ");

				response = scanner.nextLine().toUpperCase();

				switch (response) {
					case "P" -> clip.start();
					case "S" -> clip.stop();
					case "R" -> clip.setMicrosecondPosition(0);
					case "Q" -> clip.close();
					default -> System.out.println("Invalid choice!");
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
		} catch (UnsupportedAudioFileException e) {
			System.out.println("Audio Format not supported");
		} catch (LineUnavailableException e) {
			System.out.println("Unable to access the audio resource!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("Something went wrong!");
		} finally {
			System.out.println("Done!");
		}
	}
}
