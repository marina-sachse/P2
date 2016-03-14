package Aufgaben1;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout.Group;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Three extends JFrame {
	
	JPanel pnl1 = new JPanel();
	JPanel pnl2 = new JPanel();
	JPanel pnl3 = new JPanel();
	ButtonGroup group = new ButtonGroup();
	JTextField feld = new JTextField("enter Text hier");
	JButton btn1 = new JButton("Ok");
	JButton btn2 = new JButton("Cancel");
	JCheckBox box = new JCheckBox("ich stimme zu");
	JRadioButton rbt1 = new JRadioButton("plain");
	JRadioButton rbt2 = new JRadioButton("bolde");
	JRadioButton rbt3 = new JRadioButton("italic");
	
	Three (String titel){
		super (titel);
		group.add(rbt1);
		group.add(rbt2);
		group.add(rbt3);
		add(pnl1, BorderLayout.NORTH);
		pnl1.add(feld);
		pnl1.add(box);
		add(pnl2, BorderLayout.CENTER);
		pnl2.add(rbt1);
		pnl2.add(rbt2);
		pnl2.add(rbt3);
		add(pnl3, BorderLayout.SOUTH);
		pnl3.add(btn1);
		pnl3.add(btn2);
	}

	public static void main(String[] args) {
		
		Three three = new Three ("Frame with many Components");
		three.setVisible(true);
		three.setSize(200, 200);
		three.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
