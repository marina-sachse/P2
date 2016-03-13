package Augabe1;

import java.awt.*;
import javax.swing.*;

public class two extends JFrame{
	
	JButton but1 = new JButton("North");
	JButton but2 = new JButton("East");
	JButton but3 = new JButton("South");
	JButton but4 = new JButton("West");
	JButton but5 = new JButton("Center");
	
	two (String titel){
		super (titel);
		add(but1, BorderLayout.NORTH);
		add(but2, BorderLayout.EAST);
		add(but3, BorderLayout.SOUTH);
		add(but4, BorderLayout.WEST);
		add(but5, BorderLayout.CENTER);
	}

	public static void main(String [] args) {
		
		two window= new two ("BorderLayout");
		window.setSize(400, 300);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

