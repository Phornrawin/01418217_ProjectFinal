package model;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Vehicle extends ObjectOnRacecourse implements Drawable{
	
	public Vehicle(int x, int y, Color c){
		super(x, y, c);
	}

	@Override
	public abstract void draw(Graphics2D g);

	public void movePositionBy(int x, int y) {
		// TODO Auto-generated method stub
		this.setX(getX() + x);
		this.setY(getY() + y);
	}
	
	

}
