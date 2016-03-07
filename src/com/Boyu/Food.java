package com.Boyu;

public class Food extends Goods{
/*
 * 食品类，需要称重
 */
	
	private double weight;
	public Food(String name,double price,String unit,String sort,String code){
		super(name,price,unit,sort,code);
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	

}
