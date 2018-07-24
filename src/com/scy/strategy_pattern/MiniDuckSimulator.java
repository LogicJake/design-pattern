package com.scy.strategy_pattern;

import com.scy.strategy_pattern.duck.Duck;
import com.scy.strategy_pattern.duck.MallardDuck;
import com.scy.strategy_pattern.duck.ModelDuck;
import com.scy.strategy_pattern.fly.FlyRocketPowered;

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
