package com.lixin.ch14;

import java.util.HashSet;
import java.util.Iterator;

public class Test
{
	
	public static void main(String[] args)
	{
		//Set�ӿں�List�ӿ�ͬ����Collection�ӿڵ��ӽӿ�
		
		//List�ӿ�:ArrayList LinkedList,Vector,Stack ���򣬿����ظ�
		//Set�ӿ�:HashSet,TreeSet  ���򣬲������ظ�
		
		HashSet  set = new HashSet();
		set.add(1);
		set.add("one");
		set.add(true);
		set.add(20.009);
		set.add(1);
		
		System.out.println(set.size());
		
		//set������õ���������
		Iterator its=set.iterator();
		
		
		while(its.hasNext())
		{
			System.out.println(its.next());
		}
		
	}

}
