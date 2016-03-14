package Vorlesung1;

import javax.swing.JFrame;

public class MyFirstFrame {

	/**
	 * Diese Methode erzeugt ein Fenster namens "Meine erste Gui-App". In dem Fenster ist ein Button zu sehen.
	 * 
	 * @param args wird nicht genutzt
	 */
	public static void main(String[] args) {

		//Erzeuge ein Objekt von MyFrame 
		JFrame frame = new MyFrame("Meine erste Gui-App");
		
		//macht das Fenster sichtbar
		frame.setVisible(true);

		//setzt die Fenstergroeße 200 x 200
		frame.setSize(200, 200);
		
		//wenn der Schließenbutton gedrückt wird, beendet sich nun auch das Java-Programm
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
