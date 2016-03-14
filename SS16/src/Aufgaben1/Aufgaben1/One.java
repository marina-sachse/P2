package Aufgaben1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class One extends JFrame {
	
	JLabel label = new JLabel("Bitte Text eingeben");
	JTextField feld = new JTextField(20);
	JButton btn1 = new JButton("Ok");
	JButton btn2 = new JButton("Cancel");
	
	
	One (String titel){
		super (titel);
		setLayout(new FlowLayout());
		add(label);
		add(feld);
		add(btn1);
		add(btn2);
		
	}

	public static void main(String[] args) {
		
		One one = new One("Fenster mit Texteingabe");
		one.setVisible(true);
		one.setSize(100, 400);
		one.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
