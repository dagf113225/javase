package com.lixin.ch12;

import java.util.Iterator;
import java.util.Vector;

public class Test5
{
	public static void main(String[] args)
	{
		//实现List接口的一个实现子类
		//Vector底层也是采用数组实现的，有序可以重复
		Vector  v = new Vector();
		v.add(10);
		v.add(true);
		v.add("one");
		v.add(1);
		v.add(10);
		
		System.out.println(v.size());
		
		for(int i=0;i<v.size();i++)
		{
			System.out.println("元素为:"+v.get(i));
		}
		
		System.out.println("--------------");
		
		Iterator  its=v.iterator();
		
		
		while(its.hasNext())
		{
			System.out.println(its.next());
			
		}
		

	}
}
