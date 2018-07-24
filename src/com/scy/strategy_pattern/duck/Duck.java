package com.scy.strategy_pattern.duck;

import com.scy.strategy_pattern.fly.FlyBehavior;
import com.scy.strategy_pattern.quack.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public abstract void display();
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
