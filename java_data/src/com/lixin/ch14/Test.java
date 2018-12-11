package com.lixin.ch14;

import java.util.HashSet;
import java.util.Iterator;

public class Test
{
	
	public static void main(String[] args)
	{
		//Set接口和List接口同属于Collection接口的子接口
		
		//List接口:ArrayList LinkedList,Vector,Stack 有序，可以重复
		//Set接口:HashSet,TreeSet  无序，不可以重复
		
		HashSet  set = new HashSet();
		set.add(1);
		set.add("one");
		set.add(true);
		set.add(20.009);
		set.add(1);
		
		System.out.println(set.size());
		
		//set必须采用迭代器遍历
		Iterator its=set.iterator();
		
		
		while(its.hasNext())
		{
			System.out.println(its.next());
		}
		
	}

}
