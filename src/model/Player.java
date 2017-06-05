package model;

import java.util.LinkedList;

public abstract class Player extends Character {
	
	protected int mp;
	protected Weapon weapon;
	protected LinkedList<Item> item;
	
	
	public void use_item(Item item) {
		super.hp += item.increase_hp();
		this.mp += item.increase_mp();
		//item�� ���� ��� �߰�
	}
	 
	public void attack(Character target){
		target.hurt(this.weapon.power);
	}
	/*
	@Override
	public void getAttacked(Character character, int damage) {
		if (character instanceof Enemy) {
			this.reduceHealth(damage);
		}
	} //obstacle ��� �߰� 
	*/
	
	public void hurt(int dec_hp){
		this.hp -= dec_hp;
	}
}
