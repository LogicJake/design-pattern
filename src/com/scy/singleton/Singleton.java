package com.scy.singleton;

public class Singleton {
	private volatile static Singleton uniqueInstance;
	
	private Singleton() {}
	
	//双重检查锁
	//实例化延迟
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
