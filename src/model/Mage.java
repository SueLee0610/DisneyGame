package model;

import java.util.LinkedList;
import java.util.Random;

public class Mage extends Player {
	
	Random rand;
	boolean no_mp;
	
	private static Mage instance = null;
	/*
	private Mage() {
		super();
		this.setRecoveryRate(3); //TODO: these numbers should be changed
	}
	*/
	private Mage() {
		this.hp=80;
		this.mp=70;
		this.existRange=30;
		this.item = new LinkedList<Item>();
		this.weapon = new W_wand();
	}
	
	public synchronized static Mage getInstance() {
		if (instance == null)
			instance = new Mage();
		return instance;
	}
	
	public void attack(Character target) {
		super.attack(target);
		this.no_mp=false;
		this.RattackNoMp();
		if(!this.no_mp) this.mp-=20;
		
	}
	
	void RattackNoMp() {
		rand = new Random();
		if(rand.nextInt(100)<=10) no_mp=true;
	}
	
	/*
	@Override 
	public void attack(Character character, int damage) {
		if (character instanceof Enemy) {
			Random randomGenerator = new Random();
			int attackChooser = randomGenerator.nextInt(100); //Generate a random integer between 0 - 99
			if (attackChooser > 70) { //Should probably be changed.
				superAttack(character);
			}
			else
				normalAttack(character);
		}
		
	}
	
	private void normalAttack(Character enemy) {
		enemy.getAttacked(this, this.getAttackPower());
	}
	
	private void superAttack(Character enemy) {
		enemy.getAttacked(this, this.getAttackPower() * 2);
	}
	*/
}
