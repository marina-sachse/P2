package Vorlesung1;

import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;

public class MyFrame3 extends JFrame {
	
	private JCheckBox btn = new JCheckBox("do u like what u see");
	private JTree tree = new JTree();
	private JSpinner spinner = new JSpinner();
	private JRadioButton radiobutton = new JRadioButton("bitte ausmahlen");
	private JTable table = new JTable(10, 12);
	private JTextField txtf = new JTextField("Hier könnte dein text stehen, tralalalalalalala");
	private JEditorPane edpa = new JEditorPane();
	private JSlider sli = new JSlider(1, 500);
	private JLabel label = new JLabel("    Ein schöner Text");
	
	
	public MyFrame3(String title) {
		super(title);
		
		setLayout(new GridLayout(3, 3));
		add(btn);
		add(tree);
		add(sli);
		add(spinner);
		add(radiobutton);
		add(table);
		add(txtf);
		add(edpa);
		
		add(label);
	}

}

