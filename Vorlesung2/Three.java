package Vorlesung2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.TextField;

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
		
	/*	btn1.addActionListener(new MyListener());
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				feld.setText("");
				
			}
		});   */
		
		btn1.addActionListener(new MyListener());
		
		btn2.addActionListener(var -> feld.setText(""));
		

	}
	
	class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (rbt1.isSelected()){
				System.out.println("plaid ist ausgewählt");
			}
			
			else if (rbt2.isSelected()){
				System.out.println("bold ist ausgewählt");
			}
			
			else if (rbt3.isSelected()){
				System.out.println("italic ist ausgewählt");
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		Three three = new Three ("Frame with many Components");
		three.setVisible(true);
		three.pack();
		three.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

