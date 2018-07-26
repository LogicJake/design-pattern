package com.scy.strategy.duck;

import com.scy.strategy.fly.FlyNoWay;
import com.scy.strategy.quack.Quack;

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
