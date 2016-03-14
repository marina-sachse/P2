package Vorlesung2;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.FutureTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class One extends JFrame {
	
	JLabel label = new JLabel("Bitte Text eingeben");
	JTextField feld = new JTextField(10);
	JButton btn1 = new JButton("Ok");
	JButton btn2 = new JButton("Cancel");
	JLabel check1 = new JLabel();
	
	//ActionListener
	
	
	One (String titel){
		super (titel);
		setLayout(new FlowLayout());
		add(label);
		add(feld);
		add(btn1);
		add(btn2);
		add(check1);
		check1.setVisible(false);
		

		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				check1.setVisible(true);					//Buten brauchen keine extra zuweisung das was passiert, das betätigen ist das event
				check1.setText("Abgesendet");
				feld.setText("");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				check1.setVisible(true);					//Buten brauchen keine extra zuweisung das was passiert, das betätigen ist das event
				check1.setText("Gelöscht");
				feld.setText("");
			}
		});
		
		feld.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
			
				check1.setVisible(false);					//Buten brauchen keine extra zuweisung das was passiert, das betätigen ist das event
			}
		});
		
	}
	


	public static void main(String[] args) {
		
		One one = new One("Fenster mit Texteingabe");
		one.setVisible(true);
		one.setSize(400, 400);
		one.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}	
}
