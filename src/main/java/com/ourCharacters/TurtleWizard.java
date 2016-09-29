package com.ourCharacters;

import com.app.Weapons.Weapon;
import com.interfaces.Wizard;
import com.parents.Turtle;

public class TurtleWizard extends Turtle implements Wizard {
	
	

	public TurtleWizard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TurtleWizard(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 0);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 200);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.WAND);
	}

	

}
