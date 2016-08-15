package com.creational.builder;

public class VegPizza extends PizzaBuilder {

	@Override
	void addTopping() {
		pizza.setExtraTopping("Veg chops");
		
	}

	@Override
	void addBread() {
		pizza.setNonVeg(false);
		pizza.setVeg(true);
		
	}

	@Override
	void addCheese() {
		pizza.setCheese("Veg Cheese : Mother dairy");
		
	}

}
