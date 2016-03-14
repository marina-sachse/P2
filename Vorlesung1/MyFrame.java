package Vorlesung1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Diese Klasse ist ein JFrame, das beim Erzeugen ein Button namens "Click Me" erstellt
 * 
 * @author Stephi
 *
 */
public class MyFrame extends JFrame {

	//Button mit der Aufschrift "Click Me"
	private JButton btn = new JButton("Click Me");

	/**
	 * Dieser Konstrutor setzt das FlowLayout und fuegt einen Button hinzu
	 * 
	 * @param title Titel des Fensters
	 */
	public MyFrame(String title) {
		super (title); //uebergebe der Superklasse JFrame den Titel
		
		//setze das Layout
		setLayout(new FlowLayout());
		
		add (btn);
		
		
	}
}
