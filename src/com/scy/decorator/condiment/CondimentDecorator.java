package com.scy.decorator.condiment;

import com.scy.decorator.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
