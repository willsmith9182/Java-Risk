package risk.home;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;



import risk.creategame.CGmodel;
import risk.creategame.CGview;


public class Homeview extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JFrame frame = new JFrame();
	public static JPanel panel = new JPanel();
	public static JPanel pic = new JPanel();
	public static JButton newgame = new JButton("New Game");
	public static JButton continuegame = new JButton("Continue");
	public static JButton highscores = new JButton("Highscores");

	
	
	public Homeview(){
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setTitle("The Game");
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setSize(950,550);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) (screenSize.getWidth() / 8);
		int height = (int) (screenSize.getHeight() / 8);
		frame.setLocation(width, height);
		addButtons();
		
		newgame.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				frame.dispose();
				 CGview theView = new CGview();
				  CGmodel theModel = new CGmodel();
			}
		});
		
			try {
			 BufferedImage  img = ImageIO.read(new File("src/bg1.jpg")/*.getAbsoluteFile()*/);
			 JLabel piclabel = new JLabel(new ImageIcon(img));
			 pic.add(piclabel);
			} catch (IOException e) {
					e.printStackTrace();
					//will only fire if picture not located
			}
			
			frame.add(pic);
			frame.show();

			
}


	public static void addButtons() {
		panel.add(newgame);
		panel.add(continuegame);
		panel.add(highscores);
		
		frame.add(panel);
		
		
	}



}
	

