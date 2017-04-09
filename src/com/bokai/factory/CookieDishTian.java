package com.bokai.factory;

public class CookieDishTian {
	//菜名
	protected String dishName;
	protected String type;

	public CookieDishTian(String dishName) {
		this.dishName=dishName;
	}
	void add(){
		//添加菜名至运货菜单 取货
		System.out.println("init for carDishMenu add dishName:["+dishName+"]");
		//。。。
		
		
	}
	//核对整个货物数量
	void check(){
	System.out.println("check dishName:["+dishName+"]");
	}
	
	void ripped(){
		System.out.println("Ripped the package which contains the dish needed");
	}
}
