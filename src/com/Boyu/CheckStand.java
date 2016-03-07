package com.Boyu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CheckStand {
/*
 * ����̨
 */
	
	public CheckStand(){
		
	}
	
	public static List<String> getShopList() throws Exception{
		List<String> list=new ArrayList<String>();
		String path=System.getProperty("user.dir");
		String filePath=path+"/input/GoodList";
		BufferedReader reader=new BufferedReader(new FileReader(filePath));
		String nextLine;
		while((nextLine=reader.readLine())!=null){
			list.add(nextLine);
		}
		
		return list;
	}
	public List<Goods> getShopList(List<String> list){

		List<Goods> goodList=GoodList.getGoodList();

		List<Goods> shopList=new ArrayList<Goods>();

		for(int i=0;i<list.size();i++){

			if(list.get(i).length()>10){

				String[] array=new String[2];
				array=list.get(i).split("-");
				int weight=Integer.parseInt(array[1]);
				for(int j=0;j<goodList.size();j++){

					if(goodList.get(j).getCode().equals(array[0])){
						Goods item=goodList.get(j);
						item.setNumber(weight);
						shopList.add(item);

						
					}
				}
			}
			else{

				a:for(int j=0;j<goodList.size();j++){

					if(goodList.get(j).getCode().equals(list.get(i))){

						if(!shopList.isEmpty()){
							Iterator<Goods> it1=shopList.iterator();
						while(it1.hasNext()){
							Goods good=it1.next();

				             if(goodList.get(j).getCode().equals(good.getCode())){

				            	 good.setNumber(good.getNumber()+1);
				            	 continue a;
				             }				             
					        }
						}
						shopList.add(goodList.get(j));
				}
			}
		}
		}

		return shopList;
	}
	public static List<String> sale21()throws Exception{
		List<String> list=new ArrayList<String>();
		String path=System.getProperty("user.dir");
		String filePath=path+"/input/sale21";
		BufferedReader reader=new BufferedReader(new FileReader(filePath));
		String nextLine;
		while((nextLine=reader.readLine())!=null){
			list.add(nextLine);
		}
		return list;
	}
	public static List<String> sale95()throws Exception{
		List<String> list=new ArrayList<String>();
		String path=System.getProperty("user.dir");
		String filePath=path+"/input/sale95";
		BufferedReader reader=new BufferedReader(new FileReader(filePath));
		String nextLine;
		while((nextLine=reader.readLine())!=null){
			list.add(nextLine);
		}
		return list;
	}
	
	public static List<Goods> sale(List<Goods>list) throws Exception{
		
		Iterator<Goods>it1=list.iterator();
		while(it1.hasNext()){
			Goods good=it1.next();
			good.setTotalprice();
			for(int i=0;i<sale21().size();i++){
			if(good.getName().equals(sale21().get(i))){
				if(good.getNumber()>2){
				good.setSale21(true);
				good.setTotalprice();
				double original=good.getTotalprice();
				good.setNumber(good.getNumber()-(good.getNumber()/3));
				good.setTotalprice();
				good.setCheap(original-good.getTotalprice());
			}
			}
			}
			for(int i=0;i<sale95().size();i++){
			 if(good.getName().equals(sale95().get(i))&&!good.isSale21()){
				good.setSale95(true);
				good.setTotalprice();
				double original=good.getTotalprice();
				good.setTotalprice(good.getTotalprice()*0.95);
				good.setCheap(original-good.getTotalprice());
			}
			}	
		}
		return list;
		
	}
	public static void printShopList(List<Goods>list) throws Exception{
		sale(list);
		DecimalFormat df = new DecimalFormat("0.00");
		List<Goods>list21=new ArrayList<Goods>();
		double total=0;
		double cheap=0;
		System.out.println("***<ûǮ׬�̵�>�����嵥***");
		Iterator<Goods>it1=list.iterator();
		while(it1.hasNext()){
			Goods good=it1.next();
			if(good.isSale95()==false){
		    System.out.println("���ƣ�"+good.getName()+", ������"+good.getNumber()+good.getUnit()+", ���ۣ�"+good.getPrice()+
		    		           "(Ԫ)��С�ƣ�"+df.format(good.getTotalprice())+"(Ԫ)");
			}else{
				System.out.println("���ƣ�"+good.getName()+", ������"+good.getNumber()+good.getUnit()+", ���ۣ�"+good.getPrice()+
	    		           "(Ԫ)��С�ƣ�"+df.format(good.getTotalprice())+"(Ԫ), ��ʡ"+df.format(good.getCheap())+"(Ԫ)");
			}
		    total+=good.getTotalprice();
		    cheap+=good.getCheap();
		    if(good.isSale21()==true){
		    	list21.add(good);	
		    }
		}
		if(list21.isEmpty()==false){
			System.out.println("---------------------");
			System.out.println("�����һ��Ʒ��");
			Iterator<Goods>it2=list21.iterator();
			while(it2.hasNext()){
				Goods good=it2.next();
				if(good.getCheap()>0){
				System.out.println("���ƣ� "+good.getName()+", ������"+(int)good.getCheap()/good.getPrice()+good.getUnit());
				}
			}
		}
		System.out.println("-----------------------");
		System.out.println("�ܼ�: "+df.format(total)+"(Ԫ)");
		if(cheap>0){
			System.out.println("��ʡ�� "+df.format(cheap)+"(Ԫ)");
		}
		System.out.println("*******************");
	}
}
