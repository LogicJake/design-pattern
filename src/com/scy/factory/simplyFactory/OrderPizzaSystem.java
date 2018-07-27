package com.scy.factory.simplyFactory;

public class OrderPizzaSystem {
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(factory);
		pizzaStore.orderPizza("cheese");
	}
}
