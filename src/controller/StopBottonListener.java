package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.DrawingView;

public class StopBottonListener implements ActionListener{
	private DrawingView view;
	
	public StopBottonListener(DrawingView view) {
		// TODO Auto-generated constructor stub
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		view.setStatusOfBattle("Stop");
		view.getMainCom().getCar1().setX(120);
		view.getMainCom().getCar1().setY(420);
		view.getMainCom().getCar2().setX(120);
		view.getMainCom().getCar2().setY(460);
		view.getMainCom().repaint();
		
	}

}
