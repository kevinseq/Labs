import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ImageScreen {
	//Instance variables
	String imgUrl = "";
	int imageNum;
	String date;
	String rover;
	JFrame frame = new JFrame("Image");
	int imageAmount;
	String[] images;
	
	/* Constructor:
	 * date > must be in yyyy-mm-dd
	 * rover > must be either "curiosity" or "opportunity"
	 * num > by default will be 0
	 */
	public ImageScreen(String date, String rover, int num) {
		this.imageNum = num;
		this.date = date;
		this.rover = rover;
		
		//Access the NASA API with the data inputted
		try {
			URL u = new URL("https://api.nasa.gov/mars-photos/api/v1/rovers/" + rover + "/photos?earth_date=" + date + "&api_key=4XRRGKAuzPjBPEPKcdkvnAjEa4kRSbFXY3NxnOf6");
			Scanner s = new Scanner(u.openStream());
			Object obj = new JSONParser().parse(s.nextLine());
			s.close();
			
			//Parsing JSONs
			JSONObject json = (JSONObject) obj;
			
			Object obj2 = new JSONParser().parse(json.get("photos").toString());
			JSONArray jarray = (JSONArray) obj2;
			
			imageAmount = jarray.size();
			
			images = new String[jarray.size()];
			for (int i = 0; i < jarray.size(); i++) {
				Object temp2 = new JSONParser().parse(jarray.get(i).toString());
				JSONObject j2 = (JSONObject) temp2;
				images[i] = j2.get("img_src").toString();
			}
			
		} catch (MalformedURLException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) { e.printStackTrace(); }
	}
	
	public void displayGUI() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CustomPanel image = new CustomPanel(images[imageNum]);
		
		//Generate buttons
		JButton button = new JButton("Previous");
		JButton button2 = new JButton("Next");
		JButton back = new JButton("Back");
		JButton quit = new JButton("Quit");
		JLabel label = new JLabel("");
		label.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 20));
		
		//Action listsners for each button
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				@SuppressWarnings("unused")
				SecondScreen sc = new SecondScreen();
			}
		});
		
		quit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (imageNum - 1 < 0) {
					JOptionPane.showMessageDialog(null, "This is the end of the album!");
					return;
				}
				
				//Frame needs to be regenerated each time
				imageNum -= 1;
				label.setText((imageNum + 1) + "/" + images.length);
				label.setForeground(Color.ORANGE);
				frame.setContentPane(new CustomPanel(images[imageNum]));
				frame.add(quit);
				frame.add(back);
				frame.add(button);
				frame.add(button2);
				frame.add(label);
				frame.pack();
				frame.setLocationRelativeTo(null);
			}
		});
		
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (imageNum + 1 >= images.length) {
					JOptionPane.showMessageDialog(null, "This is the end of the album!");
					return;
				}
				
				imageNum += 1;
				label.setText((imageNum + 1) + "/" + images.length);
				label.setForeground(Color.ORANGE);
				frame.setContentPane(new CustomPanel(images[imageNum]));
				frame.add(quit);
				frame.add(back);
				frame.add(button);
				frame.add(button2);
				frame.add(label);
				frame.pack();
				frame.setLocationRelativeTo(null);
			}
		});
		
		//First frame load
		label.setText((imageNum + 1) + "/" + images.length);
		label.setForeground(Color.ORANGE);
		frame.setContentPane(image);
		frame.add(quit);
		frame.add(back);
		frame.add(button);
		frame.add(button2);
		frame.add(label);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	@SuppressWarnings("serial")
	class CustomPanel extends JPanel {
		//Class that generates the image pane
		private BufferedImage customImage;
		
		public CustomPanel(String url) {
			setOpaque(true);
			setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
			
			try {
				customImage = ImageIO.read(new URL(url));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public Dimension getPreferredSize() {
			return new Dimension(customImage.getWidth(), customImage.getHeight());
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(customImage, 0, 0, this);
		}
	}
}
