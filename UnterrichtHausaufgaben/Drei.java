package UnterrichtHausaufgaben;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Drei extends JFrame{

	
	public Drei (){
		setTitle("Edit Massenger");
		
		Box box = Box.createVerticalBox();
		setContentPane(box);
		
		JTextArea textArea = new JTextArea(10, 10);
		JPanel mid = new JPanel();
		JPanel bottom = new JPanel();
		
		JLabel fontSizeLabel = new JLabel("Font Size");
		JSpinner fontSize = new JSpinner(new SpinnerNumberModel(12, 10, 20, 1));
		fontSize.addChangeListener(e-> {
			Integer test = 10;
			float number = (int)fontSize.getValue();
			Font font =	textArea.getFont().deriveFont(number);
			textArea.setFont(font);
		});

		
		JLabel fontTypeLable = new JLabel("Font Type");
		JCheckBox boldCheckBox = new JCheckBox("Bold");
		JCheckBox italicCheckBox = new JCheckBox("Italic");
		
		ChangeListener onCheckBoxChange = new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				int style = 0;
				if (boldCheckBox.isSelected()) {
					style += Font.BOLD;
				}
				if (italicCheckBox.isSelected()) {
					style += Font.ITALIC;
				}
				textArea.setFont(textArea.getFont().deriveFont(style));
				
			}
		};
		
		boldCheckBox.addChangeListener(onCheckBoxChange);
		italicCheckBox.addChangeListener(onCheckBoxChange);
		
		mid.add(fontSizeLabel);
		mid.add(fontSize);
		mid.add(fontTypeLable);
		mid.add(boldCheckBox);
		mid.add(italicCheckBox);
		
		JButton load = new JButton("Load");
		JButton save = new JButton("Save");
		
		bottom.add(load);
		bottom.add(save);
				
		box.add(textArea);
		box.add(mid);
		box.add(bottom);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	public static void main(String[] args) {
		new Drei();
	}
}
