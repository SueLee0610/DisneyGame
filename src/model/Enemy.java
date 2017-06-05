package model;

public abstract class Enemy extends Character {
	protected int power;
	
	@Override
	public void recover() {
		// TODO Auto-generated method stub
		
	}
	
	public void tracePlayer(Player player) {
		if(!this.isPlayerExist(player)) {
			if(player.xPos>this.xPos) move(1);
			else move(2);
		}
	}
	
	private boolean isPlayerExist(Character player) {//player범위 내에 enemy가 있으면 true리턴, 없으면 false리턴 
		if((player.xPos-this.xPos)>player.existRange || (this.xPos-player.xPos)>player.existRange) return false;
		else return true;
	}

	@Override
	public void hurt(int dec_hp) {
		// TODO Auto-generated method stub
		this.hp-=dec_hp;
	}

	@Override
	public void attack(Character target) {
		// TODO Auto-generated method stub
		if(this.isPlayerExist(target)) target.hurt(this.power);
	}
	/*
	public boolean isPlayerInRange(Player player) {
		//TODO: implement this method
		return false;
	}
	*/
}
