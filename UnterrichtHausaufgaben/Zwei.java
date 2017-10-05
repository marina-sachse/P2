package UnterrichtHausaufgaben;

import java.awt.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class Zwei extends JFrame{

	private static final String[] DATA = {"Blue", "Black", "Green", "Yellow", "Red", "Gray", "White", "Pink", "Orange"};
	
	public Zwei() {
		
		setTitle("Farben Auswählen");
		setLayout(new FlowLayout());
		ArrayList<String> rightData = new ArrayList<>();
		
		JList<String> leftList = new JList<>(DATA);
		JButton copy = new JButton("copy");
		JList<String> rightList = new JList<>();
		JScrollPane leftPane = new JScrollPane(leftList);
		leftPane.setPreferredSize(new Dimension(70, 100));
		JScrollPane rightPane = new JScrollPane(rightList);
		rightPane.setPreferredSize(new Dimension(70, 100));
		
		copy.addActionListener(e-> {
			List<String> values = leftList.getSelectedValuesList();
			rightData.addAll(values);
			rightList.setListData(rightData.toArray(new String[0]));
		});
		
		add(leftPane);
		add(copy);
		add(rightPane);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Zwei();

	}

}

