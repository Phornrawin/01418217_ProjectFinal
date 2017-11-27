package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class UnderRoadBoard extends BillBoard{
	private final int FRAME_WIDTH = 800;
	private final int FRAME_HEIGHT = 70;
	private final int BOARD_WIDTH = 790;
	private final int BOARD_HEIGHT = 60;
	

	public UnderRoadBoard(int x, int y, int sizeFont, String message, Color fontColor) {
		super(x, y, sizeFont, message, fontColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		Rectangle framebBoard = new Rectangle(x, y, FRAME_WIDTH, FRAME_HEIGHT);
		Rectangle board = new Rectangle(x+5, y+5, BOARD_WIDTH, BOARD_HEIGHT);
		
		super.drawBill(framebBoard, board, g);
		
	}


}
