package com.Boyu;


import java.util.List;

import net.sf.json.JSONArray;


public class Test {

	public static void main(String[] args) throws Exception {

		CheckStand check1=new CheckStand();

		List<Goods> list=check1.getShopList(CheckStand.getShopList());
		CheckStand.printShopList(list);

	}

}