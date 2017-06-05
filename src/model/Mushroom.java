package model;

public class Mushroom extends Item{
	
	public Mushroom(int xPos, int yPos){
		super(xPos, yPos);
		super.inc_hp = 3;
		super.inc_mp = 8;
	}
}
