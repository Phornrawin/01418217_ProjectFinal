package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class AboveRoadBoard extends BillBoard{
	private final int FRAME_WIDTH = 180;
	private final int FRAME_HEIGHT = 70;
	private final int BOARD_WIDTH = 170;
	private final int BOARE_HEIGHT = 60;

	
	public AboveRoadBoard(int x, int y, int sizeFont, String message, Color fontColor) {
		super(x, y, sizeFont, message, fontColor);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		Rectangle frame = new Rectangle(x, y, FRAME_WIDTH, FRAME_HEIGHT);
		Rectangle inFrame = new Rectangle(x+5, y+5, BOARD_WIDTH, BOARE_HEIGHT);
		
		super.drawBill(frame, inFrame, g);
		
	}

	

}
