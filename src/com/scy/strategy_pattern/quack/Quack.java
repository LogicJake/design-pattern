package com.scy.strategy_pattern.quack;

public class Quack implements QuackBehavior {
	
	@Override
	public void quack() {
		System.out.println("Quack");	
	}
}
