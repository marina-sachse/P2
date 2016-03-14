package Aufgaben1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Two extends JFrame {
	
	JButton btn1 = new JButton("North");
	JButton btn3 = new JButton("South");
	JButton btn2 = new JButton("East");
	JButton btn4 = new JButton("West");
	JButton btn5 = new JButton("Center");
	
	Two (String titel){
		super (titel);
		add(btn1, BorderLayout.NORTH);
		add(btn4, BorderLayout.WEST);
		add(btn5, BorderLayout.CENTER);
		add(btn2, BorderLayout.EAST);
		add(btn3, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {

		Two two = new Two("BorderLayout");
		two.setVisible(true);
		two.setSize(200, 200);
		two.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
