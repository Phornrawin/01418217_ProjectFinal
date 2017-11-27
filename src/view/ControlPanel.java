package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ControlPanel extends JPanel{
	private JButton btnStart, btnStop, btnCheerRedTeam, btnCheerBlueTeam, btnReadMe;
	private JLabel name;
	
	public ControlPanel() {
		// TODO Auto-generated constructor stub
		btnStart = new JButton("Start");
		btnStop = new JButton("Stop");
		btnCheerBlueTeam = new JButton("Cheer Blue");
		btnCheerRedTeam = new JButton("Cheer Red");
		btnReadMe = new JButton("Read me");
		name = new JLabel("5810405185 Phornrawin Chitsoonthorn");
		
	}
	public void render(){
		add(btnReadMe);
		add(btnStart);
		add(btnStop);
		add(btnCheerBlueTeam);
		add(btnCheerRedTeam);
		
		
	}
	public JButton getBtnStart() {
		return btnStart;
	}
	public JButton getBtnStop() {
		return btnStop;
	}
	public JButton getBtnCheerRedTeam() {
		return btnCheerRedTeam;
	}
	public JButton getBtnCheerBlueTeam() {
		return btnCheerBlueTeam;
	}
	public JButton getBtnReadMe() {
		return btnReadMe;
	}
	

}
