package com.parents;

public class Human extends CharacterClass {

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Human(int health, int magic, String name) {
		super(health, magic, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setHealth(int health) {
		// TODO Auto-generated method stub
		super.setHealth(health + 50);
	}

	@Override
	public void setMagic(int magic) {
		// TODO Auto-generated method stub
		super.setMagic(magic);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName("Ip");
	}
	
	

}
