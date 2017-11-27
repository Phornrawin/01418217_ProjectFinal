package controller;

import view.DrawingView;

public class DrawingController {
	DrawingView view = new DrawingView();
	
	public void startApplication (){
		
		view.initFrame();
		addActionBotton();
		
		Runnable[] runnable = {new AboveBoardRunnable(view), new UnderBoardRunnable(view), new FirstCarRunnable(view)
				, new SecondCarRunnable(view)};
		Thread[] ts = new Thread[runnable.length];
		for(int i=0; i < runnable.length; i++){
			ts[i] = new Thread(runnable[i]);
			ts[i].start();
		}
	}
	public void addActionBotton(){
		view.getPanel().getBtnReadMe().addActionListener(new ReadMeBottonListener());
		view.getPanel().getBtnStart().addActionListener(new StartBottonListener(view));
		view.getPanel().getBtnStop().addActionListener(new StopBottonListener(view));
		view.getPanel().getBtnCheerRedTeam().addActionListener(new CheerRedBottonListener(view));
		view.getPanel().getBtnCheerBlueTeam().addActionListener(new CheerBlueBottonListener(view));
	}

}
