package com.Boyu;

import java.util.ArrayList;
import java.util.List;

public class GoodList {
	/*
	 * �����嵥
	 */
	
	public static List<Goods> getGoodList(){
	List<Goods> good=new ArrayList<Goods>();
	Goods coke=new Goods("�ɿڿ���",3,"��","����","ITEM000001");
	Goods pepsi=new Goods("���¿���",3,"��","����","ITEM000002");
	Goods sprite=new Goods("ѩ��",3,"��","����","ITEM000003");
	Goods zero=new Goods("���",3,"��","����","ITEM000004");
	Goods water=new Goods("ũ��ɽȪ",3,"ƿ","����","ITEM000005");
	Goods pork=new Goods("�Ｙ",20,"��","ʳƷ","ITEM000006");
	Goods steak=new Goods("����ţ��",40,"��","ʳƷ","ITEM000007");
	Goods mutton=new Goods("����",30,"��","ʳƷ","ITEM000008");
	Goods chicken=new Goods("����",10,"��","ʳƷ","ITEM000009");
	Goods cod=new Goods("����",30,"��","ʳƷ","ITEM000010");
	Goods bike=new Goods("���г�",200,"��","��Ʒ","ITEM000011");
	Goods basketball=new Goods("����",150,"��","��Ʒ","ITEM000012");
	Goods football=new Goods("����",200,"��","��Ʒ","ITEM000013");
	Goods tennis=new Goods("����",50,"��","��Ʒ","ITEM000014");
	Goods pingpang=new Goods("ƹ����",20,"��","��Ʒ","ITEM0000115");

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
