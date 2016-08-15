package com.creational.builder;

public class Client {
	
	public static void main(String args[]) {
		
		Director director = new Director();
		
		PizzaBuilder pizzaBuilder = new VegPizza();
		
		director.setPizzaBuilder(pizzaBuilder);
		
		director.constructPizza();
		
		Pizza pizza = director.getPizza();
		
		System.out.println(" Ingredients of Pizza are ");
		
		System.out.println(pizza.getBread()+" "+ pizza.getCheese()+" "+ pizza.getExtraTopping()+" Is Non Veg "+
		pizza.isNonVeg()+" Is Veg "+ pizza.isVeg());
	}

}
