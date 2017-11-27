package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

public class Road implements Drawable{
	
	public void draw(Graphics2D g){
		RoundRectangle2D road = new RoundRectangle2D.Double(50, 100, 700, 400, 60, 60);
		RoundRectangle2D grass = new RoundRectangle2D.Double(150, 200, 500, 200, 60, 60);
		
		g.setColor(Color.decode("#949C94"));
		g.fill(road);
		g.draw(road);
		g.setColor(Color.decode("#7BEF75"));
		g.fill(grass);
		g.draw(grass);
	}


}
