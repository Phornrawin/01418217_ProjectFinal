package controller;

import java.util.Random;

import view.DrawingView;

public class SecondCarRunnable implements Runnable{
	private DrawingView view;
	
	public SecondCarRunnable(DrawingView view) {
		// TODO Auto-generated constructor stub
		this.view = view;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		while(true){
			int i = rand.nextInt(10);
			if(view.getStatusOfBattle().equals("Start")){
				System.out.println("in Method");
				int currentX = view.getMainCom().getCar2().getX();
				int currentY = view.getMainCom().getCar2().getY();
				System.out.println("X: " + currentX + "  Y: " + currentY);
				if((currentX >= 90 && currentX < 650) && (currentY >= 400 && currentY < 480)){
					System.out.println("RIGHT");
					view.getMainCom().getCar2().setDirection("RIGHT");
					view.getMainCom().getCar2().movePositionBy(i, 0);
				}else if((currentX >= 650 && currentX < 700) && (currentY >= 180 && currentY < 480)){
					System.out.println("UP");
					view.getMainCom().getCar2().movePositionBy(0, -(i));
					view.getMainCom().getCar2().setDirection("UP");
				}else if((currentX >= 100 && currentX < 700) && (currentY >= 150 && currentY < 200)){
					System.out.println("LEFT");
					view.getMainCom().getCar2().movePositionBy(-(i), 0);
					view.getMainCom().getCar2().setDirection("LEFT");
				}else if((currentX >= 90 && currentX < 150) && (currentY >= 150 && currentY < 450)){
					System.out.println("DOWN");
					view.getMainCom().getCar2().movePositionBy(0, i);
					view.getMainCom().getCar2().setDirection("DOWN");
				}
				view.getMainCom().repaint();
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(view.getStatusOfBattle().equals("Stop")){
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
