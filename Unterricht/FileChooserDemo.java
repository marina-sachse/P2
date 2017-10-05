package Unterricht;

import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class FileChooserDemo {

	public static void main(String[] args) {
		
		JFileChooser fileChooser = new JFileChooser(new File("src"));
		
		if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			File file = fileChooser.getSelectedFile();
		
			try {
					Scanner scan = new Scanner(file);
				while (scan.hasNextLine()) {
					System.out.println(scan.nextLine());		
				}
				scan.close();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		
					
		}
		
		
	//	fileChooser.showSaveDialog(parent);      dann steht unten im geöffneten Fenster speichern und nicht öffnen

	}

}
