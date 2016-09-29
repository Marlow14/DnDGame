package com.ourCharacters;

import com.app.Weapons.Weapon;
import com.interfaces.Warrior;
import com.parents.Twi_Lek;

public class Twi_LekWarrior extends Twi_Lek implements Warrior {
	
	public Twi_LekWarrior() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Twi_LekWarrior(int health, int magic, String name, Weapon weapon) {
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

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.MACE);
	}

	
	

}
