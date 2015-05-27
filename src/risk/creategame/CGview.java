package risk.creategame;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class CGview {
	JFrame frame = new JFrame();

		public CGview () {
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.setLayout(new FlowLayout(FlowLayout.CENTER));
			frame.setTitle("Stat Screen");
			frame.setResizable(false);
			frame.setVisible(true);
			frame.setSize(950,550);
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int width = (int) (screenSize.getWidth() / 8);
			int height = (int) (screenSize.getHeight() / 8);
			frame.setLocation(width, height);
		}
}
