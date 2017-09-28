package Eins;

import java.awt.BorderLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AufgabeZwei extends JFrame{
	
	private int guess;
	
	public AufgabeZwei() {
		setTitle("Ratespiel");
		
		JButton right = new JButton("Stimmt's?");
		JButton number = new JButton("neue Zahl");
		JTextField tipp = new JTextField(10);
		JLabel answer = new JLabel("Rate eine Zahl zwischen 0 und 99");
		
		guess = (int)(Math.random()* 99);
		
		right.addActionListener(e-> {
			if(Integer.parseInt(tipp.getText()) == guess){
				answer.setText("Richtig");
			}
			
			else if(Integer.parseInt(tipp.getText()) < guess){
				answer.setText(tipp.getText() + " ist zu klein");
			}
			
			else{
				answer.setText(tipp.getText() + " ist zu groß");
			}
				
		});
		
		number.addActionListener(e-> {
			guess = (int)(Math.random()* 99);
		});
	
		add(answer, BorderLayout.NORTH);
		add(tipp, BorderLayout.WEST);
		add(right, BorderLayout.EAST);
		add(number, BorderLayout.SOUTH);
		
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AufgabeZwei();
	}

}
