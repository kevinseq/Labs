/****************
Class: CSCI 185/504 Computer Programming II M07 (Graduate)
Term: Spring 2018
Lab Number: 9 
Professor Name: Dr.Wenji Li
Student Name: Kevin Sequeira
Date: 04/16/2018
****************/


import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class UpperAndLowerCaseConverter {

	public static void main(String[] args) {
		
		JFrame fr = new JFrame("Upper and Lower Case Converter");
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		
		JButton b1 = new JButton("Upper");
		JButton b2 = new JButton("Lower");
		JButton b3 = new JButton("Clear");
		
		JTextArea ta = new JTextArea();
		JLabel l = new JLabel("Characters to Convert:");
		JTextField f = new JTextField(40);
		
		Font buttonFont = new Font("SansSerif",Font.BOLD,16);
		Font textAreaFont = new Font("SansSerif",Font.BOLD,16);
		
		p1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		b1.setFont(buttonFont);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.ORANGE);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(f.getText().toUpperCase());
				f.setText("");
				f.requestFocus();
			}
		});
		b2.setFont(buttonFont);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.ORANGE);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(f.getText().toLowerCase());
				f.setText("");
				f.requestFocus();
			}
		});
		b3.setFont(buttonFont);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.ORANGE);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				f.setText("");
				f.requestFocus();
			}
		});
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		ta.setFont(textAreaFont);
		ta.setForeground(Color.BLUE);
		ta.setEditable(false);
		p2.add(ta);
		
		p3.setLayout(new FlowLayout(FlowLayout.LEFT));
		p3.add(l);
		p3.add(f);
		
		
		
		
		
		fr.setLayout(new BorderLayout());
		fr.add(p1,BorderLayout.NORTH);
		fr.add(p2,BorderLayout.CENTER);
		fr.add(p3,BorderLayout.SOUTH);
		
		fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fr.setSize(700,350);
		fr.setLocationRelativeTo(null);
		fr.setVisible(true);
		

	}

}
