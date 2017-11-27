package model;

import java.awt.Color;
import java.awt.Graphics2D;

public class Ambulance extends Vehicle{

	public Ambulance(int x, int y) {
		super(x, y, null);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics2D g2) {
		// TODO Auto-generated method stub
		g2.setColor(Color.BLUE); //light on the roof
		g2.fillOval(x +112, y+0, 22, 40);
		g2.setColor(Color.GRAY); //light on the roof
		g2.fillRect(x+110, y+19, 27, 5);
		
		int[] xPoints = { x + 0, x + 0, x + 8, x + 12, x + 32, x + 40, x + 48, x + 64, x + 68, x + 80, x + 88, x + 267,
				x + 276, x + 280, x + 288, x + 292, x + 292 };
		int[] yPoints = { y + 195, y + 160, y + 144, y + 128, y + 117, y + 112, y + 96, y + 56, y + 48, y + 32, y + 24,
				y + 24, y + 48, y + 56, y + 80, y + 96, y + 195 };
		int nPoints = xPoints.length;

		g2.setColor(Color.WHITE);
		g2.fillPolygon(xPoints, yPoints, nPoints); // body

		int[] xline = { x + 0, x + 40, x + 40, x + 0 };
		int[] yline = { y + 160, y + 160, y + 195, y + 195 };
		int nline = xline.length;

		int[] xline2 = { x + 280, x + 304, x + 304, x + 280 };
		int[] yline2 = { y + 160, y + 160, y + 195, y + 195 };
		int nline2 = xline2.length;

		g2.setColor(Color.GRAY); 
		g2.fillPolygon(xline, yline, nline); // line at front tie
		g2.fillPolygon(xline2, yline2, nline2); // line at back tie

		int[] xline3 = { x + 8, x + 16, x + 24, x + 292, x + 292 };
		int[] yline3 = { y + 136, y + 128, y + 123, y + 123, y + 136 };
		int nline3 = xline3.length;

		g2.setColor(Color.RED);
		g2.fillPolygon(xline3, yline3, nline3); // red line at the middle
		
		g2.setColor(Color.BLACK); //line o the roof
		g2.fillRoundRect(x + 68, x + 48, 209, 2, 1, 1);
		
		int[] xplus = { x + 227,x + 244,x + 244,x + 260,x + 260,x + 243,x + 243,x + 227,x + 227,x + 208,x + 208,x + 227 };
		int[] yplus = { y + 60,y + 60,y + 76,y + 76,y + 93,y + 93,y + 112,y + 112,y + 93,y + 93,y + 77,y + 77 };
		int nplus = xplus.length;

		g2.setColor(Color.RED);
		g2.fillPolygon(xplus, yplus, nplus); // red cross
		
		int[] xwindow = { x + 72,x + 120,x + 120,x + 51 };
		int[] ywindow = { y + 56,y + 56,y + 108,y + 108 };
		int nwindow = xwindow.length;
		
		g2.setColor(Color.LIGHT_GRAY);
		g2.fillRoundRect(x + 128, y + 56,56, 51, 10, 10);// window
		g2.fillPolygon(xwindow, ywindow, nwindow); //front window
		
		g2.setColor(Color.BLACK);
		g2.fillOval(x+32, y+152, 72, 72); //front tires
		g2.fillOval(x+200, y+152, 72, 72); //back tires
		
	}

}
