package com.scy.strategy_pattern.duck;

import com.scy.strategy_pattern.fly.FlyNoWay;
import com.scy.strategy_pattern.quack.Quack;

public class ModelDuck extends Duck{

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
