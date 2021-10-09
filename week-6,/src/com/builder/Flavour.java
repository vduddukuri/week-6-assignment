package com.builder;

public class Flavour {
	String name;
	String material;
	
	public Flavour(String material) {
		this.name = "Flavour made out of " + material;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}

 
 
