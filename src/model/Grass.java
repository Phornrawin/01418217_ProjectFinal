package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Grass implements Drawable{
	
	public void draw(Graphics2D g){
		Rectangle grass = new Rectangle(0, 0, 800, 600);
		
		g.setColor(Color.decode("#7BEF75"));
		g.fill(grass);
		g.draw(grass);
	}

}
