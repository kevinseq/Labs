


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UnitConverter {

	public static void main(String[] args) {
		
		//Creates a JFrame.
		JFrame fr = new JFrame("Measurement Unit Converter");
		
		//Creates a JPanel and a JLabel
		JPanel p1 = new JPanel();
		JLabel l1 = new JLabel("Measurement Unit Converter");
		
		//Creates another JPanel, JLabel, JTextField.
		JPanel p2 = new JPanel();
		JLabel l2 = new JLabel("Pounds:");
		JTextField f1 = new JTextField(5);
		JLabel l3 = new JLabel("Kg:");
		JTextField f2 = new JTextField(5);
		
		//Sets the foreground color of the f2 label to blue and makes it non editable.
		f2.setForeground(Color.BLUE);
		f2.setEditable(false);
		
		
	/*	Creates a JPanel.
		Creates a 2 JButton and adds an actionListener to both the JButton.*/
		JPanel p3 = new JPanel();
		JButton b1 = new JButton("Convert");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double text = Double.parseDouble(f1.getText());
				text = text * 0.453592;
				String strDouble = String.format("%.3f",text);
				f2.setText(strDouble);
				f1.requestFocus();
				
				
			}
		});
		
		JButton b2 = new JButton("Clear");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f1.setText("");
				f2.setText("");
				f1.requestFocus();
			}
		});
		
		//Adds the FlowLayout to the JPanel 1 and adds a JLabel to that JPanel.
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p1.add(l1);
		
		/*Creates a JPanel and adds a FlowLayout to it.
		Adds a GirdLayout to JPanel 2.
		Adds the JLabel and the JTextField to JPanel 2.
		Adds the JPanel 2 to JPanel 4.*/
		JPanel p4 = new JPanel();
		p4.setLayout(new FlowLayout(FlowLayout.CENTER));
		p2.setLayout(new GridLayout (2,2,0,2));
		p2.add(l2);
		p2.add(f1);
		p2.add(l3);
		p2.add(f2);
		p4.add(p2);
		
		/*Adds the FlowLayout to JPanel 3.
		Adds both the JButtons to JPanel 3.*/
		p3.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
		p3.add(b1);
		p3.add(b2);

		/*Adds the GridLayout to JFrame.
		Adds JPanel 1, 4 and 3 to the JFrame.*/
		fr.setLayout(new GridLayout(3,2,5,5));
		fr.add(p1);
		fr.add(p4);
		fr.add(p3);
		fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fr.setSize(300,350);
		fr.setLocationRelativeTo(null);
		fr.setVisible(true);
		

	}

}