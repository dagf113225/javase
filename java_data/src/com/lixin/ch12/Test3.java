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
		
		//��ʼʱ���long
//		long  startTime=System.currentTimeMillis();
//		for(int  i=0;i<=100000;i++)
//		{
//		
//			list.get(i);
//		}
//		long  endTime=System.currentTimeMillis();
//		//��ѯ��ʱ��Ϊ:12033 ��ͳfor����
//		System.out.println("��ͳfor������ѯ��ʱ��Ϊ:"+(endTime-startTime));
		
		System.out.println("------------------");
		
		long  startTime=System.currentTimeMillis();
		
		Iterator  its=list.iterator();
		
		while(its.hasNext())
		{
			its.next();
		}
		
		long  endTime=System.currentTimeMillis();
		//��ѯ���õ���������
		System.out.println("��ѯ���õ���������Ϊ:"+(endTime-startTime));//2
	}

}
