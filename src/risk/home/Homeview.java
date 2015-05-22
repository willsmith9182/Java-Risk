package risk.home;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Homeview extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JFrame frame = new JFrame();
	public static JPanel panel = new JPanel();
	
	public Homeview(){
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setLocationRelativeTo(null);
		frame.setTitle("LOGIN");
		frame.setSize(1000,1000);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
//		try {
//			BufferedImage UoB = ImageIO.read(new File("src/bg1.png").getAbsoluteFile());
//			JLabel picLabel = new JLabel(new ImageIcon(UoB));
//			panel.add(picLabel);
//			}catch (Exception e){
//				e.printStackTrace();
//			}
		frame.add(panel);
	}
}
