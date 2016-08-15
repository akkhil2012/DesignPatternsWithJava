package com.creational.builder;

public abstract class PizzaBuilder {

	Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	public void createPizza() {
		pizza = new Pizza();
	}

	abstract void addTopping();

	abstract void addBread();

	abstract void addCheese();

}
