package Aufgaben1;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JWindow;

public class Five extends JFrame {
	
	JPanel pnl1 = new JPanel();
	JPanel pnl2 = new JPanel();
	JPanel pnl3 = new JPanel();
	JLabel label1 = new JLabel("rot:");
	JLabel label2 = new JLabel("grün:");
	JLabel label3 = new JLabel("blau:");
	JTextField feld1 = new JTextField(5);
	JTextField feld2 = new JTextField(5);
	JTextField feld3 = new JTextField(5);
	JSlider sld1 = new JSlider();
	JSlider sld2 = new JSlider();
	JSlider sld3 = new JSlider();
	
	
	Five (String titel){
		super (titel);
		add(pnl1, BorderLayout.WEST);
		pnl1.setLayout(new BorderLayout());
		pnl1.add(label1, BorderLayout.NORTH);
		pnl1.add(label2, BorderLayout.CENTER);
		pnl1.add(label3, BorderLayout.SOUTH);
		add(pnl2, BorderLayout.CENTER);
		pnl2.setLayout(new BorderLayout());
		pnl2.add(sld1, BorderLayout.NORTH);
		pnl2.add(sld2, BorderLayout.CENTER);
		pnl2.add(sld3, BorderLayout.SOUTH);
		add(pnl3, BorderLayout.EAST);
		pnl3.setLayout(new BorderLayout());
		pnl3.add(feld1, BorderLayout.NORTH);
		feld1.setEditable(false);
		feld1.setBackground(Color.white);
		pnl3.add(feld2, BorderLayout.CENTER);
		feld2.setEditable(false);
		feld2.setBackground(Color.white);
		pnl3.add(feld3, BorderLayout.SOUTH);
		feld3.setEditable(false);
		feld3.setBackground(Color.white);
	}

	public static void main(String[] args) {
		
		Five five = new Five ("SliderDemo");
		five.setVisible(true);
		five.setSize(200, 200);
		five.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
