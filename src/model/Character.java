package model;

public abstract class Character implements Fightable, Recoverable, Moveable {
	Position ChPos;
	protected int hp;
	protected boolean last_stage;
	protected int existRange;
	
	
	public void move(int a) {	//a값이 1이면 오른쪽으로, 2면 왼쪽으로 
		switch(a) {
		case 1 : this.ChPos.go(); break;
		case 2 : this.ChPos.back(); break;
		case 3 : if(last_stage) this.ChPos.up(); break;
		case 4 : if(last_stage) this.ChPos.down(); break;
		default : break;
		}
	}
	
	/*
	private int attackPower;
	 protected int xPos;
	//protected int yPos;
	private int recoveryRate;
	
	
	public int getAttackPower() {
		return attackPower;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getHp() {
		return hp;
	}

	public int getRecoveryRate() {
		return recoveryRate;
	}
	
	public void setRecoveryRate(int recoveryRate) {
		this.recoveryRate = recoveryRate;
	}
	
	@Override
	public void recover() {
		hp += recoveryRate;
	}

	@Override
	public void moveLeft() {
		this.setxPos(getxPos() - 1);
		
	}

	@Override
	public void moveRight() {
		this.setxPos(this.getxPos() + 1);
		
	}
	
	public void reduceHealth(int damage) {
		hp -= damage;
	}
	*/
	
}
// recover