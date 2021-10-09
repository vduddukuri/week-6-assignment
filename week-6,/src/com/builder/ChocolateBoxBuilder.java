package com.builder;

public class ChocolateBoxBuilder extends BoxBuilder {
	int numNuts = 1;
	int numFlavours = 1;
	String flavourMaterial = "Milk";
	String nutsMaterial = "Chocolate";
	
	public ChocolateBoxBuilder() {
		this.builderName = "ChocolateBoxBuilder";
		setBoxType(BoxType.CHOCOLATE);
	}
	public BoxBuilder addNuts() {
		
		for (int i = 0; i < numNuts; i++) {
			System.out.println("Adding nut made out of " + nutsMaterial);
			box.addNuts(new Nuts(nutsMaterial));
		}
		return this;
	}
	public BoxBuilder addFlavours() {
		for (int i = 0; i < numFlavours; i++) {
			System.out.println("Adding flavour made out of " + flavourMaterial);
			box.addFlavours(new Flavour(flavourMaterial));
		}
		return this;
	}

	public Box build() {
		System.out.println("Mix everything together with Mixing");
		return box;
	}

}