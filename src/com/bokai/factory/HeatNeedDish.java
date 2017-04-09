package com.bokai.factory;

public class HeatNeedDish extends CookieDishTian {
	public HeatNeedDish(String dishName) {
		super(dishName);
		type="heat";
	}
	void heat(){
		System.out.println("Heat the Food:["+dishName+"[");
	}
	
}
