package com.ourCharacters;

import com.app.Weapons.Weapon;
import com.interfaces.Jedi;
import com.parents.Twi_Lek;

public class TwiLekJedi extends Twi_Lek implements Jedi {
		
	public TwiLekJedi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TwiLekJedi(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 50);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 100);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.LIGHTSABER);
	}

	
}
