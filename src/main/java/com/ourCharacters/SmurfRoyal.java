package com.ourCharacters;

import com.app.Weapons.Weapon;
import com.interfaces.Royal;
import com.parents.Smurf;

public class SmurfRoyal extends Smurf implements Royal {
	
	

	public SmurfRoyal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmurfRoyal(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(health - 5);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 40);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.SCROLL);
	}
	
	

	
}
