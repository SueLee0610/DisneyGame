package model;

public class Position {
	private int xPos;
	private int yPos;
	
	public Position(int xPos, int yPos){
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public int getxPos() {
		return xPos;
	}

	public int getyPos() {
		return yPos;
	}
	
	public void go(){
		this.xPos++;
	}
	
	public void back(){
		this.xPos--;
	}
	
	public void up(){
		this.yPos++;
	}
	
	public void down(){
		this.yPos--;
	}
}