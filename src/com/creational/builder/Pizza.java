package com.creational.builder;

public class Pizza {
	
	private String bread;
	
	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getCheese() {
		return cheese;
	}

	public void setCheese(String cheese) {
		this.cheese = cheese;
	}

	private String cheese;
	
	private boolean veg;
	
	

	public String getExtraTopping() {
		return extraTopping;
	}

	public void setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
	}

	String extraTopping;
	
	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	public boolean isNonVeg() {
		return nonVeg;
	}

	public void setNonVeg(boolean nonVeg) {
		this.nonVeg = nonVeg;
	}

	boolean nonVeg;

}
