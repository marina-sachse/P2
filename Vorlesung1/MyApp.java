package Vorlesung1;

import javax.swing.JFrame;

public class MyApp {

	//wenn ihr mit der Maus auf Methoden oder Klassen geht, seht ihr den JavaDoc-Teil als Java-Dokumentation
	/**
	 * Diese Klasse erstellt ein Objekt der Klasse MyFrame mit dem Titel "Huhu" und der Groeﬂe 200 x 200. 
	 * 
	 * @param args werden nicht verwendet
	 */
	public static void main(String[] args) {

		JFrame frame = new MyFrame ("Huhu");
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
