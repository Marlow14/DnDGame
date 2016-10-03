package com.app;

import java.util.Scanner;

import com.interfaces.StorylineInterfaces;

public class HumanWizardStory implements StorylineInterfaces {

	Scanner sc = new Scanner(System.in);
	@Override
	public void storyOne() {
		//Begin story here...
		System.out.println("Enter 1, 2, or 3 to choose a path:");
		// TODO Auto-generated method stub
		String input = sc.nextLine();
		switch (input) {
		case "1":
			choiceOne();
			break;
		case "2":
			choiceTwo();
			break;
		default:
			choiceThree();
			break;
		}
		
	}

	@Override
	public void choiceOne() {
		//Some more story here...
		// TODO Auto-generated method stub
		System.out.println("A or B");
		String input = sc.nextLine();
		switch (input.toLowerCase()) {
		case "a":
			choiceOneA();
			break;

		default:
			break;
		}
		
	}

	@Override
	public void choiceTwo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void choiceThree() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void choiceOneA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void choiceOneB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void choiceTwoA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void choiceTwoB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void choiceThreeA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void choiceThreeB() {
		// TODO Auto-generated method stub
		
	}

}
