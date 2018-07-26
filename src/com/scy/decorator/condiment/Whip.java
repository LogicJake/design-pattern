package com.scy.decorator.condiment;

import com.scy.decorator.coffee.Beverage;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	public double cost() {
		return .10 + beverage.cost();
	}
}
