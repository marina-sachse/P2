package Eins;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AufgabeVier extends JFrame{
	
	public AufgabeVier() {
		
		setTitle("Farben Auswählen");
		setLayout(new FlowLayout());
		
		JList<String> select = new JList<>(new String[]{"Blue", "Black", "Green", "Yellow", "Red", "Gray", "White"});
		JList<String> chosen = new JList<>();
		chosen.setPreferredSize(new Dimension(100, 120));
		JButton copy = new JButton("Copy >>");
		JScrollPane scroll = new JScrollPane(select);
		
		copy.addActionListener(e-> {
			chosen.setListData(select.getSelectedValuesList().toArray(new String[0]));
		});

		add(scroll);
		add(select);
		add(copy);
		add(chosen);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AufgabeVier();
	}

}
