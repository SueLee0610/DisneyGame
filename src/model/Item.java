package model;

public abstract class Item {
	
	protected int inc_hp;
	protected int inc_mp;
	private boolean isItem;
	
	boolean isItem(){
		if(isItem) return true;
		else return false;
	}
	
	public int increase_hp() {
		this.isItem = false;
		return inc_hp;
	}
	
	public int increase_mp() {
		this.isItem = false;
		return inc_mp;
	}

}
//item�� �Դ� �� �ƴ϶� �������� �޴� ����