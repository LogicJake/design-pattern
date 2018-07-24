package com.scy.strategy_pattern.quack;

public class MuteQuack implements QuackBehavior {
	
	@Override
	public void quack() {
		System.out.println("<< Silence >>");	
	}
}
