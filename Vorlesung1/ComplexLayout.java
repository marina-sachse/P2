package Vorlesung1;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * Diese Klasse ComplexLayout ist ein Fenster in dem 3 Farben ausgew‰hlt und ein Text geschrieben werden kann.	 * 
 * @author Stephi
 *
 */
public class ComplexLayout extends JFrame {
		
	//Erzeuge die Komponenten
	private JPanel panel1 = new JPanel(); //Container fuer die RadioButton
	private JPanel panel2 = new JPanel(); //Container fuer das Label und das Textfeld
	private JRadioButton rbtn1 = new JRadioButton("red");
	private JRadioButton rbtn2 = new JRadioButton("green");
	private JRadioButton rbtn3 = new JRadioButton("blue");
	private JLabel label1 = new JLabel ("ein komplexes Layout");
	private JLabel label2 = new JLabel ("bitte Text eingeben");
	private JTextField txtField = new JTextField(25); //das Textfeld soll 25 Spalten (Characters) breit sein
	private ButtonGroup group = new ButtonGroup();
	
	/**
	 * ComplexLayout erzeugt ein Fenster mit einem komplexen Layout.
	 * An der linken Seite befinden sich 3 RadioButton zum W‰hlen der Farbe 
	 * und auf der rechten Seite des Fensters kann man einen Text eingeben.
	 * Viel Spaﬂ beim Ausprobieren!
	 */
	public ComplexLayout() {

		//zwei Layout zus‰tzlich und damit 2 Container
		panel1.setLayout(new GridLayout(3, 1));
		panel2.setLayout(new BorderLayout());
			
		//fuege die RadioButton zu einer Gruppe hinzu, damit nur einer zur Zeit ausgew‰hlt werden kann
		group.add(rbtn1);
		group.add(rbtn2);
		group.add(rbtn3);

		//feuge die RadioButton dem Panel1 hinzu
		panel1.add(rbtn1);
		panel1.add(rbtn2);
		panel1.add(rbtn3);

		//fuege das Label und das Textfeld dem Panel2 hinzu
		panel2.add(label2, BorderLayout.NORTH);
		panel2.add(txtField, BorderLayout.CENTER);
			
		//Ordne das Label mittig an
		label1.setHorizontalAlignment(JLabel.CENTER);
			
		//fuege das Label und die beiden Panel dem Fenster hinzu
		add (label1, BorderLayout.NORTH);
		add (panel1, BorderLayout.WEST);
		add (panel2, BorderLayout.EAST);
	}
		
	public static void main(String[] args) {
		ComplexLayout c = new ComplexLayout();
		c.setSize(400,200);
		c.setVisible(true);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
