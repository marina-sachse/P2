package Augabe1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class three extends JFrame {
	
	JPanel north = new JPanel();
	JPanel south = new JPanel();
	JPanel center = new JPanel();
	JTextField feld = new JTextField("enter Text hier");
	JButton ok = new JButton("Ok");
	JButton cancel = new JButton("Cancel");
	JRadioButton rbd1 = new JRadioButton("plain");
	JRadioButton rbd2 = new JRadioButton("bolde");
	JRadioButton rbd3 = new JRadioButton("italic");
	JCheckBox cbox = new JCheckBox("ich stimme zu");
	ButtonGroup group = new ButtonGroup();
	
	three (String titel){
		super (titel);
		group.add(rbd1);
		group.add(rbd2);
		group.add(rbd3);
		add(north, BorderLayout.NORTH);
		north.setLayout(new FlowLayout());
		north.add(feld);
		north.add(cbox);
		add(south, BorderLayout.SOUTH);
		south.setLayout(new FlowLayout());
		south.add(ok);
		south.add(cancel);
		add(center, BorderLayout.CENTER);
		center.setLayout(new FlowLayout());
		center.add(rbd1);
		center.add(rbd2);
		center.add(rbd3);
	}
	
	public static void main(String [] args) {
		
		three window= new three ("Frame with many components");
		window.setSize(300, 150);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
