package Augabe1;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class first extends JFrame {

	JLabel label = new JLabel("Bitte Text eingeben");
	JTextField feld = new JTextField(20);
	JButton ok = new JButton("Ok");
	JButton cancel = new JButton("Cancel");
	first (String titel){		
		super(titel);
		setLayout(new FlowLayout());
		add(label,FlowLayout.LEFT);
		add(feld);
		add(ok);
		add(cancel);
	}
	
	public static void main(String [] args) {
	
		first window= new first ("Fenster mit Textfeld");
		window.setSize(400, 100);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
