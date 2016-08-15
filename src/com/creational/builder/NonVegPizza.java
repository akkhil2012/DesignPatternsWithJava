package com.creational.builder;

public class NonVegPizza extends PizzaBuilder{

	@Override
	void addTopping() {
		pizza.setExtraTopping("mutton chops");
		
	}

	@Override
	void addBread() {
		pizza.setNonVeg(true);
		pizza.setVeg(false);
	}

	@Override
	void addCheese() {
		pizza.setCheese("NonVeg Cheese Mix");
		
	}
	
	
	

}
