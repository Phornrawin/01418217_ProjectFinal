package model;

import java.awt.Color;

public class ObjectOnRacecourse {
	protected int x;
	protected int y;
	protected Color c;
	
	public ObjectOnRacecourse(int x, int y, Color c) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.c = c;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getC() {
		return c;
	}

	public void setC(Color c) {
		this.c = c;
	}
	

}
