/*package risk.ui.views;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

import risk.player.player;

public class CGview {
	
	
	
	
	
	JFrame frame = new JFrame();

	public static JLabel text = new JLabel("Player name:");
	public static JTextField pname = new JTextField("", 20);
	public static JLabel attack = new JLabel("Attack");
	public static JLabel defence = new JLabel("Defence");
	public static JLabel agility = new JLabel("Agility");
	public static JLabel magic = new JLabel("Magic");
	public static JLabel range = new JLabel("Range");
	public static JLabel health = new JLabel("Health");

	JPanel namePanel = new JPanel();
	JPanel attackPanel = new JPanel();
	JPanel defencePanel = new JPanel();
	JPanel agilityPanel = new JPanel();
	JPanel magicPanel = new JPanel();
	JPanel rangePanel = new JPanel();
	JPanel healthPanel = new JPanel();
	JPanel charPanel = new JPanel();
	JPanel pointPanel = new JPanel();

	public CGview() {
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setTitle("Stat Screen");
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setSize(950, 550);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) (screenSize.getWidth() / 8);
		int height = (int) (screenSize.getHeight() / 8);
		frame.setLocation(width, height);

		
		
		 * NOTE: drawPanel and drawPanel(S) are two seperate things,
		 * should probably refactor this
		 
		
		
		// make infomation
		drawPanel();
		// draw it to panel
		drawPanels();
		frame.show();

	}

	public void drawPanel() {

		
		
		JLabel pointsavail = new JLabel(String.valueOf(player.POINTS));
		pointsavail.setBounds(40, 50, 80, 50);
		pointPanel.add(pointsavail);
		pointPanel.setBounds(50, 80, 50, 80);
		/////////////////////////////////////////////////////

		JButton INCATK = new JButton("+");
		JButton DECATK = new JButton("-");
		attackPanel.setBounds(100, 150, 200, 100);
		attackPanel.add(INCATK);
		attackPanel.add(attack);
		attackPanel.add(DECATK);
		//---
		JLabel ATKLVL = new JLabel(String.valueOf(player.START_STAT));
		ATKLVL.setBounds(200, 150, 200, 100);
		attackPanel.add(ATKLVL);

		// ////////////////////////////////////////////////
		JButton INCDEF = new JButton("+");
		defencePanel.setBounds(100, 250, 200, 100);
		JButton DECDEF = new JButton("-");
		defencePanel.add(INCDEF);
		defencePanel.add(defence);
		defencePanel.add(DECDEF);
		// ///////////////////////////////////////////////
		JButton INCAGI = new JButton("+");
		agilityPanel.setBounds(100, 350, 200, 100);
		JButton DECAGI = new JButton("-");
		agilityPanel.add(INCAGI);
		agilityPanel.add(agility);
		agilityPanel.add(DECAGI);
		// ////////////////////////////////////////////////
		JButton INCRNG = new JButton("+");
		rangePanel.setBounds(100, 450, 200, 100);
		JButton DECRNG = new JButton("-");
		rangePanel.add(INCRNG);
		rangePanel.add(range);
		rangePanel.add(DECRNG);
		///////////////////////////////////////////////////
		namePanel.add(text);
		text.setBounds(30, 20, 80, 50);
		namePanel.add(pname);
		pname.setBounds(190, 20, 100, 25);
		//pname.se()
		
		JButton submit = new JButton("Enter");
		namePanel.add(submit);
		submit.setBounds(50, 50, 50, 50);
		namePanel.setBounds(10, 10, 700, 100);
		/////////////////////////////////////////////////////
		
		
		

	}

	public void drawPanels() {
		frame.add(namePanel);
		frame.add(attackPanel);
		frame.add(defencePanel);
		frame.add(agilityPanel);
		frame.add(rangePanel);
		frame.add(charPanel);
		frame.add(pointPanel);
		frame.repaint();
	}

}
*/