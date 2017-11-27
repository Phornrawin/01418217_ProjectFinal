package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class MainComponent extends JComponent{
	private Grass grass;
	private Road road;
	private BillBoard dunlop, amsoil, bbr, fasst, motorex, underBoard, underBoard2;
	private ArrayList<BillBoard> boardList;
	private Ambulance ambulance;
	private RacingCar car1, car2;
	private CheerBoard redTeam, blueTeam;
	private ArrayList<Drawable> drawables;
	private ArrayList<BillBoard> underList;
	
	public MainComponent(){
		boardList = new ArrayList<>();
		drawables = new ArrayList<>();
		underList = new ArrayList<>();
		grass = new Grass();
		road = new Road();
		car1 = new RacingCar(120, 420, Color.decode("#258AEF"));
		car2 = new RacingCar(120, 460, Color.decode("#E74242"));
		ambulance = new Ambulance(220, 170);
		
		redTeam = new CheerBoard(200, 200, Color.decode("#E74242"), "RED TEAM สู้ๆ");
		blueTeam = new CheerBoard(400, 400, Color.decode("#258AEF"), "BLUE TEAM สู้ๆ");
		
		dunlop = new AboveRoadBoard(0, 0, 40, "DUNLOP", Color.decode("#FDFA29"));
		amsoil = new AboveRoadBoard(180, 0, 40, "AMSOIL", Color.red);
		bbr = new AboveRoadBoard(360, 0, 65, "BBR", Color.decode("#A8A8A5"));
		fasst = new AboveRoadBoard(540, 0, 45, "FASST", Color.black);
		motorex = new AboveRoadBoard(720, 0, 30, "MOTOREX", Color.GRAY);
		underBoard = new UnderRoadBoard(0, 505, 40, "Thailand circuit 2016", Color.BLACK);
		underBoard2 = new UnderRoadBoard(800, 505, 40, "Thailand circuit 2016", Color.BLACK);
		
		drawables.add(grass);
		drawables.add(road);
		drawables.add(car1);
		drawables.add(car2);
		drawables.add(ambulance);

		boardList.add(dunlop);
		boardList.add(amsoil);
		boardList.add(bbr);
		boardList.add(fasst);
		boardList.add(motorex);
		
		underList.add(underBoard);
		underList.add(underBoard2);
		
		drawables.addAll(boardList);
		drawables.addAll(underList);
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		for(Drawable d : drawables){
			d.draw(g2);
		}
	}
	public Grass getGrass() {
		return grass;
	}
	public Road getRoad() {
		return road;
	}
	public BillBoard getDunlop() {
		return dunlop;
	}
	public BillBoard getAmsoil() {
		return amsoil;
	}
	public BillBoard getBbr() {
		return bbr;
	}
	public BillBoard getFasst() {
		return fasst;
	}
	public BillBoard getMotorex() {
		return motorex;
	}
	public ArrayList<BillBoard> getBoardList() {
		return boardList;
	}
	public BillBoard getUnderBoard() {
		return underBoard;
	}
	public RacingCar getCar1() {
		return car1;
	}
	public void setCar1(RacingCar car1) {
		this.car1 = car1;
	}
	public RacingCar getCar2() {
		return car2;
	}
	public void setCar2(RacingCar car2) {
		this.car2 = car2;
	}
	public CheerBoard getRedTeam() {
		return redTeam;
	}
	public void setRedTeam(CheerBoard redTeam) {
		this.redTeam = redTeam;
	}
	public CheerBoard getBlueTeam() {
		return blueTeam;
	}
	public void setBlueTeam(CheerBoard blueTeam) {
		this.blueTeam = blueTeam;
	}
	public ArrayList<Drawable> getDrawables() {
		return drawables;
	}
	public void setDrawables(ArrayList<Drawable> drawables) {
		this.drawables = drawables;
	}
	public void setUnderBoard(BillBoard underBoard) {
		this.underBoard = underBoard;
	}
	public void setBoardList(ArrayList<BillBoard> boardList) {
		this.boardList = boardList;
	}
	public ArrayList<BillBoard> getUnderList() {
		return underList;
	}
	
	
	
	
	
	

}
