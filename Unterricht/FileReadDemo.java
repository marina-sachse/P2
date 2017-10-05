package Unterricht;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {

	public static void main(String[] args) {
		/*		File file = new File("test.txt");
		System.out.println(file.getAbsolutePath());
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println("Datei nicht gefunden");
		}*/
		
		File file = new File("C:/Users/abq352/workspace/P2_WS17_18/src/Unterricht/test.txt");
//		File file = new File("src/Unterricht/test.txt");
		System.out.println(file.getAbsolutePath());
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Datei nicht gefunden");
		} catch (Exception e) {
			System.out.println("garnichts gefunden");
		} 
	}

	}


