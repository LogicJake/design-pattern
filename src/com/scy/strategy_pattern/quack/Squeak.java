package com.scy.strategy_pattern.quack;

public class Squeak implements QuackBehavior {
	
	@Override
	public void quack() {
		System.out.println("Squeak");	
	}	
}
