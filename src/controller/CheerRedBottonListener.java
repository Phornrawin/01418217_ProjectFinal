package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import view.DrawingView;

public class CheerRedBottonListener implements ActionListener{
	private DrawingView view;
	
	public CheerRedBottonListener(DrawingView view) {
		// TODO Auto-generated constructor stub
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(view.getMainCom().getDrawables().contains(view.getMainCom().getRedTeam())){
			view.getMainCom().getDrawables().remove(view.getMainCom().getRedTeam());
			view.getMainCom().repaint();
		}else{
			view.getMainCom().getDrawables().add(view.getMainCom().getRedTeam());
			view.getMainCom().repaint();
		}
	}

}
