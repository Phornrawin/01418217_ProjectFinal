package controller;

import java.util.ArrayList;

import model.BillBoard;
import view.DrawingView;

public class AboveBoardRunnable implements Runnable {
	private DrawingView view;
	
	public AboveBoardRunnable(DrawingView view) {
		// TODO Auto-generated constructor stub
		this.view = view;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ArrayList<BillBoard> boards = view.getMainCom().getBoardList();
		while(true){
			for(int i = 0; i < boards.size(); i++){
				int j = boards.get(i).getX();
				boards.get(i).setX(j-10);
				if (boards.get(i).getX() < -180){
					int x = (boards.size() - 1) * 180;
					boards.get(i).setX(x);
				}
			}
			view.getMainCom().repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
