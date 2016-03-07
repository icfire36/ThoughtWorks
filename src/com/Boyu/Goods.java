package com.Boyu;

public class Goods {
/*
 * ŒÔ∆∑¿‡
 */
	
	private String name;
	private double price;
	private String unit;
	private String sort;
	private String code;
	private int number=1;
	private double totalprice;
	private boolean sale21=false;
	private boolean sale95=false;
	private double cheap;
	public Goods(){
	}
	public Goods(String name,double price,String unit,String sort,String code){
		this.name=name;
		this.price=price;
		this.unit=unit;
		this.sort=sort;
		this.code=code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice() {
		this.totalprice = this.number*this.price;
	}
	public void setTotalprice(double i){
		this.totalprice=i;
	}
	public boolean isSale21() {
		return sale21;
	}
	public void setSale21(boolean sale21) {
		this.sale21 = sale21;
	}
	public boolean isSale95() {
		return sale95;
	}
	public void setSale95(boolean sale95) {
		this.sale95 = sale95;
	}
	public double getCheap() {
		return cheap;
	}
	public void setCheap(double cheap) {
		this.cheap = cheap;
	}

}
