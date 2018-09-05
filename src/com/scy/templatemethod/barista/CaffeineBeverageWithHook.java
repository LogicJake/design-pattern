package com.scy.templatemethod.barista;

public abstract class CaffeineBeverageWithHook {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	//钩子，默认加调料，但可由子类覆盖实现
	boolean customerWantsCondiments() {
		return true;
	}
}
