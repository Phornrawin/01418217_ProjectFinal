package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public abstract class BillBoard extends ObjectOnRacecourse implements Drawable{
	protected String message;
	protected int sizeFont;
	
	public BillBoard(int x, int y, int sizeFont, String message, Color c){
		super(x, y, c);
		this.sizeFont = sizeFont;
		this.message = message;
		
	}
	public abstract void draw(Graphics2D g);
	
	public void drawBill(Rectangle f, Rectangle i, Graphics2D g){
		g.setColor(Color.BLACK);
		g.fill(f);
		g.draw(f);
		
		g.setColor(Color.WHITE);
		g.fill(i);
		g.draw(i);
		
		g.setColor(c);
		g.setFont(new Font("SanSerif", Font.PLAIN, sizeFont));
		g.drawString(message, x+10, y+54);
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getSizeFont() {
		return sizeFont;
	}
	public void setSizeFont(int sizeFont) {
		this.sizeFont = sizeFont;
	}
	
	

}
