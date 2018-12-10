package com.lixin.ch12;

import java.util.LinkedList;
import java.util.List;

public class Test2
{
	//�Ƚ�ArrayList��LinkedList����?�������׺в���
	public  void   addDatas(List  list)
	{
		
		//��ʼʱ���long
		long  startTime=System.currentTimeMillis();
		
		for(int  i=0;i<=100000;i++)
		{
			list.add(0, i);
		}
		
		////����ʱ���long
		long  endTime=System.currentTimeMillis();
		
		System.out.println("�����ʱ��Ϊ:"+(endTime-startTime));
	}
	
	public  void  queryDatas(List  list)
	{
		for(int  i=0;i<=100000;i++)
		{
			list.add(0, i);
		}
		
		//��ʼʱ���long
		long  startTime=System.currentTimeMillis();
		for(int  i=0;i<=100000;i++)
		{
		
			list.get(i);
		}
		long  endTime=System.currentTimeMillis();
		System.out.println("��ѯ��ʱ��Ϊ:"+(endTime-startTime));
	}
	
	public static void main(String[] args)
	{
		Test2  t = new Test2();
		
		//�����������ܵĶԱ�
		//t.addDatas(new ArrayList());//287����  1330����
		//t.addDatas(new LinkedList());//14
		
		//��ѯ�������ܵĶԱ�
		//t.queryDatas(new ArrayList());//0,1
		t.queryDatas(new LinkedList());//11792  112...
	}

}
