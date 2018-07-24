package com.scy.strategy_pattern.duck;

import com.scy.strategy_pattern.fly.FlyWithWings;
import com.scy.strategy_pattern.quack.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		// �ھ������ж���behavior�ľ���ʵ��
		// �� quackBehaviorʵ����ʱ�����Ĺ�������
		// �Ѽ̳�����quackBehaviorʵ��������ʼ����Quack���͵���ʵ��
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I��m a real Mallard duck");
	}
}
