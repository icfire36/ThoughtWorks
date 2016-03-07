package com.Boyu;

import java.util.ArrayList;
import java.util.List;

public class GoodList {
	/*
	 * 货物清单
	 */
	
	public static List<Goods> getGoodList(){
	List<Goods> good=new ArrayList<Goods>();
	Goods coke=new Goods("可口可乐",3,"听","饮料","ITEM000001");
	Goods pepsi=new Goods("百事可乐",3,"听","饮料","ITEM000002");
	Goods sprite=new Goods("雪碧",3,"听","饮料","ITEM000003");
	Goods zero=new Goods("零度",3,"听","饮料","ITEM000004");
	Goods water=new Goods("农夫山泉",3,"瓶","饮料","ITEM000005");
	Goods pork=new Goods("里脊",20,"斤","食品","ITEM000006");
	Goods steak=new Goods("菲力牛排",40,"斤","食品","ITEM000007");
	Goods mutton=new Goods("羊排",30,"斤","食品","ITEM000008");
	Goods chicken=new Goods("烤鸡",10,"斤","食品","ITEM000009");
	Goods cod=new Goods("鳕鱼",30,"斤","食品","ITEM000010");
	Goods bike=new Goods("自行车",200,"辆","用品","ITEM000011");
	Goods basketball=new Goods("篮球",150,"个","用品","ITEM000012");
	Goods football=new Goods("足球",200,"个","用品","ITEM000013");
	Goods tennis=new Goods("网球",50,"个","用品","ITEM000014");
	Goods pingpang=new Goods("乒乓球",20,"个","用品","ITEM0000115");

	good.add(coke);
	good.add(pepsi);
	good.add(sprite);
	good.add(zero);
	good.add(water);
	good.add(pork);
	good.add(steak);
	good.add(mutton);
	good.add(chicken);
	good.add(cod);
	good.add(bike);
	good.add(basketball);
	good.add(football);
	good.add(tennis);
	good.add(pingpang);
	
	return good;
	}
}
