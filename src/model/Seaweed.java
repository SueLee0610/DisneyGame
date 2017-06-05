package model;

public class Seaweed extends Obstacle{
	
	public Seaweed(int xPos, int yPos){
		super(xPos, yPos);
		super.dec_hp = 1;
	}
}
