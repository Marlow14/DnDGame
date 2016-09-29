package com.parents;

public class CharacterClass {
	
	protected int health = 0;
	protected int magic = 0;
	protected String name = null;
	
	public CharacterClass(int health, int magic, String name) {
		super();
		this.health = health;
		this.magic = magic;
		this.name = name;
	}
	public CharacterClass() {
		super();
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMagic() {
		return magic;
	}
	public void setMagic(int magic) {
		this.magic = magic;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
