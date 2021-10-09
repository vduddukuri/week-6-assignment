package com.state.lawnmower.code;

import com.builder.ChocolateBoxBuilder;
import com.builder.BoxType;

public class WinnerState implements State {
	LawnMowerMachine lawnmowerMachine;
	ChocolateBoxBuilder CB = new ChocolateBoxBuilder();
 
    public WinnerState(LawnMowerMachine lawnmowerMachine) {
        this.lawnmowerMachine = lawnmowerMachine;
    }
    
	public void insertWorking() {
		System.out.println("Please wait, we're already giving you a LawnMower");
	}
 
	public void ejectWorking() {
		System.out.println("Please wait, we're already giving you a LawnMower");
	}
 
	public void turnGrass() {
		System.out.println("Turning again doesn't get you another lawnmower!");
	}
 
	public void rented() {
		lawnmowerMachine.releaseMower();
		if (lawnmowerMachine.getCount() == 0) {
			lawnmowerMachine.releaseMower();
			lawnmowerMachine.setState(lawnmowerMachine.getStartState());
		} else {
			lawnmowerMachine.releaseMower();
			System.out.println("YOU'RE A WINNER! You got Rewarded Chocolate Box for your working");
		    CB.addNuts();
			CB.addFlavours();
			CB.build();
			if (lawnmowerMachine.getCount() > 0) {
				lawnmowerMachine.setState(lawnmowerMachine.getNoWorkingState());
			} else {
            	System.out.println("worker out of Working!");
            	lawnmowerMachine.setState(lawnmowerMachine.getStartState());
			}
		}
	}
 
	
	public String toString() {
		return "Rewarded for your working, because YOU'RE A WINNER!";
	}
	
	
}
