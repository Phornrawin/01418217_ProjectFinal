package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.DrawingView;

public class CheerBlueBottonListener implements ActionListener{
	private DrawingView view;
	
	public CheerBlueBottonListener(DrawingView view) {
		// TODO Auto-generated constructor stub
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(view.getMainCom().getDrawables().contains(view.getMainCom().getBlueTeam())){
			view.getMainCom().getDrawables().remove(view.getMainCom().getBlueTeam());
			view.getMainCom().repaint();
		}else{
			view.getMainCom().getDrawables().add(view.getMainCom().getBlueTeam());
			view.getMainCom().repaint();
		}
	}

}
