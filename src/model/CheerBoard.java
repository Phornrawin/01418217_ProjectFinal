package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

public class CheerBoard extends ObjectOnRacecourse implements Drawable{
	private Color boardColor;
	private String messenge;
	
	public CheerBoard(int x, int y, Color c, String messenge){
		// TODO Auto-generated constructor stub
		super(x, y, c);
		this.boardColor = c;
		this.messenge = messenge;
	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(boardColor);
		g.setFont(new Font("SanSerif", Font.PLAIN, 40));
		g.drawString(messenge, x, y);
		
	}

}
