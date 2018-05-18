/*
	Name: Khushbu D. Vyas, Andrew Tscherne, Kevin Sequeira, Daniel Cadena
	Course No. and Section: CSCI 504 (Computer Programming II)
	Instructor Name: Dr.Wenjia Li
	Date: 05/07/2018
*/


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FirstScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstScreen window = new FirstScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Mars Rover");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(877,529);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblClickHereTo = new JLabel("Click Here To Start the Program");
		lblClickHereTo.setIcon(null);
		lblClickHereTo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				@SuppressWarnings("unused")
				SecondScreen sc = new SecondScreen();
				frame.setVisible(false);
				
			}
		});
		lblClickHereTo.setForeground(Color.ORANGE);
		lblClickHereTo.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 20));
		lblClickHereTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblClickHereTo.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblClickHereTo.setAlignmentY(Component.TOP_ALIGNMENT);
		lblClickHereTo.setBounds(6, 6, 865, 495);
		frame.getContentPane().add(lblClickHereTo);
	}
}
