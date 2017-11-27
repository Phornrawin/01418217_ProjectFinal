package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ReadMeFrame;

public class ReadMeBottonListener implements ActionListener{
	
	public ReadMeBottonListener() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ReadMeFrame frame = new ReadMeFrame();
		frame.initFrame();
	}

}
