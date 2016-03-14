package Aufgaben1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Four extends JFrame {
	
	JButton btn1 = new JButton("7");
	JButton btn2 = new JButton("8");
	JButton btn3 = new JButton("9");
	JButton btn4 = new JButton("/");	
	JButton btn5 = new JButton("4");
	JButton btn6 = new JButton("5");
	JButton btn7 = new JButton("6");
	JButton btn8 = new JButton("*");
	JButton btn9 = new JButton("1");
	JButton btn10 = new JButton("2");	
	JButton btn11 = new JButton("3");
	JButton btn12 = new JButton("-");
	JButton btn13 = new JButton("0");
	JButton btn14 = new JButton(".");
	JButton btn15 = new JButton("=");
	JButton btn16 = new JButton("+");
	
	Four (String titel){
		super (titel);
		setLayout(new GridLayout(4, 4));
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		add(btn10);
		add(btn11);
		add(btn12);
		add(btn13);
		add(btn14);
		add(btn15);
		add(btn16);
		
	}

	public static void main(String[] args) {
		
		Four four = new Four ("Calculator");
		four.setVisible(true);
		four.setSize(200, 200);
		four.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
