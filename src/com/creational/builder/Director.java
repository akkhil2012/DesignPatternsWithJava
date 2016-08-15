package com.creational.builder;

public class Director {
	
	
	PizzaBuilder pizzaBuilder;

/*	public PizzaBuilder getPizzaBuilder() {
		return pizzaBuilder;
	}*/

	public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}
	
	
	public Pizza getPizza(){
		return pizzaBuilder.getPizza();
	}
	
	public void constructPizza() {
		pizzaBuilder.createPizza();
		pizzaBuilder.addBread();
		pizzaBuilder.addCheese();
		pizzaBuilder.addTopping();
	}
	
	

}
