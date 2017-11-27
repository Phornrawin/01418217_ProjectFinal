package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.ReadMeBottonListener;
import model.MainComponent;

public class DrawingView extends JFrame{
	private JFrame frame;
	private MainComponent mainCom;
	private final int FRAME_WIDTH = 800;
	private final int FRAME_HEIGHT = 600;
	private JButton btnMove;
	private String statusOfBattle;
	private ControlPanel panel;
	private JOptionPane option;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem;
	
	
	public DrawingView() {
		frame = new JFrame(); 
		mainCom = new MainComponent();
		btnMove = new JButton("Move");
		statusOfBattle = "Stop";
		panel = new ControlPanel();
		panel.setVisible(true);
		panel.render();
		option = new JOptionPane();
		option.showMessageDialog(frame, "5810405185 Phornrawin Chitsoonthorn วิธีใช้อยู่ใน Read me นะคะ");
		createMenu();
	}
	
	public void initFrame (){
		Dimension d = new Dimension(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setSize(d);
		frame.getContentPane().setPreferredSize(d);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.add(mainCom);
		frame.add(panel, BorderLayout.SOUTH);
		frame.pack();
	}

	public JFrame getFrame() {
		return frame;
	}

	public MainComponent getMainCom() {
		return mainCom;
	}

	public int getFRAME_WIDTH() {
		return FRAME_WIDTH;
	}

	public int getFRAME_HEIGHT() {
		return FRAME_HEIGHT;
	}

	public JButton getBtnMove() {
		return btnMove;
	}

	public String getStatusOfBattle() {
		return statusOfBattle;
	}

	public void setStatusOfBattle(String statusOfBattle) {
		this.statusOfBattle = statusOfBattle;
	}

	public ControlPanel getPanel() {
		return panel;
	}
	public void createMenu(){
		menuBar = new JMenuBar();
		menu = new JMenu("Read Me");
		menuBar.add(menu);
		menuItem = new JMenuItem("suggestion");
		menu.add(menuItem);
		menuItem.addActionListener(new ReadMeBottonListener());
		frame.setJMenuBar(menuBar);
	}
	
	
	
	

}
