package Unterricht;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args) {
		
		File file = new File("src/Unterricht/testout2.txt");
		try {
			PrintWriter writer = new PrintWriter(file);
			//FileWriter writer = new FileWriter(file);
			//writer.write("Nachricht von Java");
			
			writer.println("Nachricht von Java");
			writer.println("Zweite Zeile");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
