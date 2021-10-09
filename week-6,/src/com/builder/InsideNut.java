package com.builder;

public class InsideNut extends Nuts {
	String name;
	String material;
	
	public InsideNut(String material) {
		super(material);
		this.name = "Inside Nut made out of " + material;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}

 
 
