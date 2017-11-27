package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.DrawingView;

public class StartBottonListener implements ActionListener{
	private DrawingView view;
	
	public StartBottonListener(DrawingView view) {
		// TODO Auto-generated constructor stub
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		view.setStatusOfBattle("Start");
		
	}

}
