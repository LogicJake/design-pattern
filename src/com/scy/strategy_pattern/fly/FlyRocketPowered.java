package com.scy.strategy_pattern.fly;

public class FlyRocketPowered implements FlyBehavior {
	
	@Override
	public void fly() {
		System.out.println("I¡¯m flying with a rocket!");
	}
}
