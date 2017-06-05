package model;

public interface Fightable {
	void attack(Character target);
	void hurt(int dec_hp);
	
	/*
	public void attack(Character character, int damage);
	public void getAttacked(Character character, int damage);
	*/
}
