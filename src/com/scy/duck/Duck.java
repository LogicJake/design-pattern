package com.scy.duck;

import com.scy.duck.fly.FlyBehavior;
import com.scy.duck.quack.QuackBehavior;

public class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void swim() {
		
	}
	
	public void display() {
		
	}
}
