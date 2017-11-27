package view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ReadMeFrame extends JFrame{
	private JFrame frame;
	private JTextArea area;
	private final int FRAME_WIDTH = 300;
	private final int FRAME_HEIGHT = 300;
	
	public ReadMeFrame(){
		area = new JTextArea();
		frame = new JFrame("READ ME!");
	}
	
	public void initFrame(){
		frame.setSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		frame.setVisible(true);
		frame.setResizable(false);
		area.setEditable(false);
		render();
		frame.pack();
	}
	public void render(){
		area.append("\"suggestion\"" + "\n");
		area.append("start button: This button is used to start the race." + "\n");
		area.append("stop button: This button is used for stopping the match and start a new tournament." + "\n");
		area.append("cheer RED button: This button is used for cheering for the Red Team." + "\n");
		area.append("cheer BLUE button: This button is used for cheering for the Blue Team." + "\n" + "\n");
		area.append("Provider: 5810405185 Phornrawin Chitsoonthorn" + "\n");
		frame.add(area);
	}

}
