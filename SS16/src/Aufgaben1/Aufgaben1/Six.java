package Aufgaben1;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Six extends JFrame{
	
	JPanel pnl = new JPanel();
	JButton btn1 = new JButton("Ok");
	
	Six (String titel){
		super (titel);
		add(pnl, BorderLayout.CENTER);
		pnl.setBackground(Color.yellow);
		add(btn1, BorderLayout.SOUTH);
	}
	
	public static void main (String [] args) {
		
		Six six = new Six("BorderLayout");
		six.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		six.setVisible(true);
		six.setSize(200, 200);
		
	}

}
