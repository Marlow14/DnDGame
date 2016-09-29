package com.ourCharacters;

import com.app.Weapons.Weapon;
import com.interfaces.Warrior;
import com.parents.Smurf;

public class SmurfWarrior extends Smurf implements Warrior {
		
	public SmurfWarrior() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmurfWarrior(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 75);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 0);
		// TODO Auto-generated method stub
		
	}

}
