package com.lixin.ch20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 1.Map遍历
 *  2.泛型 
 *  3.Stack 4.Collections类 
 *  5.SPI SPI spi和rmi的整合
 * 
 * 6.线程的安全并发包 闭锁
 * 
 * 
 * @author lenovo
 * 
 */
public class Test
{
	public static void main(String[] args)
	{
       Map  maps = new HashMap();
       maps.put("1", "袁信莉");
       maps.put("one", "王启明");
       maps.put("data", 100);
       maps.put("flag", true);
       
       System.out.println("当个的遍历:"+maps.get("flag"));
       
       System.out.println("整体的循环遍历");
       
       //1.得到所有的键  keySet()
       Set  setKeys=maps.keySet();
       
       Iterator  its=setKeys.iterator();
       
       while(its.hasNext())
       {
    	   Object  key=its.next();
    	   
    	   System.out.println(key+"---->"+maps.get(key));
       }
       
       //2。得到键和值的视图
       System.out.println("-------------------------------------");
      Set  entryKeys=maps.entrySet();
       
       Iterator  its1=entryKeys.iterator();
       
       while(its1.hasNext())
       {
    	   Object  keyAndData=its1.next();
    	   
    	   //转换成一个Entry
    	   Entry entry =(Entry)keyAndData;
    	   
    	   System.out.println(entry.getKey()+"-->"+entry.getValue());
    	   
    	   //System.out.println(keyAndData);
       }
	}
}
