package com.lixin.ch20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 1.Map����
 *  2.���� 
 *  3.Stack 4.Collections�� 
 *  5.SPI SPI spi��rmi������
 * 
 * 6.�̵߳İ�ȫ������ ����
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
       maps.put("1", "Ԭ����");
       maps.put("one", "������");
       maps.put("data", 100);
       maps.put("flag", true);
       
       System.out.println("�����ı���:"+maps.get("flag"));
       
       System.out.println("�����ѭ������");
       
       //1.�õ����еļ�  keySet()
       Set  setKeys=maps.keySet();
       
       Iterator  its=setKeys.iterator();
       
       while(its.hasNext())
       {
    	   Object  key=its.next();
    	   
    	   System.out.println(key+"---->"+maps.get(key));
       }
       
       //2���õ�����ֵ����ͼ
       System.out.println("-------------------------------------");
      Set  entryKeys=maps.entrySet();
       
       Iterator  its1=entryKeys.iterator();
       
       while(its1.hasNext())
       {
    	   Object  keyAndData=its1.next();
    	   
    	   //ת����һ��Entry
    	   Entry entry =(Entry)keyAndData;
    	   
    	   System.out.println(entry.getKey()+"-->"+entry.getValue());
    	   
    	   //System.out.println(keyAndData);
       }
	}
}
