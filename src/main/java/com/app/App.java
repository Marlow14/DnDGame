package com.app;

import java.util.Scanner;

import com.ourCharacters.HumanWizard;
import com.ourCharacters.TurtleWizard;

public class App {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		HumanWizard ourHumanWizard = new HumanWizard();
		
		ourHumanWizard = ourHumanWizard.makeHumanWizard();
		
		System.out.println(ourHumanWizard.getHealth());
		System.out.println(ourHumanWizard.getMagic());
		System.out.println(ourHumanWizard.getWeapon());
		System.out.println(ourHumanWizard.getName());
		
		boolean userInputCorrect = false;
		
		do {
			System.out.println("Welcome\n" + "play as:\n" + "1.Human Wizard\n" + "2.Elf Royal\n" + "3.Smurf Warrior\n"
					+ "4.Twi'lek Jedi\n" + "5.Turtle Ninja");
			String choice = sc.nextLine();
			switch (choice) {
			case "1":
				userInputCorrect = false;
				break;
			case "2":
				userInputCorrect = false;
				break;
			case "3":
				userInputCorrect = false;
				break;
			case "4":
				userInputCorrect = false;
				break;
			case "5":
				userInputCorrect = false;
				break;
			default:{
				userInputCorrect = true;
				System.out.println("Must enter numbers 1-5 only!");
				break;
				}
			}
		} while (userInputCorrect);
	
		
	}
	
}
