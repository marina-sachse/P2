package Vorlesung1;

import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.JTree;


public class Lala {

	
	public static void main(String[] args ) {
		JFrame frame = new JFrame("Huhu");
		frame.setSize(900, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//FlowLayout, alle Komponenten werden aneinander gereiht, wenn das Fenster groß genug ist
		frame.setLayout(new FlowLayout());
	
		
		//eine CheckBox ist ein Kästchen zum Anhaken
		JCheckBox CheckBoxTest = new JCheckBox(); 
		frame.add(CheckBoxTest, FlowLayout.LEFT);

		//Passwortfeld, das Passwort wird mit Punkten dargestellt. Die 20 stellt die Anzahl der Spalten dar
		JPasswordField PasswordFieldTest = new JPasswordField(20); 
		frame.add(PasswordFieldTest, FlowLayout.LEFT);
		
		//ColorChooser, zum Auswählen einer Farbe
		JColorChooser JColorChooserTest = new JColorChooser(); 
		frame.add(JColorChooserTest, FlowLayout.CENTER);
		
		//zum Scrollen
		JScrollBar JScrollBarTest = new JScrollBar(); 
		frame.add(JScrollBarTest, FlowLayout.LEFT);
		
		//werden Radiobutten einer Gruppe hinzugefügt, kann nur einer ausgewählt werden
		JRadioButton JRadioButtonTest = new JRadioButton(); 
		frame.add(JRadioButtonTest, FlowLayout.LEFT);
		
		//Fortschrittsanzeige
		JProgressBar JProgressBarTest = new JProgressBar(); 
		frame.add(JProgressBarTest, FlowLayout.LEFT);
		
		//Pfeiltasten zum Inkrementieren (Erhöhen) und Dekrementieren (Verkleinern) eines Wertes
		JSpinner JSpinnerTest = new JSpinner(); 
		frame.add(JSpinnerTest, FlowLayout.LEFT);
		
		//zeigt ein Baum mit Elementen an
		JTree JTreeTest = new JTree(); 
		frame.add(JTreeTest, FlowLayout.LEFT);
		
		frame.setVisible(true);
	}
}
