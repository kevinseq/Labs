import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class SecondScreen extends JFrame {

	@SuppressWarnings("deprecation")
	public SecondScreen() {
		
		JFrame frame1 = new JFrame("Mars Rover");
		frame1.getContentPane().setBackground(Color.BLACK);
		frame1.setBounds(100, 100, 450, 300);
		frame1.setSize(877,529);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		frame1.setVisible(true);
		getContentPane().setLayout(null);
		
		JLabel lblMarsRover = new JLabel("Curiosity");
		lblMarsRover.setForeground(Color.ORANGE);
		lblMarsRover.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 20));
		lblMarsRover.setBounds(92, 48, 145, 16);
		frame1.getContentPane().add(lblMarsRover);
		
		JLabel lblMarsRover_1 = new JLabel("Opportunity");
		lblMarsRover_1.setForeground(Color.ORANGE);
		lblMarsRover_1.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 20));
		lblMarsRover_1.setBounds(347, 48, 145, 16);
		frame1.getContentPane().add(lblMarsRover_1);
		
		JLabel lblChooseTheDays = new JLabel("Choose the Days:");
		lblChooseTheDays.setForeground(Color.ORANGE);
		lblChooseTheDays.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 20));
		lblChooseTheDays.setBounds(602, 48, 193, 16);
		frame1.getContentPane().add(lblChooseTheDays);
		
		JTextPane txtpnAsjfnjfj = new JTextPane();
		txtpnAsjfnjfj.setDisabledTextColor(Color.RED);
		txtpnAsjfnjfj.setForeground(Color.GRAY);
		txtpnAsjfnjfj.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		txtpnAsjfnjfj.setBackground(Color.BLACK);
		txtpnAsjfnjfj.setToolTipText("Hello\nBYeby");
		txtpnAsjfnjfj.setText("- Launched: 11/26/2011 \n- Landed: 8/6/2012 \n- Traveled: 11mi/18km");
		txtpnAsjfnjfj.setBounds(92, 86, 220, 191);
		txtpnAsjfnjfj.setEditable(false);
		frame1.getContentPane().add(txtpnAsjfnjfj);
		
		JTextPane txtpnDateCreated = new JTextPane();
		txtpnDateCreated.setDisabledTextColor(Color.RED);
		txtpnDateCreated.setForeground(Color.GRAY);
		txtpnDateCreated.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		txtpnDateCreated.setText("- Launched: 7/7/2013 \n- Landed: 1/25/2003 \n- Traveled: 28mi/45km");
		txtpnDateCreated.setBackground(Color.BLACK);
		txtpnDateCreated.setBounds(347, 86, 169, 191);
		txtpnDateCreated.setEditable(false);
		frame1.getContentPane().add(txtpnDateCreated);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		rdbtnNewRadioButton.setBounds(129, 348, 57, 54);
		frame1.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setHorizontalAlignment(SwingConstants.CENTER);
		radioButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		radioButton.setBounds(393, 348, 57, 54);
		frame1.getContentPane().add(radioButton);
		
		ButtonGroup rovers = new ButtonGroup();
		rovers.add(rdbtnNewRadioButton);
		rovers.add(radioButton);
		
		//Gets the current date minus one
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -1);
		
		//Formats the date in the way the API needs
		JCheckBox rdbtnMonday = new JCheckBox((cal.getTime().getYear() + 1900) + "-" + (cal.getTime().getMonth() + 1) + "-" + (cal.getTime().getDate()));
		rdbtnMonday.setForeground(Color.ORANGE);
		rdbtnMonday.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		rdbtnMonday.setBounds(627, 97, 141, 15);
		frame1.getContentPane().add(rdbtnMonday);
		
		//Subtracts a day for each button
		cal.add(Calendar.DATE, -1);
		
		JCheckBox rdbtnNewRadioButton_1 = new JCheckBox((cal.getTime().getYear() + 1900) + "-" + (cal.getTime().getMonth() + 1) + "-" + (cal.getTime().getDate()));
		rdbtnNewRadioButton_1.setForeground(Color.ORANGE);
		rdbtnNewRadioButton_1.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBounds(627, 130, 141, 15);
		frame1.getContentPane().add(rdbtnNewRadioButton_1);
		
		cal.add(Calendar.DATE, -1);
		
		JCheckBox rdbtnNewRadioButton_2 = new JCheckBox((cal.getTime().getYear() + 1900) + "-" + (cal.getTime().getMonth() + 1) + "-" + (cal.getTime().getDate()));
		rdbtnNewRadioButton_2.setForeground(Color.ORANGE);
		rdbtnNewRadioButton_2.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		rdbtnNewRadioButton_2.setBounds(627, 163, 141, 15);
		frame1.getContentPane().add(rdbtnNewRadioButton_2);
		
		cal.add(Calendar.DATE, -1);
		
		JCheckBox rdbtnNewRadioButton_3 = new JCheckBox((cal.getTime().getYear() + 1900) + "-" + (cal.getTime().getMonth() + 1) + "-" + (cal.getTime().getDate()));
		rdbtnNewRadioButton_3.setForeground(Color.ORANGE);
		rdbtnNewRadioButton_3.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		rdbtnNewRadioButton_3.setBounds(627, 196, 141, 15);
		frame1.getContentPane().add(rdbtnNewRadioButton_3);

		cal.add(Calendar.DATE, -1);
		
		JCheckBox rdbtnNewRadioButton_4 = new JCheckBox((cal.getTime().getYear() + 1900) + "-" + (cal.getTime().getMonth() + 1) + "-" + (cal.getTime().getDate()));
		rdbtnNewRadioButton_4.setForeground(Color.ORANGE);
		rdbtnNewRadioButton_4.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		rdbtnNewRadioButton_4.setBounds(627, 229, 141, 15);
		frame1.getContentPane().add(rdbtnNewRadioButton_4);
		
		cal.add(Calendar.DATE, -1);
		
		JCheckBox rdbtnNewRadioButton_5 = new JCheckBox((cal.getTime().getYear() + 1900) + "-" + (cal.getTime().getMonth() + 1) + "-" + (cal.getTime().getDate()));
		rdbtnNewRadioButton_5.setForeground(Color.ORANGE);
		rdbtnNewRadioButton_5.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		rdbtnNewRadioButton_5.setBounds(627, 262, 141, 15);
		frame1.getContentPane().add(rdbtnNewRadioButton_5);
		
		cal.add(Calendar.DATE, -1);
		
		JCheckBox rdbtnNewRadioButton_6 = new JCheckBox((cal.getTime().getYear() + 1900) + "-" + (cal.getTime().getMonth() + 1) + "-" + (cal.getTime().getDate()));
		rdbtnNewRadioButton_6.setForeground(Color.ORANGE);
		rdbtnNewRadioButton_6.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		rdbtnNewRadioButton_6.setBounds(627, 295, 141, 15);
		frame1.getContentPane().add(rdbtnNewRadioButton_6);
		
		ButtonGroup days= new ButtonGroup();
		days.add(rdbtnNewRadioButton_6);
		days.add(rdbtnNewRadioButton_5);
		days.add(rdbtnNewRadioButton_4);
		days.add(rdbtnNewRadioButton_3);
		days.add(rdbtnNewRadioButton_2);
		days.add(rdbtnNewRadioButton_1);
		days.add(rdbtnMonday);

		
		JButton btnViewImages = new JButton("View Images");
		btnViewImages.setBorder(UIManager.getBorder("Button.border"));
		btnViewImages.setBackground(UIManager.getColor("Button.select"));
		btnViewImages.setForeground(Color.BLACK);
		btnViewImages.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 16));
		btnViewImages.setBounds(590, 439, 264, 43);
		frame1.getContentPane().add(btnViewImages);
		
		btnViewImages.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JCheckBox selection = new JCheckBox("Error");
				if (rdbtnMonday.isSelected()) {
					selection = rdbtnMonday;
				} else if (rdbtnNewRadioButton_1.isSelected()) {
					selection = rdbtnNewRadioButton_1;
				} else if (rdbtnNewRadioButton_2.isSelected()) {
					selection = rdbtnNewRadioButton_2;
				} else if (rdbtnNewRadioButton_3.isSelected()) {
					selection = rdbtnNewRadioButton_3;
				} else if (rdbtnNewRadioButton_4.isSelected()) {
					selection = rdbtnNewRadioButton_4;
				} else if (rdbtnNewRadioButton_5.isSelected()) {
					selection = rdbtnNewRadioButton_5;
				} else if (rdbtnNewRadioButton_6.isSelected()) {
					selection = rdbtnNewRadioButton_6;
				} else {
					JOptionPane.showMessageDialog(null, "You need to pick a date!");
					return;
				}
				
				String rover = "";
				if (rdbtnNewRadioButton.isSelected()) {
					rover = "curiosity";
				} else if (radioButton.isSelected()) {
					rover = "opportunity";
				} else {
					JOptionPane.showMessageDialog(null, "You need to pick a rover!");
					return;
				}
				
				
				frame1.setVisible(false);
				ImageScreen is = new ImageScreen(selection.getLabel(), rover, 0);
				is.displayGUI();
			}
		});
	}
}
