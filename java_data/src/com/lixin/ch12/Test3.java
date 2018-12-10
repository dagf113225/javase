package com.lixin.ch12;

import java.util.Iterator;
import java.util.LinkedList;

public class Test3
{
	
	public static void main(String[] args)
	{
		
		LinkedList  list  = new LinkedList();
		
		for(int  i=0;i<=100000;i++)
		{
			list.add(0, i);
		}
		
		System.out.println("------------------");
		
		//开始时间的long
//		long  startTime=System.currentTimeMillis();
//		for(int  i=0;i<=100000;i++)
//		{
//		
//			list.get(i);
//		}
//		long  endTime=System.currentTimeMillis();
//		//查询的时间为:12033 传统for遍历
//		System.out.println("传统for遍历查询的时间为:"+(endTime-startTime));
		
		System.out.println("------------------");
		
		long  startTime=System.currentTimeMillis();
		
		Iterator  its=list.iterator();
		
		while(its.hasNext())
		{
			its.next();
		}
		
		long  endTime=System.currentTimeMillis();
		//查询采用迭代器遍历
		System.out.println("查询采用迭代器遍历为:"+(endTime-startTime));//2
	}

}
