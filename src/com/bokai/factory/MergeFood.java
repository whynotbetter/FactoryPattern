package com.bokai.factory;

public class MergeFood extends CookieDishTian {
	public MergeFood(String dishName) {
		super(dishName);
		type="merge";
	}
	void merge(){
		System.out.println("merge food :["+dishName+"]");
	}
}
