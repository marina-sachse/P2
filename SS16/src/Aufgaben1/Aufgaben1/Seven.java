package Aufgaben1;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Seven extends JFrame {
	
	JPanel pnl1 = new JPanel();
	JPanel pnl2 = new JPanel();
	JButton btn1 = new JButton("Ok");
	JButton btn2 = new JButton("Cancel");
	
	Seven (String titel){
		super (titel);
		add(pnl1, BorderLayout.CENTER);
		pnl1.setBackground(Color.yellow);
		add(pnl2, BorderLayout.SOUTH);
		pnl2.add(btn1);
		pnl2.add(btn2);
	}

	public static void main(String[] args) {
		
		Seven seven = new Seven ("BorderLayout");
		seven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		seven.setVisible(true);
		seven.setSize(200, 200);

	}

}
