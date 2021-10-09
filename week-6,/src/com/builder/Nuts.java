package com.builder;

public class Nuts {
	String name;
	String material;
	
	public Nuts(String material) {
		this.name = "Nut made out of " + material;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}

 
 
