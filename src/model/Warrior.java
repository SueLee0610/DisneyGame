package model;

import java.util.LinkedList;
import java.util.Random;

public class Warrior extends Player {
	
	Random rand;
	boolean gethurt;
	
	private static Warrior instance = null;
	/*
	private Warrior() {
		super();
		this.setRecoveryRate(5); //These numbers should probably be changed.
	}
	*/
	
	private Warrior() {
		this.hp=100;
		this.mp=50;
		this.existRange=10;
		this.item = new LinkedList<Item>();
		this.weapon = new W_knife();
	}
	
	public synchronized static Warrior getInstance() {
		if (instance == null) {
			instance = new Warrior();
		}
		return instance;
	}
	
	public void attack(Character target) {
		super.attack(target);
		this.mp-=10;
	}
	
	public void hurt(int dec_hp) {
		gethurt = true;
		this.Rshield();
		if(gethurt) super.hurt(dec_hp);
	}
	
	void Rshield() {
		rand = new Random();
		if(rand.nextInt(100)<=10) gethurt=false;
	}
	
	/*
	@Override
	public void attack(Character character, int damage) {
		if (character instanceof Enemy) {
			normalAttack(character);
		}
		
	}
	
	@Override
	public void getAttacked(Character character, int damage) {
		if (character instanceof Enemy) {
			if (!deflectsAttack()) {
				this.reduceHealth(damage);
			}
		}
	}
	
	private void normalAttack(Character enemy) {
		enemy.getAttacked(this, this.getAttackPower());
	}
	
	private boolean deflectsAttack() {
		Random randomGenerator = new Random();
		int randInt = randomGenerator.nextInt(100);
		return randInt > Settings.WARRIOR_DEFLECTION_RATE_NUMBER; //if randInt bigger than 70, return true 
	}
	*/

}
