package Vorlesung1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Diese Klasse erstellt sechs Buttons (Knoepfe) und orndet sie in 2 Spalten und 3 Reihen an. 
 * Hierfuer wird das GridLayout verwendet.
 * 
 * @author Stephi
 *
 */
public class MyFrame2 extends JFrame {

	//6 Button, die von außen nicht sichtbar sind
	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private JButton btn3 = new JButton("3");
	private JButton btn4 = new JButton("4");
	private JButton btn5 = new JButton("5");
	private JButton btn6 = new JButton("6");
	
	/**
	 * Es wird fuer das Fenster das GridLayout gewaehlt, um sechs Button im 3 x 2 (Zeilen x Spalte) Gitter anzuordnen
	 * 
	 * @param title Der Titel ist der Titel des Fensters
	 */
	public MyFrame2(String title) {
		super (title);

		//setzt das GridLayout fuer 3 Zeilen und 2 Spalten
		setLayout(new GridLayout(3, 2));
		
		//Button hinzufügen
		add (btn1);
		add (btn2);
		add (btn3);
		add (btn4);
		add (btn5);
		add (btn6);
	}

	

}
