package com.builder;


public abstract class BoxBuilder {
	String builderName;
	BoxType boxType;
	Box box = new Box();
	
	public void setBoxType(BoxType boxType) {
		this.boxType = boxType;
		box.setBoxType(boxType);
	}
	// Each method in the Builder returns the Builder so we can use the Fluent Interface Pattern
	public abstract BoxBuilder addNuts();
	public abstract BoxBuilder addFlavours();

	public Box build() {
		System.out.println("Build the Box!");
		
		return box;
	}
}