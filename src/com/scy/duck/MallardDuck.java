package com.scy.duck;

import com.scy.duck.fly.FlyWithWings;
import com.scy.duck.quack.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		// 在具体类中定义behavior的具体实现
		// 当 quackBehavior实例化时，它的构造器会
		// 把继承来的quackBehavior实例变量初始化成Quack类型的新实例
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I’m a real Mallard duck");
	}
}
