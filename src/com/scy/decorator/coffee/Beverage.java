package com.scy.decorator.coffee;

public abstract class Beverage {
	protected String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
