package model;

import java.util.LinkedList;
import java.util.Random;

public class Gunner extends Player {
	
	Random rand;
	boolean attack_two;
	
	private static Gunner instance = null;
	/*
	private Gunner () {
		super();
		this.setRecoveryRate(2); //TODO: these numbers should probably be changed
	}
	*/
	
	private Gunner() {
		this.hp=90;
		this.mp=60;
		this.existRange=20;
		this.item = new LinkedList<Item>();
		this.ChPos = new Position(3,4);
		this.weapon = new W_gun();
	}
	public synchronized static Gunner getInstance() {
		if (instance == null)
			instance = new Gunner();
		return instance;
	}
	
	public void attack(Character target) {
		super.attack(target);
		this.attack_two=false;
		if(this.attack_two) super.attack(target);
		this.mp-=15;
		
	}
	
	void RattackTwice() {
		rand = new Random();
		if(rand.nextInt(100)<=10) attack_two=true;
	}
	/*
	@Override
	public void attack(Character character, int damage) {
		if (character instanceof Enemy) {
			Random randomGenerator = new Random();
			int attackChooser = randomGenerator.nextInt(100); //Generate a random integer between 0 - 99
			if (attackChooser > Settings.GUNNER_SUPER_ATTACK_RATE_NUMBER) {
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
