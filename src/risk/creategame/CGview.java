package risk.creategame;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class CGview {
	JFrame frame = new JFrame();
			
    public static JLabel attack = new JLabel("Attack");
    public static JLabel defence = new JLabel("Defence");
    public static JLabel agility = new JLabel("Agility");
    public static JLabel magic = new JLabel("Magic");
    public static JLabel range = new JLabel("Range");
    public static JLabel health = new JLabel("Health");
    
    JPanel attackPanel = new JPanel();
    JPanel defencePanel = new JPanel();
    JPanel agilityPanel = new JPanel();
    JPanel magicPanel = new JPanel();
    JPanel rangePanel = new JPanel();
    JPanel healthPanel = new JPanel();
    

		public CGview () {
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.setLayout(null);
			frame.setTitle("Stat Screen");
			frame.setResizable(false);
			frame.setVisible(true);
			frame.setSize(950,550);
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int width = (int) (screenSize.getWidth() / 8);
			int height = (int) (screenSize.getHeight() / 8);
			frame.setLocation(width, height);
			
			
		
	        //make infomation
			drawPanel();
			//draw it to panel
			drawPanels();
			frame.show();
			
		}

	
		
		public void drawPanel() {
			
			int points = 5;
			
			JButton INCATK = new JButton("+");
			attackPanel.setBounds(100, 50, 100, 100);
			JButton DECATK = new JButton("-");
			attackPanel.add(attack);
			attackPanel.add(INCATK);
			attackPanel.add(DECATK);
			//////////////////////////////////////////////////
			JButton INCDEF = new JButton("+");
			defencePanel.setBounds(100, 150, 100, 100);
			JButton DECDEF = new JButton("-");
			defencePanel.add(defence);
			defencePanel.add(INCDEF);
			defencePanel.add(DECDEF);
			/////////////////////////////////////////////////
			JButton INCAGI = new JButton("+");
			agilityPanel.setBounds(100, 250, 100, 100);
			JButton DECAGI = new JButton("-");
			agilityPanel.add(agility);
			agilityPanel.add(INCAGI);
			agilityPanel.add(DECAGI);
			//////////////////////////////////////////////////
			JButton INCRNG = new JButton("+");
			rangePanel.setBounds(100, 350, 100, 100);
			JButton DECRNG = new JButton("-");
			rangePanel.add(range);
			rangePanel.add(INCRNG);
			rangePanel.add(DECRNG);
			
			
			
		}
		
		public void drawPanels(){
			frame.add(attackPanel);
			frame.add(defencePanel);
			frame.add(agilityPanel);
			frame.add(rangePanel);
			
			frame.repaint();
		}
		
		
}
