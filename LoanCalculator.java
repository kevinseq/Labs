

/****************
  Class: CSCI 185/504 Computer Programming II M07 (Graduate)
  Term: Spring 2018
  Lab Number: 11 
  Professor Name: Dr.Wenji Li 
  Student Name: Khushbu D. Vyas, Kevin Sequeira
  Date: 04/24/2018
****************/

//Importing Packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculate {

		//Instance Variables
		Double annualInterestRate;
		Double numberOfYears;
		Double loanAmount;
		
	//Constructor
	public Calculate() {
		
		//First JPanel with a JLabel
		JPanel p1 = new JPanel();
		JLabel l = new JLabel("Enter Loan amount, Interest Rate and Year");
		p1.add(l);
	
		//Second JPanel with 5 JLabels and 5 JTextFields
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(0,2,20,5));
		JLabel l1 = new JLabel("Annual Interest Rate:");
		JLabel l2 = new JLabel("Number of Years:");
		JLabel l3 = new JLabel("Loan Amount:");
		JLabel l4 = new JLabel("Monthly Payment:");
		JLabel l5 = new JLabel("Total Payment: ");
		JTextField tf1 = new JTextField();
		JTextField tf2 = new JTextField();
		JTextField tf3 = new JTextField();
		JTextField tf4 = new JTextField();
		tf4.setEditable(false);
		JTextField tf5 = new JTextField();
		tf5.setEditable(false);
		p2.add(l1);
		p2.add(tf1);
		p2.add(l2);
		p2.add(tf2);
		p2.add(l3);
		p2.add(tf3);
		p2.add(l4);
		p2.add(tf4);
		p2.add(l5);
		p2.add(tf5);
		
		//Third JPanel with a Button
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton b3 = new JButton("Compute Payment");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					//Checks if any of the JTextField is empty
					if(tf1.getText().isEmpty() ||tf2.getText().isEmpty() || tf3.getText().isEmpty() ) {	
						throw new TextFieldIsEmptyException();
					} 
					
					//Checks if the input in any of the JTextField matches anything other than a digit
					else if(tf1.getText().matches("[^0-9]*") || tf2.getText().matches("[^0-9]*") || tf3.getText().matches("[^0-9]*")) {	
						throw new NotANumberException();
					} 
					
					//Calculating the monthly amount and the total amount
					annualInterestRate = Double.parseDouble(tf1.getText());
					annualInterestRate = annualInterestRate / 100;
					numberOfYears = Double.parseDouble(tf2.getText());
					loanAmount = Double.parseDouble(tf3.getText());
					Double fc = annualInterestRate * numberOfYears * loanAmount;
					Double tp = loanAmount + fc;
					Double mp = (tp / (numberOfYears * 12));
					String totalPayment = String.format("%.2f", tp);
					String monthlyPayment = String.format("%.2f", mp);
					
					//Checks if any of the JTextField is 0 or less than 0
					if(annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <=0) {
						throw new NegativeException();
					} else {
						tf4.setText(monthlyPayment);
						tf5.setText(totalPayment);
						tf1.requestFocus();
					}
				} 
				
				catch(TextFieldIsEmptyException c) {
					JOptionPane.showMessageDialog(null,c.getMessage());
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					tf4.setText("");
					tf5.setText("");
				}
				
				catch(NotANumberException b) {
					JOptionPane.showMessageDialog(null,b.getMessage());
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					tf4.setText("");
					tf5.setText("");
				}
			
				catch(NegativeException a) {
					JOptionPane.showMessageDialog(null,a.getMessage());
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					tf4.setText("");
					tf5.setText("");
				}
			}
		});
		p3.add(b3);

		//This is Creates the JFrame.
		JFrame fr = new JFrame("Loan Calculator");
		fr.add(p1,BorderLayout.NORTH);
		fr.add(p2,BorderLayout.CENTER);
		fr.add(p3,BorderLayout.SOUTH);
		fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fr.setSize(350,200);
		fr.setLocationRelativeTo(null);
		fr.setVisible(true);	
	}

	//Main Method
	public static void main(String[] args) {
		Calculate c = new Calculate();
	}
}

public class NegativeException extends Exception {

		public NegativeException() {
			super("Please enter a number greater than 0 for the Annual Interest Rate, Number Of Years and the Loan Amount!");
		}
}


public class NotANumberException extends Exception {
	
	public NotANumberException() {
		super("The input you entered is not a number, Please enter a number!");
	}
	
}


public class TextFieldIsEmptyException extends Exception {
	
	public TextFieldIsEmptyException() {
		super("One or more of the text field is empty. Please enter the Annual Interest Rate, Number of Years and Loan Amount!");
	}
	
}

