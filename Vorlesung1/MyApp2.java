package Vorlesung1;

import javax.swing.JFrame;

public class MyApp2 {

	public static void main(String[] args){
		JFrame frame = new MyFrame3("Test");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

