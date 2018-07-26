package com.scy.decorator.condiment;

import com.scy.decorator.coffee.Beverage;

public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	public double cost() {
		return .15 + beverage.cost();
	}
}
