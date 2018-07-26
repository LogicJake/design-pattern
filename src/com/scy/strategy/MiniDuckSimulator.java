package com.scy.strategy;

import com.scy.strategy.duck.Duck;
import com.scy.strategy.duck.MallardDuck;
import com.scy.strategy.duck.ModelDuck;
import com.scy.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
