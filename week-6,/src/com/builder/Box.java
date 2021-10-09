package com.builder;

import java.util.ArrayList;
import java.util.List;

public class Box {
	String name;
	BoxType boxType;
	List<Nuts> nuts;
	List<Flavour> flavours;
	
	public Box() {
		this.nuts = new ArrayList<Nuts>();
		this.flavours = new ArrayList<Flavour>();
	}
	public Box setBoxType(BoxType BoxType) {
		this.boxType = BoxType;
		switch (boxType) {
			
			case CHOCOLATE: this.name = "My holiday chocolate box"; break;
		
		}
		return this;
	}

    Box addNuts(Nuts nut) {
		this.nuts.add(nut);
		return this;
	}
	Box addFlavours(Flavour flavour) {
		this.flavours.add(flavour);
		return this;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		// Use a StringBuilder to build the string :-)
		// Like StringBuffer, but not synchronized
		StringBuilder display = new StringBuilder();
		display.append("---- " + this.name + " ----\n");
		for (Nuts nut : nuts) {
			display.append("--- " + nut.name + " ---\n");
		}
		for (Flavour flavour : flavours) {
			display.append("--- " + flavour.name + " ---\n");
		}
		return display.toString();
		
		// There is some difference of opinion about StringBuilder and whether it's using
		// the Builder pattern or not. Some say yes, some say no.
		// StringBuilder does not provide an abstract API with multiple subclasses for
		//   creating different representations (variations).
	}
}

 
 
