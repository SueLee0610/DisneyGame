package model;

public class Obstacle {
	
	Position ObPos;
	protected int dec_hp;
	
	public Obstacle(int xPos, int yPos){
		ObPos = new Position(xPos, yPos);
	}
	
	public int getHpDecrease(){
		return this.dec_hp;
	}
	
	/*
	public int getxPos() {
		return xPos;
	}

	public int getyPos() {
		return yPos;
	}
	*/

}
