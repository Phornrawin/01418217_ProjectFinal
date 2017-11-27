package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;

public class RacingCar extends Vehicle {
	private String direction;
	
	public RacingCar(int x, int y, Color c) {
		super(x, y, c);
		// TODO Auto-generated constructor stub
		direction = "RIGHT";
	}
	
	public void draw(Graphics2D g){
		if(direction.equals("RIGHT")){
			drawRight(g);
			
		}else if(direction.equals("UP")){
			drawUp(g);
			
		}else if(direction.equals("LEFT")){
			drawLeft(g);
			
		}else if(direction.equals("DOWN")){
			drawDown(g);
		}

		
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	public void drawRight(Graphics2D g){
		Rectangle shadow = new Rectangle(x-3, y-3, 66, 36);
		Rectangle body = new Rectangle(x, y, 60, 30);
		Rectangle bottomLight1 = new Rectangle(x, y, 5, 5);
		Rectangle bottomLight2 = new Rectangle(x, y+25, 5, 5);
		Rectangle headlight1 = new Rectangle(x+55, y, 5, 5);
		Rectangle headlight2 = new Rectangle(x+55, y+25, 5, 5);
		
		Polygon windshield1 = new Polygon();
		windshield1.addPoint(x+7, y+7);
		windshield1.addPoint(x+7, y+23);
		windshield1.addPoint(x+17, y+20);
		windshield1.addPoint(x+17, y+10);
		
		Polygon windshield2 = new Polygon();
		windshield2.addPoint(x+7, y+5);
		windshield2.addPoint(x+20, y+10);
		windshield2.addPoint(x+40, y+10);
		windshield2.addPoint(x+52, y+5);
		
		Polygon windshield3 = new Polygon();
		windshield3.addPoint(x+52, y+7);
		windshield3.addPoint(x+42, y+10);
		windshield3.addPoint(x+42, y+20);
		windshield3.addPoint(x+52, y+23);
		
		Polygon windshield4 = new Polygon();
		windshield4.addPoint(x+50, y+23);
		windshield4.addPoint(x+40, y+20);
		windshield4.addPoint(x+20, y+20);
		windshield4.addPoint(x+7, y+23);
		
		g.setColor(Color.BLACK);
		g.fill(shadow);
		g.draw(shadow);
		
		g.setColor(c);
		g.fill(body);
		g.draw(body);
		
		g.setColor(Color.red);
		g.fill(bottomLight1);
		g.fill(bottomLight2);
		g.draw(bottomLight1);
		g.draw(bottomLight2);
		
		g.setColor(Color.decode("#FCFA4F"));
		g.fill(headlight1);
		g.fill(headlight2);
		g.draw(headlight1);
		g.draw(headlight2);
		
		g.setColor(Color.BLACK);
		g.fill(windshield1);
		g.draw(windshield1);
		g.fill(windshield2);
		g.draw(windshield2);
		g.fill(windshield3);
		g.draw(windshield3);
		g.fill(windshield4);
		g.draw(windshield4);
	}
	
	public void drawUp(Graphics2D g){
		Rectangle shadow = new Rectangle(x-3, y-3, 36, 66);
		Rectangle body = new Rectangle(x, y, 30, 60);
		Rectangle headlight1 = new Rectangle(x, y, 5, 5);
		Rectangle headlight2 = new Rectangle(x+25, y, 5, 5);
		Rectangle bottomLight1 = new Rectangle(x, y+55, 5, 5);
		Rectangle bottomLight2 = new Rectangle(x+25, y+55, 5, 5);
		
		Polygon windshield1 = new Polygon();
		windshield1.addPoint(x+7, y+7);
		windshield1.addPoint(x+23, y+7);
		windshield1.addPoint(x+20, y+17);
		windshield1.addPoint(x+10, y+17);
		
		Polygon windshield2 = new Polygon();
		windshield2.addPoint(x+23, y+10);
		windshield2.addPoint(x+20, y+20);
		windshield2.addPoint(x+20, y+40);
		windshield2.addPoint(x+23, y+53);
		
		Polygon windshield3 = new Polygon();
		windshield3.addPoint(x+23, y+50);
		windshield3.addPoint(x+20, y+40);
		windshield3.addPoint(x+10, y+40);
		windshield3.addPoint(x+7, y+50);
		
		Polygon windshield4 = new Polygon();
		windshield4.addPoint(x+5, y+50);
		windshield4.addPoint(x+10, y+40);
		windshield4.addPoint(x+10, y+20);
		windshield4.addPoint(x+5, y+10);
		
		g.setColor(Color.BLACK);
		g.fill(shadow);
		g.draw(shadow);
		
		g.setColor(c);
		g.fill(body);
		g.draw(body);
		
		g.setColor(Color.red);
		g.fill(bottomLight1);
		g.fill(bottomLight2);
		g.draw(bottomLight1);
		g.draw(bottomLight2);
		
		g.setColor(Color.decode("#FCFA4F"));
		g.fill(headlight1);
		g.fill(headlight2);
		g.draw(headlight1);
		g.draw(headlight2);
		
		g.setColor(Color.BLACK);
		g.fill(windshield1);
		g.draw(windshield1);
		g.fill(windshield2);
		g.draw(windshield2);
		g.fill(windshield3);
		g.draw(windshield3);
		g.fill(windshield4);
		g.draw(windshield4);
	}
	public void drawLeft(Graphics2D g){
		Rectangle shadow = new Rectangle(x-3, y-3, 66, 36);
		Rectangle body = new Rectangle(x, y, 60, 30);
		Rectangle bottomLight1 = new Rectangle(x, y, 5, 5);
		Rectangle bottomLight2 = new Rectangle(x, y+25, 5, 5);
		Rectangle headlight1 = new Rectangle(x+55, y, 5, 5);
		Rectangle headlight2 = new Rectangle(x+55, y+25, 5, 5);
		
		Polygon windshield1 = new Polygon();
		windshield1.addPoint(x+7, y+7);
		windshield1.addPoint(x+7, y+23);
		windshield1.addPoint(x+17, y+20);
		windshield1.addPoint(x+17, y+10);
		
		Polygon windshield2 = new Polygon();
		windshield2.addPoint(x+7, y+5);
		windshield2.addPoint(x+20, y+10);
		windshield2.addPoint(x+40, y+10);
		windshield2.addPoint(x+52, y+5);
		
		Polygon windshield3 = new Polygon();
		windshield3.addPoint(x+52, y+7);
		windshield3.addPoint(x+42, y+10);
		windshield3.addPoint(x+42, y+20);
		windshield3.addPoint(x+52, y+23);
		
		Polygon windshield4 = new Polygon();
		windshield4.addPoint(x+50, y+23);
		windshield4.addPoint(x+40, y+20);
		windshield4.addPoint(x+20, y+20);
		windshield4.addPoint(x+7, y+23);
		
		g.setColor(Color.BLACK);
		g.fill(shadow);
		g.draw(shadow);
		
		g.setColor(c);
		g.fill(body);
		g.draw(body);
		
		g.setColor(Color.decode("#FCFA4F"));
		g.fill(bottomLight1);
		g.fill(bottomLight2);
		g.draw(bottomLight1);
		g.draw(bottomLight2);
		
		g.setColor(Color.RED);
		g.fill(headlight1);
		g.fill(headlight2);
		g.draw(headlight1);
		g.draw(headlight2);
		
		g.setColor(Color.BLACK);
		g.fill(windshield1);
		g.draw(windshield1);
		g.fill(windshield2);
		g.draw(windshield2);
		g.fill(windshield3);
		g.draw(windshield3);
		g.fill(windshield4);
		g.draw(windshield4);
	}
	public void drawDown(Graphics2D g){
		Rectangle shadow = new Rectangle(x-3, y-3, 36, 66);
			Rectangle body = new Rectangle(x, y, 30, 60);
			Rectangle headlight1 = new Rectangle(x, y, 5, 5);
			Rectangle headlight2 = new Rectangle(x+25, y, 5, 5);
			Rectangle bottomLight1 = new Rectangle(x, y+55, 5, 5);
			Rectangle bottomLight2 = new Rectangle(x+25, y+55, 5, 5);
			
			Polygon windshield1 = new Polygon();
			windshield1.addPoint(x+7, y+7);
			windshield1.addPoint(x+23, y+7);
			windshield1.addPoint(x+20, y+17);
			windshield1.addPoint(x+10, y+17);
			
			Polygon windshield2 = new Polygon();
			windshield2.addPoint(x+23, y+10);
			windshield2.addPoint(x+20, y+20);
			windshield2.addPoint(x+20, y+40);
			windshield2.addPoint(x+23, y+53);
			
			Polygon windshield3 = new Polygon();
			windshield3.addPoint(x+23, y+50);
			windshield3.addPoint(x+20, y+40);
			windshield3.addPoint(x+10, y+40);
			windshield3.addPoint(x+7, y+50);
			
			Polygon windshield4 = new Polygon();
			windshield4.addPoint(x+5, y+50);
			windshield4.addPoint(x+10, y+40);
			windshield4.addPoint(x+10, y+20);
			windshield4.addPoint(x+5, y+10);
			
			g.setColor(Color.BLACK);
			g.fill(shadow);
			g.draw(shadow);
			
			g.setColor(c);
			g.fill(body);
			g.draw(body);
			
			g.setColor(Color.decode("#FCFA4F"));
			g.fill(bottomLight1);
			g.fill(bottomLight2);
			g.draw(bottomLight1);
			g.draw(bottomLight2);
			
			g.setColor(Color.RED);
			g.fill(headlight1);
			g.fill(headlight2);
			g.draw(headlight1);
			g.draw(headlight2);
			
			g.setColor(Color.BLACK);
			g.fill(windshield1);
			g.draw(windshield1);
			g.fill(windshield2);
			g.draw(windshield2);
			g.fill(windshield3);
			g.draw(windshield3);
			g.fill(windshield4);
			g.draw(windshield4);
			
	}

	


}
