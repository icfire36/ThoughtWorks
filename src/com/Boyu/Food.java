package com.Boyu;

public class Food extends Goods{
/*
 * ʳƷ�࣬��Ҫ����
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
