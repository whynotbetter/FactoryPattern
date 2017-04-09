package com.bokai.factory;

import org.junit.Test;

public class TianLaoShi {
	public static final String FAN_QIE_JI_DAN="番茄鸡蛋饭";
	public static final String BIAN_DOU_MIAN="扁豆面";
	
	public CookieDishTian callDish(String name){
		CookieDishTian dish=null;
		if (FAN_QIE_JI_DAN.equals(name)) {
			dish=new MergeFood(name);
		}
		if (BIAN_DOU_MIAN.equals(name)) {
			dish= new HeatNeedDish(name);
		}
		if (dish ==null) {
			System.out.println("No dish for you call :["+name+"]");
			return null;
		}
		dish.add();
		dish.check();
		dish.ripped();
		if (dish instanceof MergeFood) {
			((MergeFood) dish).merge();
		}
		if (dish instanceof HeatNeedDish) {
			((HeatNeedDish) dish).heat();
		}
		return dish;
	}
	
	@Test 
	public void testFactory(){
		CookieDishTian callDish = new TianLaoShi().callDish("番茄鸡蛋饭");
	}
}
